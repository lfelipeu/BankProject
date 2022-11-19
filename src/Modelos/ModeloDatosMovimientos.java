/*
Esta es la clase modelo empleados donde se van a programar todos los métodos
que trabajan con la tablamovimientos
 */
package Modelos;

//Se importa todo lo de la clase SQL para poder utilizar los comandos de SQL
import java.sql.*;
import BaseDatos.ConexionBaseDatos;
import javax.swing.*;

public class ModeloDatosMovimientos 
{
    //Instancia las clases a utilizar
    ConexionBaseDatos cn = new ConexionBaseDatos();
    /*
    Función que nos permite buscar un numero de cuenta en la tablacuentas de la
    base de datos
    */
    public int buscarnumcuenta(String numcuenta){
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
            String query = "SELECT * FROM TABLACUENTAS WHERE NUMEROCUENTA = '" + numcuenta + "'";
            
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
                if (numcuenta.equals(rs.getString("NumeroCuenta"))){
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
    Función que nos permite buscar un numero de movimiento en la tablamovimientos de la
    base de datos
    */
    public int buscarnummovimiento(int nummov){
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
            String query = "SELECT * FROM TABLAMOVIMIENTOS WHERE NUMEROMOVIMIENTO = " + nummov + "";
            
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
                if (nummov == rs.getInt("NumeroMovimiento")){
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
    Método de tipo función que permite insertar un movimiento en la
    tablamovimientos
    */
    public boolean ingresarmovimientos(String numcuenta, String fecha, 
            Object tipomov, double monto,
            String respons, String detalle){
        //Intente hacer
        try{
            cn.conectarbase(); //Conecta con la base de datos
            //INSERT permite guardar los datos del formulario en la tablacuentas
            String query = "INSERT INTO TABLAMOVIMIENTOS (NUMEROCUENTA,FECHAMOVIMIENTO,TIPOMOVIMIENTO,MONTOMOVIMIENTO,NOMBRERESPONSABLE,DETALLEMOVIMIENTO) VALUES ('"+numcuenta+"','"+fecha+"','"+tipomov+"','"+monto+"','"+respons+"','"+detalle+"')";
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
    /*
    Procedimiento que permite cargar en el combo del formulario consultar
    movimientos, los movimientos registrados en la tabla
    */
    public void cargarcombomovimientos(JComboBox combo){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLAMOVIMIENTOS";
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
                    combo.addItem(rs.getString("NumeroMovimiento"));
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
    Método tipo función que permite modificar el dinero que tiene un cliente
    en una cuenta
    */
    public boolean modificarmontocuenta(String pnumcuenta,
            Object tipomov, double pmontomov){
        try{
            cn.conectarbase();
            /*
            Condición que revisa si el tipo de movimiento fue un depósito o un
            retiro.
            */
            if (tipomov == "Retiro"){
                /*
                Esta es la instrucción en SQL para que actualice el registro en
                la tablacuentas
                */
                cn.stmt.execute("UPDATE TABLACUENTAS SET SALDOCUENTA = SALDOCUENTA - "+pmontomov+" WHERE NUMEROCUENTA = '"+pnumcuenta+"'");
            }else{
                cn.stmt.execute("UPDATE TABLACUENTAS SET SALDOCUENTA = SALDOCUENTA + "+pmontomov+" WHERE NUMEROCUENTA = '"+pnumcuenta+"'");
            }
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
    Procedimiento que permite mostrar los datos de un movimiento de la
    tablamovimientos en el formulario
    */
    public void mostrardatos(String nummov, 
            JTextField numcuenta,
            JTextField fechamov,
            JTextField tipomov,
            JTextField montomov,
            JTextField nombreresp,
            JTextField detallemov){
        try{
            cn.conectarbase();
            /*
            El SELECT selecciona todos los registros que tiene la tabla
            correspondiente
            */
            String query = "SELECT * FROM TABLAMOVIMIENTOS WHERE NUMEROMOVIMIENTO = '"+nummov+"'";
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
                if (nummov.equals(rs.getString("NumeroMovimiento"))){
                    /*
                    Aquí asigna a cada uno de los parámetros los campos de la
                    tabla de la BD que están guardados en el rs
                    */
                    numcuenta.setText(rs.getString("NumeroCuenta"));
                    fechamov.setText(rs.getString("FechaMovimiento"));
                    tipomov.setText(rs.getString("TipoMovimiento"));
                    montomov.setText(rs.getString("MontoMovimiento"));
                    nombreresp.setText(rs.getString("NombreResponsable"));
                    detallemov.setText(rs.getString("DetalleMovimiento"));
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
    Método tipo función que permite anular un movimeinto de la tabla de la base
    de datos
    */
    public boolean anular(String nummov, String numcuenta,
            String tipomov, double montomov){
        //Define la variable booleana la cual tiene true o false
        boolean borrado = true;
        try{
            cn.conectarbase();
            /*
            Condición que revisa si el tipo de movimiento fue un depósito o un
            retiro. Al ser una anulación, si el movimiento fue un retiro, el
            dinero se le devuelve (suma), y si fue un depósito el dinero se le
            quita (resta)
            */
            if (tipomov.equals("Retiro")){
                /*
                Esta es la instrucción en SQL para que actualice el registro en
                la tablacuentas
                */
                cn.stmt.execute("UPDATE TABLACUENTAS SET SALDOCUENTA = SALDOCUENTA + "+montomov+" WHERE NUMEROCUENTA = '"+numcuenta+"'");
            }else{
                cn.stmt.execute("UPDATE TABLACUENTAS SET SALDOCUENTA = SALDOCUENTA - "+montomov+" WHERE NUMEROCUENTA = '"+numcuenta+"'");
            }
            String query = "DELETE FROM TABLAMOVIMIENTOS WHERE NUMEROMOVIMIENTO = '" + nummov + "'";
            //Aquí ejecuta la instrucción en SQL sobre la tabla de la BD
            cn.stmt.execute(query);
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
    public void cargarcondicion(String numcuenta, 
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
    Procedimiento que permite cargar en el campo texto del formulario registrar
    movimientos, el tipo de moneda de la cuenta
    */
    public void cargartipomoneda(String numcuenta,
            JTextField texto){
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
            rs.first();
            if (rs != null){
                //Ciclo para cargar los datos del rs en el combo
                do{
                    //Agrega el tipo de moneda al campo texto
                    texto.setText(rs.getString("TipoMoneda"));
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
    Procedimiento que permite cargar en el campo texto del formulario registrar
    movimientos, el saldo de la cuenta
    */
    public void cargarsaldocuenta(String numcuenta,
            JTextField texto){
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
            rs.first();
            if (rs != null){
                //Ciclo para cargar los datos del rs en el combo
                do{
                    //Agrega el tipo de moneda al campo texto
                    texto.setText(rs.getString("SaldoCuenta"));
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
