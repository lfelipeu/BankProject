/*
Esta es la clase modelodatos, donde se van a desarrollar todos los métodos 
(procedimientos y funciones) que permiten dar mantenimiento a las tablas de 
la base de datos
 */
package Modelos;

//Se importa todo lo de la clase SQL para poder utilizar los comandos de SQL
import java.sql.*;
import javax.swing.*;
import BaseDatos.ConexionBaseDatos;

public class ModeloDatosBitacora 
{
    /*
    Aquí instancia o construye la variable cn de tipo de la clase 
    ConectarBaseDatos y a partir de acá pueden accesarse todos los métodos de la
    clase ConexionBaseDatos
    */ 
    ConexionBaseDatos cn = new ConexionBaseDatos();
    /*
    Esta función permite ingresar en la tablabitacora los datos de un 
    movimiento en la bitácora cuando es llamada en el formulario
    */
    public boolean ingresarbitacora(String fecha,
            String login,
            String transaccion){
        //Intente hacer
        try{
            cn.conectarbase(); //Conecta con la base de datos
            String query = "INSERT INTO TABLABITACORA (FECHAMOVIMIENTO,LOGINUSUARIO,TRANSACCIONREALIZADA) VALUES ('"+fecha+"','"+login+"','"+transaccion+"')";
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
}