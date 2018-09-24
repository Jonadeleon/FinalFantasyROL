package com.finalfatasy.materias.web;
//Importaciones de sql
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.imageio.stream.IIOByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ReadMaterias {
    //ArrayList para leer clases
    public ArrayList readmaterias(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            rs = stmt.executeQuery("SELECT COLOR_MATERIA, NOMBRE_MATERIA, DESCRIPCION_MATERIA, NIVEL_MATERIA, PRECIO_MATERIA FROM MATERIAS");

            if (rs.next()) {
                rstt = new Item();

                //Las columnas que queremos ver
                rstt.setColor_materia(rs.getString("COLOR_MATERIA"));
                rstt.setNombre_materia(rs.getString("NOMBRE_MATERIA"));
                rstt.setDescripcion_materia(rs.getString("DESCRIPCION_MATERIA"));
                rstt.setNivel_materia(rs.getString("NIVEL_MATERIA"));
                rstt.setPrecio_materia(rs.getString("PRECIO_MATERIA"));

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