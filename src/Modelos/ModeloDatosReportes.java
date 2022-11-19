/*
Esta es la clase modelo reportes donde se van a programar todos los métodos
que trabajan con los reportes
 */
package Modelos;

//Se importa todo lo de la clase SQL para poder utilizar los comandos de SQL
import java.sql.*;
import BaseDatos.ConexionBaseDatos;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModeloDatosReportes 
{
    //Instancia las clases a utilizar
    ConexionBaseDatos cn = new ConexionBaseDatos();
    /*
    Procedimiento que permite cargar en el combo de los reportes de movimientos,
    las cuentas registradas en la tabla
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
    Procedimiento que permite cargar en el combo de los reportes de cuentas,
    los clientes registrados en la tabla
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
    Este método permite cargar en un jTable todos los empleados que están 
    guardados o almacenados en la tablaempleados
    */
    public void cargartablacuentas(JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLACUENTAS INNER JOIN TABLACLIENTES ON TABLACUENTAS.IDENTIFICACION = TABLACLIENTES.IDENTIFICACION";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("FechaApertura"), linea, 0);
                    jTable1.setValueAt(rs.getString("TipoCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 2);
                    jTable1.setValueAt(rs.getString("SaldoCuenta"), linea, 3);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 4);
                    jTable1.setValueAt(rs.getString("Nombre"), linea, 5);
                    jTable1.setValueAt(rs.getString("CondicionCuenta"), linea, 6);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los clientes que están 
    guardados o almacenados con el nombre a buscar
    */
    public void cargartablaclientespornombre(String nom,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLACLIENTES WHERE NOMBRE LIKE '"+nom+"%'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 0);
                    jTable1.setValueAt(rs.getString("Nombre"), linea, 1);
                    jTable1.setValueAt(rs.getString("Telefono"), linea, 2);
                    jTable1.setValueAt(rs.getString("Direccion"), linea, 3);
                    jTable1.setValueAt(rs.getString("Correo"), linea, 4);
                    jTable1.setValueAt(rs.getString("FechaRegistro"), linea, 5);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todas las cuenta que están 
    guardados o almacenados a nombre de un cliente
    */
    public void cargartablacuentasporcliente(int ide,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLACUENTAS INNER JOIN TABLACLIENTES ON TABLACUENTAS.IDENTIFICACION = TABLACLIENTES.IDENTIFICACION WHERE TABLACUENTAS.IDENTIFICACION = "+ide+"";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("FechaApertura"), linea, 0);
                    jTable1.setValueAt(rs.getString("TipoCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 2);
                    jTable1.setValueAt(rs.getString("SaldoCuenta"), linea, 3);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 4);
                    jTable1.setValueAt(rs.getString("Nombre"), linea, 5);
                    jTable1.setValueAt(rs.getString("CondicionCuenta"), linea, 6);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todas las cuentas que están 
    guardados o almacenados de un tipo
    */
    public void cargartablacuentasportipo(String tipo,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLACUENTAS INNER JOIN TABLACLIENTES ON TABLACUENTAS.IDENTIFICACION = TABLACLIENTES.IDENTIFICACION WHERE TABLACUENTAS.TIPOCUENTA = '"+tipo+"'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("FechaApertura"), linea, 0);
                    jTable1.setValueAt(rs.getString("TipoCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 2);
                    jTable1.setValueAt(rs.getString("SaldoCuenta"), linea, 3);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 4);
                    jTable1.setValueAt(rs.getString("Nombre"), linea, 5);
                    jTable1.setValueAt(rs.getString("CondicionCuenta"), linea, 6);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todas las cuentas que están 
    guardados o almacenados de una moneda
    */
    public void cargartablacuentaspormoneda(String moneda,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLACUENTAS INNER JOIN TABLACLIENTES ON TABLACUENTAS.IDENTIFICACION = TABLACLIENTES.IDENTIFICACION WHERE TABLACUENTAS.TIPOMONEDA = '"+moneda+"'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("FechaApertura"), linea, 0);
                    jTable1.setValueAt(rs.getString("TipoCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 2);
                    jTable1.setValueAt(rs.getString("SaldoCuenta"), linea, 3);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 4);
                    jTable1.setValueAt(rs.getString("Nombre"), linea, 5);
                    jTable1.setValueAt(rs.getString("CondicionCuenta"), linea, 6);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todas las cuentas que están 
    guardados o almacenados de una moneda y un tipo
    */
    public void cargartablacuentasportipoymoneda(String tipo,
            String moneda,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLACUENTAS INNER JOIN TABLACLIENTES ON TABLACUENTAS.IDENTIFICACION = TABLACLIENTES.IDENTIFICACION WHERE TABLACUENTAS.TIPOCUENTA = '"+tipo+"' AND TABLACUENTAS.TIPOMONEDA = '"+moneda+"'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("FechaApertura"), linea, 0);
                    jTable1.setValueAt(rs.getString("TipoCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 2);
                    jTable1.setValueAt(rs.getString("SaldoCuenta"), linea, 3);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 4);
                    jTable1.setValueAt(rs.getString("Nombre"), linea, 5);
                    jTable1.setValueAt(rs.getString("CondicionCuenta"), linea, 6);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los movimientos que están 
    guardados o almacenados de una cuenta a buscar
    */
    public void cargartablamovimientosporcuenta(int numcuenta,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLAMOVIMIENTOS INNER JOIN TABLACUENTAS ON TABLAMOVIMIENTOS.NUMEROCUENTA = TABLACUENTAS.NUMEROCUENTA WHERE TABLAMOVIMIENTOS.NUMEROCUENTA = "+numcuenta+"";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("NumeroMovimiento"), linea, 0);
                    jTable1.setValueAt(rs.getString("NumeroCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 2);
                    jTable1.setValueAt(rs.getString("FechaMovimiento"), linea, 3);
                    jTable1.setValueAt(rs.getString("TipoMovimiento"), linea, 4);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 5);
                    jTable1.setValueAt(rs.getString("MontoMovimiento"), linea, 6);
                    jTable1.setValueAt(rs.getString("NombreResponsable"), linea, 7);
                    jTable1.setValueAt(rs.getString("DetalleMovimiento"), linea, 8);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los movimientos que están 
    guardados o almacenados de una cuenta a buscar entre dos montos
    */
    public void cargartablamovimientosporcuentaentremontos(int numcuenta,
            int monto1, int monto2,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLAMOVIMIENTOS INNER JOIN TABLACUENTAS ON TABLAMOVIMIENTOS.NUMEROCUENTA = TABLACUENTAS.NUMEROCUENTA WHERE TABLAMOVIMIENTOS.NUMEROCUENTA = "+numcuenta+" AND MONTOMOVIMIENTO BETWEEN "+monto1+" AND "+monto2+"";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("NumeroMovimiento"), linea, 0);
                    jTable1.setValueAt(rs.getString("NumeroCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 2);
                    jTable1.setValueAt(rs.getString("FechaMovimiento"), linea, 3);
                    jTable1.setValueAt(rs.getString("TipoMovimiento"), linea, 4);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 5);
                    jTable1.setValueAt(rs.getString("MontoMovimiento"), linea, 6);
                    jTable1.setValueAt(rs.getString("NombreResponsable"), linea, 7);
                    jTable1.setValueAt(rs.getString("DetalleMovimiento"), linea, 8);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los movimientos que están 
    guardados o almacenados de una cuenta a buscar entre dos fechas
    */
    public void cargartablamovimientosporcuentaentrefechas(int numcuenta,
            String fecha1, String fecha2,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLAMOVIMIENTOS INNER JOIN TABLACUENTAS ON TABLAMOVIMIENTOS.NUMEROCUENTA = TABLACUENTAS.NUMEROCUENTA WHERE TABLAMOVIMIENTOS.NUMEROCUENTA = "+numcuenta+" AND FECHAMOVIMIENTO BETWEEN '"+fecha1+"' AND '"+fecha2+"'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("NumeroMovimiento"), linea, 0);
                    jTable1.setValueAt(rs.getString("NumeroCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 2);
                    jTable1.setValueAt(rs.getString("FechaMovimiento"), linea, 3);
                    jTable1.setValueAt(rs.getString("TipoMovimiento"), linea, 4);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 5);
                    jTable1.setValueAt(rs.getString("MontoMovimiento"), linea, 6);
                    jTable1.setValueAt(rs.getString("NombreResponsable"), linea, 7);
                    jTable1.setValueAt(rs.getString("DetalleMovimiento"), linea, 8);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los movimientos que están 
    guardados o almacenados de una cuenta que tengan cierto tipo de movimiento
    */
    public void cargartablamovimientosporcuentaportipo(int numcuenta,
            String tipomov,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLAMOVIMIENTOS INNER JOIN TABLACUENTAS ON TABLAMOVIMIENTOS.NUMEROCUENTA = TABLACUENTAS.NUMEROCUENTA WHERE TABLAMOVIMIENTOS.NUMEROCUENTA = "+numcuenta+" AND TABLAMOVIMIENTOS.TIPOMOVIMIENTO = '"+tipomov+"'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("NumeroMovimiento"), linea, 0);
                    jTable1.setValueAt(rs.getString("NumeroCuenta"), linea, 1);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 2);
                    jTable1.setValueAt(rs.getString("FechaMovimiento"), linea, 3);
                    jTable1.setValueAt(rs.getString("TipoMovimiento"), linea, 4);
                    jTable1.setValueAt(rs.getString("TipoMoneda"), linea, 5);
                    jTable1.setValueAt(rs.getString("MontoMovimiento"), linea, 6);
                    jTable1.setValueAt(rs.getString("NombreResponsable"), linea, 7);
                    jTable1.setValueAt(rs.getString("DetalleMovimiento"), linea, 8);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los usuarios que están 
    guardados o almacenados en la base de datos
    */
    public void cargartablausuarios(JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLAUSUARIOS";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("LogInUsuario"), linea, 0);
                    jTable1.setValueAt(rs.getString("Password"), linea, 1);
                    jTable1.setValueAt(rs.getString("NivelUsuario"), linea, 2);
                    jTable1.setValueAt(rs.getString("Identificacion"), linea, 3);
                    jTable1.setValueAt(rs.getString("CondicionUsuario"), linea, 4);
                    jTable1.setValueAt(rs.getString("NombreUsuario"), linea, 5);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los movimientos que están 
    guardados o almacenados en la bitacora entre dos fechas
    */
    public void cargartablabitacoraentrefechas(String fecha1, 
            String fecha2,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLABITACORA INNER JOIN TABLAUSUARIOS ON TABLABITACORA.LOGINUSUARIO = TABLAUSUARIOS.NOMBREUSUARIO WHERE FECHAMOVIMIENTO BETWEEN '"+fecha1+"' AND '"+fecha2+"'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("NumeroMovimiento"), linea, 0);
                    jTable1.setValueAt(rs.getString("FechaMovimiento"), linea, 1);
                    jTable1.setValueAt(rs.getString("LogInUsuario"), linea, 2);
                    jTable1.setValueAt(rs.getString("NombreUsuario"), linea, 3);
                    jTable1.setValueAt(rs.getString("TransaccionRealizada"), linea, 4);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
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
    Este método permite cargar en un jTable todos los movimientos que están 
    guardados o almacenados en la bitacora de un usuario
    */
    public void cargartablabitacoraporusuario(String login,
            JTable jTable1){
        /*
        Esta variable es para controlar la cantidad de lineas que se van 
        reportando en la tabla
        */
        int linea = 0;
        
        try{
            cn.conectarbase();
            String query = "SELECT * FROM TABLABITACORA INNER JOIN TABLAUSUARIOS ON TABLABITACORA.LOGINUSUARIO = TABLAUSUARIOS.NOMBREUSUARIO WHERE TABLABITACORA.LOGINUSUARIO = '"+login+"'";
            /*
            Aquí ejecuta la instrucción en SQL para que cargue los resultados
            obtenidos en la variable rs
            */
            ResultSet rs = cn.stmt.executeQuery(query);
            rs.first();
            //Si rs es diferente de null hay datos
            if (rs != null){
                //Ciclo que permite cargar todos los registros del rs en el JTable
                do{
                    /*
                    Aquí carga en cada fila y en cada columna del jTable1, los
                    campos de la tablaclientes, donde linea es la variable que
                    controla cada fila en el jTable1 y la columna se controla
                    con 0, 1, 2, etc según los campos a reportar
                    */
                    jTable1.setValueAt(rs.getString("NumeroMovimiento"), linea, 0);
                    jTable1.setValueAt(rs.getString("FechaMovimiento"), linea, 1);
                    jTable1.setValueAt(rs.getString("LogInUsuario"), linea, 2);
                    jTable1.setValueAt(rs.getString("NombreUsuario"), linea, 3);
                    jTable1.setValueAt(rs.getString("TransaccionRealizada"), linea, 4);
                    /*
                    Aquí incrementa linea en 1 para pasar a la siguiente fila
                    del jTable1
                    */
                    linea++;
                    if (linea >= 4){
                        /*
                        Este método permite agregar nuevas filas o lineas a la
                        tabla jTable1
                        */
                        agregarnuevafila(jTable1);
                    }
                    rs.next(); //Avanza de registro en registro en la tablaclientes
                }while(rs != null);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            cn.desconectarbase();
        }
    }
    //Método que permite agregar nuevas filas a un JTable
    public void agregarnuevafila(JTable jTable1){
        /*
        Define la variable temp y obtiene el modelo por defecto para la tabla 
        correspondiente
        */
        DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
        /*
        Define la variable nuevo con el espacio para cinco columnas y si fuera
        más columnas, deben especificarse con las comillas dobles
        */
        Object nuevo[] = {"","","","","","",""};
        /*
        Agrega una nueva fila a temp del tipo de objeto que es nuevo, el cual
        tiene cinco columnas
        */
        temp.addRow(nuevo);
    }
}
