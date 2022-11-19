/*
Esta es la clase modelo empleados donde se van a programar todos los métodos
que trabajan con la tablaclientes
 */
package Modelos;

//Se importa todo lo de la clase SQL para poder utilizar los comandos de SQL
import java.sql.*;
import BaseDatos.ConexionBaseDatos;
import javax.swing.*;

public class ModeloDatosCuentas 
{
    //Instancia las clases a utilizar
    ConexionBaseDatos cn = new ConexionBaseDatos();
    
    /*
    Función que nos permite buscar una identificación en la tablacuentas de la
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
    Función que nos permite buscar un numero de cuenta en la tablacuentas de la
    base de datos
    */
    public int buscarnumcuenta(int numcuenta){
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
            String query = "SELECT * FROM TABLACUENTAS WHERE NUMEROCUENTA = " + numcuenta + "";
            
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
                if (numcuenta == rs.getInt("NumeroCuenta")){
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
    public boolean ingresarcuentas(String fecha, String tipocuen, String tipomoneda,
            double saldo, String ide, double montoaper, String condcuenta){
        //Intente hacer
        try{
            cn.conectarbase(); //Conecta con la base de datos
            //El INSERT guarda los datos del formulario en la tablaclientes
            String query = "INSERT INTO TABLACUENTAS (FECHAAPERTURA,TIPOCUENTA,TIPOMONEDA,SALDOCUENTA,IDENTIFICACION,MONTOAPERTURA,CONDICIONCUENTA) VALUES ('"+fecha+"','"+tipocuen+"','"+tipomoneda+"','"+saldo+"','"+ide+"','"+montoaper+"','"+condcuenta+"')";
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
    Procedimiento que permite mostrar los datos de una cuenta de la tablacuentas
    en el formulario
    */
    public void mostrardatos(String numcuenta, 
            JTextField campofecha,
            JTextField campotipocuenta,
            JTextField campomoneda,
            JTextField camposaldo,
            JTextField campoide,
            JTextField campomontoapert,
            JTextField campocondicion){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLACUENTAS WHERE NUMEROCUENTA = '"+numcuenta+"'";
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
                if (numcuenta.equals(rs.getString("NUMEROCUENTA"))){
                    /*
                    Aquí asigna a cada uno de los parámetros los campos de la
                    tabla de la BD que están guardados en el rs
                    */
                    campofecha.setText(rs.getString("FechaApertura"));
                    campotipocuenta.setText(rs.getString("TipoCuenta"));
                    campomoneda.setText(rs.getString("TipoMoneda"));
                    camposaldo.setText(rs.getString("SaldoCuenta"));
                    campoide.setText(rs.getString("Identificacion"));
                    campomontoapert.setText(rs.getString("MontoApertura"));
                    campocondicion.setText(rs.getString("CondicionCuenta"));
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
    Método tipo función que permite eliminar una cuenta de la tabla de la base
    de datos
    */
    public boolean eliminarcuenta(int numcuenta){
        //Define la variable booleana la cual tiene true o false
        boolean borrado = true;
        
        try{
            cn.conectarbase();
            /*
            La instrucción en SQL se ejecuta directamente, sin necesidad de 
            guardarla en una variable query. Esta instrucción elimina de la 
            tabla de la base de datos la cuenta que coincida con el numero de
            cuenta recibido como parametro
            */
            cn.stmt.execute("DELETE FROM TABLACUENTAS WHERE NUMEROCUENTA = " + numcuenta + "");
            /*
            Elimina de la tablamovimientos los movimientos relacionados a 
            este mismo numero de cuenta
            */
            cn.stmt.execute("DELETE FROM TABLAMOVIMIENTOS WHERE NUMEROCUENTA = " + numcuenta + "");
        }
        catch(Exception e){
            System.out.println(e);
            borrado = false;
        }
        finally{
            cn.desconectarbase();
        }
        return borrado;
    }
    /*
    Procedimiento que permite mostrar la condición de una cuenta de la tablacuentas
    en el formulario
    */
    public void mostrarcondicion(String numcuenta, 
            JTextField campocondicion){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLACUENTAS WHERE NUMEROCUENTA = '"+numcuenta+"'";
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
                if (numcuenta.equals(rs.getString("NUMEROCUENTA"))){
                    /*
                    Aquí asigna a cada uno de los parámetros los campos de la
                    tabla de la BD que están guardados en el rs
                    */
                    campocondicion.setText(rs.getString("CondicionCuenta"));
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
    public boolean modificarcondicion(String pnumcuenta,
            String pcondi){
        try{
            cn.conectarbase();
            /*
            Esta es la instrucción en SQL para que actualice el registro en la
            tablaclientes y el campo MONTO no lleva comillas simples porque es
            un campo numérico en la tabla
            */
            String query = "UPDATE TABLACUENTAS SET CONDICIONCUENTA = '"+pcondi+"' WHERE NUMEROCUENTA = '"+pnumcuenta+"'";
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
    /*
    Procedimiento que permite cargar en el combo del formulario consultar
    cuentas, las cuentas registradas en la tabla
    */
    public void cargarcombocuentas(JComboBox combo){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLACUENTAS";
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
                    combo.addItem(rs.getString("NumeroCuenta"));
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
