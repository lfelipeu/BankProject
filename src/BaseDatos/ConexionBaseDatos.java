/*
Esta es la clase ConexiónBaseDatos que nos permite conectarnos con la base de
datos
 */
package BaseDatos;

/*
Importa todas las clases de SQL para poder utilizar todos los comandos e
instrucciones que se ejecutan sobre la base de datos y tablas de la BD
*/
import java.sql.*;

public class ConexionBaseDatos {
    /*
    Se define una variable de tipo static para poder utilizarla en todo el
    proyecto, es decir, son globales del proyecto
    */
    public static String bd = "proyecto";
    public static String login = "root";
    //El password se escribe si al ingresar a MySQL existe password
    public static String password = "1234";
    /*
    En este URL especificamos la dirección donde está la base de datos, si por 
    ejemplo la base de dats está en un servidor, ahí escribiríamos la dirección 
    IP correspondiente
    */
    public static String url = "jdbc:mysql://localhost/" + bd;
    /*
    Define la variable de tipo Connection que nos va a permitrir hacer
    conexión con la base de datos MySQL
    */
    public static Connection con = null;
    /*
    Por medio de esta variable se ejecutan todas las instrucciones en SQL sobre
    una tabla de la BD, por ejemplo, INSERT, SELECT, UPDATE, DELETE, etc.
    */
    public static Statement stmt;
    
    /*
    Método de tipo procedimiento que permite conectar la BD
    */
    public void conectarbase(){
        //Intente hacer (Intentar)
        try{
            //Que accese al driver de conexión de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            /*
            En esta línea obtiene la conexión y la deja en la variable con,
            especificando las características de la url, login y password que
            se definieron anteriormente
            */
            con = DriverManager.getConnection(url, login, password);
            /*
            Aquí le indicamos que por medio del stmt vamos a ejecutar los 
            comandos de SQL, como son: INSERT, SELECT, UPDATE, DELETE, etc.
            */
            stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_READ_ONLY);
            if (con != null){
                /*
                Si con es diferente de null es porque hay conexión
                */
                System.out.println("Conexión con Base de Datos " + con + " Correcta.");
            }
        } //Cierra el try
        catch(SQLException ex){
            /*
            Con el system.out.println se imprime la excepción o error que se 
            activó en ese momento
            */
            System.out.println(ex);
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    } //Fin de conectarbase
    
    /*
    Este procedimiento permite desconectar la BD
    */
    public void desconectarbase(){
        try{
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    } //Fin de la clase desconectarbase
}
