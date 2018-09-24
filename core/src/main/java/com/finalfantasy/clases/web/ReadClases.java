package com.finalfatasy.clases.web;
//Importaciones de sql
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.imageio.stream.IIOByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ReadClases {
    //ArrayList para leer clases
    public ArrayList readclases(String buscar) {
        ArrayList al = new ArrayList();
        try {
            //Ponemos que usamos base de datos Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            Statement stmt = con.createStatement();
            //Ponemos el SELECT de lo que queremos ver
            ResultSet rs;

            rs = stmt.executeQuery("SELECT * FROM (SELECT C.NOMBRE_CLASE, C.MOD_STATS_CLASE, C.DPV_CLASE, C.DPM_CLASE, C.PARADIGMA_CLASE, C.LICENCIAS_CLASE, H.HABILIDADES FROM CLASES C, HABILIDADES H WHERE c.id=h.id_clase)");

            if (rs.next()) {
                rstt = new Clase();

                //Las columnas que queremos ver
                rstt.setNombre_clase(rs.getString("NOMBRE"));
                rstt.setMod_stats_clase(rs.getString("MOD_STATS"));
                rstt.setDpv_clase(rs.getString("DPV"));
                rstt.setDpm_clase(rs.getString("DPM"));
                rstt.setParadigma_clase(rs.getString("PARADIGMA"));
                rstt.setLicencias_clase(rs.getString("LICENCIAS"));
                rstt.setHabilidades_clase(rs.getString("HABILIDADES"));


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