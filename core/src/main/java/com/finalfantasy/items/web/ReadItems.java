package com.finalfatasy.items.web;
//Importaciones de sql
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.imageio.stream.IIOByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ReadItems {
    //ArrayList para leer clases
    public ArrayList readitems(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            rs = stmt.executeQuery("SELECT TIPO_ITEM, NOMBRE_ITEM, DESCRIPCION_ITEM, PRECIO_ITEM FROM ITEMS");

            if (rs.next()) {
                rstt = new Item();

                //Las columnas que queremos ver
                rstt.setTipo_item(rs.getString("TIPO_ITEM"));
                rstt.setNombre_item(rs.getString("NOMBRE_ITEM"));
                rstt.setDescripcion_item(rs.getString("DESCRIPCION_ITEM"));
                rstt.setPrecio_item(rs.getString("PRECIO_ITEM"));

                al.add(std);
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return al;
    }
}