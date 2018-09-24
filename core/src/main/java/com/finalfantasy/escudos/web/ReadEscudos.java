package com.finalfatasy.escudos.web;
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
    public ArrayList readescudos(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            rs = stmt.executeQuery("SELECT TIPO_ESCUDO, DEFENSA_ESCUDO, DEFENSA_MAGICA_ESCUDO, DESCRIPCION_ESCUDO, PRECIO_ESCUDO FROM ESCUDOS");

            if (rs.next()) {
                rstt = new Escudo();

                //Las columnas que queremos ver
                rstt.setTipo_escudo(rs.getString("TIPO_ESCUDO"));
				rstt.setDefensa_escudo(rs.getString("DEFENSA_ESCUDO");
				rstt.setDefensa_magica_escudo(rs.getString("DEFENSA_MAGICA_ESCUDO");
                rstt.setDescripcion_escudo(rs.getString("DESCRIPCION_ESCUDO"));
                rstt.setPrecio_escudo(rs.getString("PRECIO_ESCUDO"));

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