package com.finalfatasy.razas.web;
//Importaciones de sql
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.imageio.stream.IIOByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ReadRazas {
    //ArrayList para leer clases
    public ArrayList readclases(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            if (buscar == null || buscar.equals("")){
                rs = stmt.executeQuery("SELECT * FROM (SELECT NOMBRE, MOD_STATS, HABILIDADES FROM RAZAS)");
            }
            else {
                rs = stmt.executeQuery("SELECT * FROM (SELECT NOMBRE, MOD_STATS, HABILIDADES FROM RAZAS)");
            }

            while (rs.next()) {
                //Las columnas que queremos ver
                String nombre_raza= rs.getString("NOMBRE");
                String mod_stats_raza= rs.getString("MOD_STATS");
                String habilidades_raza= rs.getString("HABILIDADES");


                Raza std = new Raza();
                std.setNombre_raza(nombre_raza);
                std.setMod_stats_raza(mod_stats_raza);
                std.setHabilidades_raza(habilidades_raza);


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