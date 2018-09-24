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
    //ArrayList para leer razas
    public ArrayList readclases(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            rs = stmt.executeQuery("SELECT * FROM (SELECT R.NOMBRE, R.MOD_STATS, H.HABILIDADES FROM RAZAS R, HABILIDADES H WHERE r.id_raza = h.id_raza)");

            if (rs.next()) {
                rstt = new Raza();
                //Las columnas que queremos ver
                rstt.nombre_raza(rs.getString("NOMBRE"));
                rstt.mod_stats_raza(rs.getString("MOD_STATS"));
                rstt.habilidades_raza(rs.getString("HABILIDADES"));

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