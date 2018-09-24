package com.finalfatasy.armas.web;
//Importaciones de sql
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.imageio.stream.IIOByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ReadArmas
    //ArrayList para leer clases
    public ArrayList readarmas(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            rs = stmt.executeQuery("SELECT TIPO_ARMA, NOMBRE_ARMA, AT_ARMA, DAMAGE_ARMA, DESCRIPCION_ARMA, PRECIO_ARMA FROM ARMAS");

            if (rs.next()) {
                rstt = new Arma();

                //Las columnas que queremos ver
                rstt.setTipo_arma(rs.getString("TIPO_ARMA"));
                rstt.setNombre_arma(rs.getString("NOMBRE_ARMA"));
				rstt.setAt_arma(rs.getString("AT_ARMA");
				rstt.setDamage_arma(rs.getString("DAMAGE_ARMA");
                rstt.setDescripcion_arma(rs.getString("DESCRIPCION_ARMA"));
                rstt.setPrecio_arma(rs.getString("PRECIO_ARMA"));

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