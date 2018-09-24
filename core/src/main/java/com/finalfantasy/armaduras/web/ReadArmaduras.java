package com.finalfatasy.armaduras.web;
//Importaciones de sql
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.imageio.stream.IIOByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ReadArmaduras {
    //ArrayList para leer clases
    public ArrayList readarmaduras(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            rs = stmt.executeQuery("SELECT TIPO_ARMADURA, NOMBRE_ARMADURA, DEFENSA_ARMADURA, DEFENSA_MAGICA_ARMADURA, ESPECIAL_ARMADURA, PRECIO_ARMADURA FROM ARMADURAS");

            if (rs.next()) {
                rstt = new Armadura();

                //Las columnas que queremos ver
                rstt.setTipo_armadura(rs.getString("TIPO_ARMADURA"));
                rstt.setNombre_armadura(rs.getString("NOMBRE_ARMADURA"));
                rstt.setDefensa_armadura(rs.getString("DEFENSA_ARMADURA"));
                rstt.setDefensa_magica_armadura(rs.getString("DEFENSA_MAGICA_ARMADURA"));
                rstt.setEspecial_armadura(rs.getString("ESPECIAL_ARMADURA"));
                rstt.setPrecio_armadura(rs.getString("PRECIO_ARMADURA"));

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