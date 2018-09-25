package com.finalfatasy;
//Importaciones de sql
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.imageio.stream.IIOByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

//LEER ARMADURAS
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

//LEER ARMAS
public class ReadArmas{
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

//LEER CLASES
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

//LEER ESCUDOS
public class ReadArmas{
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

//LEER ITEMS
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

//LEER MATERIAS
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

//LEER RAZAS
public class ReadRazas {
    //ArrayList para leer razas
    public ArrayList readrazas(String buscar) {
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