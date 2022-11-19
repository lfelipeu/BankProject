/*
Esta es la clase modelodatos, donde se van a desarrollar todos los métodos 
(procedimientos y funciones) que permiten dar mantenimiento a las tablas de 
la base de datos
 */
package Modelos;

//Se importa todo de las clases SQL para poder utilizar los comandos de SQL
import java.sql.*;
import javax.swing.*;
import BaseDatos.ConexionBaseDatos;

public class ModeloDatosUsuarios 
{
    /*
    Aquí instancia o construye la variable cn de tipo de la clase 
    ConectarBaseDatos y a partir de acá pueden accesarse todos los métodos de la
    clase ConexionBaseDatos
    */ 
    ConexionBaseDatos cn = new ConexionBaseDatos();
    //Define variables globales para todo el proyecto
    public static String ploginusuario;
    public static String pnivelusuario;
    /*
    Función que nos permite buscar el login o el password en la tablausuarios de la
    base de datos
    */
    public int buscarloginopassword(String login,
            String pass){
        int enco = 0;
        
        //Intente hacer
        try{ 
            //Conecta con la base de datos
            cn.conectarbase();
            
            /*
            Aquí guarda en la variable query la instrucción en SQL que busca
            una identificacion en la tabla
            */
            String query = "SELECT * FROM TABLAUSUARIOS WHERE LOGINUSUARIO = '"+login+"' OR PASSWORD = '"+pass+"'";
            
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
                if (login.equals(rs.getString("LOGINUSUARIO")) ||
                        pass.equals(rs.getString("PASSWORD"))){
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
    Función que nos permite buscar el login y el password en la tablausuarios de la
    base de datos para iniciar sesion especificamente
    */
    public int buscarloginypasswordiniciarsesion(String login,
            String pass){
        int enco = 0;
        
        //Intente hacer
        try{ 
            //Conecta con la base de datos
            cn.conectarbase();
            
            /*
            Aquí guarda en la variable query la instrucción en SQL que busca
            una identificacion en la tabla
            */
            String query = "SELECT * FROM TABLAUSUARIOS WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"'";
            
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
                if (login.equals(rs.getString("LOGINUSUARIO")) &&
                        pass.equals(rs.getString("PASSWORD"))){
                    enco = 1;
                    /*
                    Aquí asignamos a las variables globales del proyecto el 
                    loginusuario y el nivel del usuario que ingresa al proyecto
                    */
                    ploginusuario = rs.getString("LogInUsuario");
                    pnivelusuario = rs.getString("NivelUsuario");
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
    Función que nos permite buscar el login y el password en la tablausuarios de la
    base de datos
    */
    public int buscarloginypassword(String login,
            String pass){
        int enco = 0;
        
        //Intente hacer
        try{ 
            //Conecta con la base de datos
            cn.conectarbase();
            
            /*
            Aquí guarda en la variable query la instrucción en SQL que busca
            una identificacion en la tabla
            */
            String query = "SELECT * FROM TABLAUSUARIOS WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"'";
            
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
                if (login.equals(rs.getString("LOGINUSUARIO")) &&
                        pass.equals(rs.getString("PASSWORD"))){
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
    Función que nos permite buscar la condicion de un usuario en la tabla de
    la base de datos
    */
    public int buscarcondicion(String login,
            String pass){
        int enco = 0;
        
        //Intente hacer
        try{ 
            //Conecta con la base de datos
            cn.conectarbase();
            
            /*
            Aquí guarda en la variable query la instrucción en SQL que busca
            una identificacion en la tabla
            */
            String query = "SELECT * FROM TABLAUSUARIOS WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"' AND CONDICIONUSUARIO = 'Activo'";
            
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
                if (login.equals(rs.getString("LOGINUSUARIO")) &&
                        pass.equals(rs.getString("PASSWORD"))){
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
    Método de tipo función que permite insertar un usuario en la tabla clientes
    */
    public boolean ingresarusuario(String login, String pass, String niv,
            String ide, String cond, String nombre){
        //Intente hacer
        try{
            cn.conectarbase(); //Conecta con la base de datos
            String query = "INSERT INTO TABLAUSUARIOS (LOGINUSUARIO, PASSWORD, NIVELUSUARIO, IDENTIFICACION, CONDICIONUSUARIO, NOMBREUSUARIO) VALUES ('"+login+"','"+pass+"','"+niv+"','"+ide+"','"+cond+"','"+nombre+"')";
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
    Procedimiento que permite mostrar los datos de un cliente de la tablaclientes
    en el formulario
    */
    public void mostrardatos(String login, 
            String pass, 
            JTextField niv,
            JTextField ide,
            JTextField cond,
            JTextField nombre){
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLAUSUARIOS WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"'";
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
                if ((login.equals(rs.getString("LogInUsuario"))) && (pass.equals(rs.getString("Password")))){
                    /*
                    Aquí asigna a cada uno de los parámetros los campos de la
                    tabla de la BD que están guardados en el rs
                    */
                    niv.setText(rs.getString("NivelUsuario"));
                    ide.setText(rs.getString("Identificacion"));
                    cond.setText(rs.getString("CondicionUsuario"));
                    nombre.setText(rs.getString("NombreUsuario"));
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
    Procedimiento que permite mostrar los datos de un cliente de la tablausuarios
    en el formulario. Especificamente para el formulario modificar usuarios
    */
    public void mostrardatosmodificar(String login, 
            String pass, 
            JTextField niv,
            JTextField ide,
            JTextField nombre){
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLAUSUARIOS WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"'";
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
                if ((login.equals(rs.getString("LogInUsuario"))) && (pass.equals(rs.getString("Password")))){
                    /*
                    Aquí asigna a cada uno de los parámetros los campos de la
                    tabla de la BD que están guardados en el rs
                    */
                    niv.setText(rs.getString("NivelUsuario"));
                    ide.setText(rs.getString("Identificacion"));
                    nombre.setText(rs.getString("NombreUsuario"));
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
    Método tipo función que permite modificar un usuario de la tabla de la base
    de datos
    */
    public boolean modificar(String login,
            String pass, String niv, 
            int ide, String nombre){
        try{
            cn.conectarbase();
            /*
            Esta es la instrucción en SQL para que actualice el registro en la
            tablaclientes y el campo MONTO no lleva comillas simples porque es
            un campo numérico en la tabla
            */
            String query = "UPDATE TABLAUSUARIOS SET NivelUsuario = '"+niv+"', Identificacion= "+ide+", NombreUsuario = '"+nombre+"' WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"'";
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
    Procedimiento que permite mostrar la condición de una cuenta de la tablausuarios
    en el formulario
    */
    public void mostrarcondicion(String login,
            String pass,
            JTextField campocondicion){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLAUSUARIOS WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"'";
            /*
            Aquí ejecuta la instrucción en SQL que está en query y los 
            resultados establecidos (ResultSet) los guarda en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first(); //Ubica el primer registro del rs
            if (rs != null){ //Es porque tiene datos
                /*
                Compara el parámetro numcuenta con lo que tiene el rs guardado en
                el campo numerocuenta de la tabla
                */
                if ((login.equals(rs.getString("LogInUsuario"))) && (pass.equals(rs.getString("Password")))){
                    /*
                    Aquí asigna a cada uno de los parámetros los campos de la
                    tabla de la BD que están guardados en el rs
                    */  
                    campocondicion.setText(rs.getString("CondicionUsuario"));
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
    Método tipo función que permite modificar la condicion de la tabla de la base
    de datos
    */
    public boolean modificarcondicion(String login,
            String pass,
            String pcondi){
        try{
            cn.conectarbase();
            /*
            Esta es la instrucción en SQL para que actualice el registro en la
            tablaclientes y el campo MONTO no lleva comillas simples porque es
            un campo numérico en la tabla
            */
            String query = "UPDATE TABLAUSUARIOS SET CONDICIONUSUARIO = '"+pcondi+"' WHERE LOGINUSUARIO = '"+login+"' AND PASSWORD = '"+pass+"'";
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
}
