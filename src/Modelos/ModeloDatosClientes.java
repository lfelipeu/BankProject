/*
Esta es la clase modelo empleados donde se van a programar todos los métodos
que trabajan con la tablaclientes
 */
package Modelos;

//Se importa todo lo de la clase SQL para poder utilizar los comandos de SQL
import java.sql.*;
import BaseDatos.ConexionBaseDatos;
import javax.swing.*;

public class ModeloDatosClientes 
{
    //Instancia las clases a utilizar
    ConexionBaseDatos cn = new ConexionBaseDatos();
    
    /*
    Función que nos permite buscar una identificación en la tablaclientes de la
    base de datos
    */
    public int buscaridentificacion(String ide){
        int enco = 0;
        
        //Intente hacer
        try{ 
            //Conecta con la base de datos
            cn.conectarbase();
            
            /*
            Aquí guarda en la variable query la instrucción en SQL que busca
            una identificacion en la tabla
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM tablaclientes WHERE Identificacion = '" + ide + "'";
            
            /*
            Ejecuta la instrucción que está en query y guarda los resultados 
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            
            //Ubica el primer registro del rs
            rs.first(); 
            
            /*
            Si rs es diferente es porque encontró datos
            */
            if (rs != null){
                /*
                Compara el parámetro ide con el campo identificación de la
                tabla
                */
                if (ide.equals(rs.getString("Identificacion"))){
                    enco = 1;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            cn.desconectarbase();
        }
        return enco;
    }
    /*
    Método de tipo función que permite insertar un cliente en la tabla clientes
    */
    public boolean ingresarclientes(String ide, String nom, String tel,
            String dire, String correo, String fecha){
        //Intente hacer
        try{
            cn.conectarbase(); //Conecta con la base de datos
            //El INSERT guarda los datos del formulario en la tablclientes
            String query = "INSERT INTO TABLACLIENTES (IDENTIFICACION,NOMBRE,TELEFONO,DIRECCION,CORREO,FECHAREGISTRO) VALUES ('"+ide+"','"+nom+"','"+tel+"','"+dire+"','"+correo+"','"+fecha+"')";
            /*
            Ejecuta la instrucción en SQL que está en query para que se inserte
            el registro en la tabla de la base de datos
            */
            cn.stmt.execute(query);
        }
        catch(Exception e){
            //Imprime en la consola la excepción que haya capturado el catch
            System.out.println(e);
        }
        finally{
            cn.desconectarbase();
        }
        return true;
    }
    /*
    Procedimiento que permite mostrar los datos de un contacto de la tablaclientes
    en el formulario
    */
    public void mostrardatos(String ide, 
            JTextField camponombre,
            JTextField campotel,
            JTextField campodire,
            JTextField campocorreo,
            JTextField campofecha){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLACLIENTES WHERE IDENTIFICACION = '"+ide+"'";
            /*
            Aquí ejecuta la instrucción en SQL que está en query y los 
            resultados establecidos (ResultSet) los guarda en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first(); //Ubica el primer registro del rs
            if (rs != null){ //Es porque tiene datos
                /*
                Compara el parámetros ide con lo que tiene el rs guardado en
                el campo identificacion de la tabla
                */
                if (ide.equals(rs.getString("IDENTIFICACION"))){
                    /*
                    Aquí asigna a cada uno de los parámetros los campos de la
                    tabla de la BD que están guardados en el rs
                    */
                    camponombre.setText(rs.getString("Nombre"));
                    campotel.setText(rs.getString("Telefono"));
                    campodire.setText(rs.getString("Direccion"));
                    campocorreo.setText(rs.getString("Correo"));
                    campofecha.setText(rs.getString("FechaRegistro"));
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            cn.desconectarbase();
        }
    }
    /*
    Método tipo función que permite modificar un cliente de la tabla de la base
    de datos
    */
    public boolean modificar(String pide,
            String pnom, String ptel, 
            String pdire, String pcorreo,
            String pfecha){
        try{
            cn.conectarbase();
            /*
            Esta es la instrucción en SQL para que actualice el registro en la
            tablaclientes y el campo MONTO no lleva comillas simples porque es
            un campo numérico en la tabla
            */
            String query = "UPDATE TABLACLIENTES SET Nombre = '"+pnom+"', Telefono = '"+ptel+"', Direccion= '"+pdire+"', Correo= '"+pcorreo+"', FechaRegistro = '"+pfecha+"' WHERE IDENTIFICACION = '"+pide+"'";
            //Aquí ejecuta la instrucción en SQL sobre la tabla de la BD
            cn.stmt.execute(query);
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            cn.desconectarbase();
        }
        return true;
    }
    /*
    Procedimiento que permite cargar en el combo del formulario consultar
    clientes, las identificaciones registradas en la tabla
    */
    public void cargarcomboclientes(JComboBox combo){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLACLIENTES";
            /*
            Aquí ejecuta la instrucción en SQL que está en query y los 
            resultados establecidos (ResultSet) los guarda en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            if (rs != null){
                //Ciclo para cargar los datos del rs en el combo
                do{
                    //Agrega cada identificación al combo
                    combo.addItem(rs.getString("Identificacion"));
                    rs.next(); //Accede al siguiente registro del rs
                } while (rs != null);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            cn.desconectarbase();
        }
    }
}
