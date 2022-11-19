/*
Formulario Menu Principal
 */
package VistaInicio;

import VistaClientes.*;
import VistaCuentas.*;
import VistaInicio.*;
import VistaMovimientos.*;
import VistaUsuarios.*;
import VistaReportes.*;
import Modelos.*;
import Utilitarios.*;

public class MenuPrincipal extends javax.swing.JFrame {

    ModeloDatosUsuarios mu = new ModeloDatosUsuarios();
    ModeloDatosBitacora mb = new ModeloDatosBitacora();
    FechaSistema f = new FechaSistema();
    
    //Constructor
    public MenuPrincipal() {
        initComponents();
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField1.setText("" + mu.ploginusuario);
        jTextField2.setText("" + mu.pnivelusuario);
        jTextField3.setText("" + f.imprimefecha());
        /*
        Aqui llama al procedimiento con el nivel del usuario para que bloquee
        las opciones en el menú principal
        */
        bloquearopcionesmenuprincipal(jTextField2.getText());
    }
    
    /*
    Este procedimiento permite bloquear opciones del menú principal según el
    nivel del usuario
    */
    public void bloquearopcionesmenuprincipal(String nivel){
        if (nivel.equals("Administrador")){
            jMenuItem1.setEnabled(true); //Registrar clientes
            jMenuItem2.setEnabled(true); //Consultar clientes
            jMenuItem3.setEnabled(true); //Modificar clientes
            jMenuItem4.setEnabled(true); //Registrar cuentas
            jMenuItem5.setEnabled(true); //Consultar cuentas
            jMenuItem6.setEnabled(true); //Activar / Desactivar cuentas
            jMenuItem7.setEnabled(true); //Eliminar cuentas
            jMenuItem8.setEnabled(true); //Registrar movimientos
            jMenuItem9.setEnabled(true); //Consultar movimientos
            jMenuItem10.setEnabled(true); //Anular movimientos
            jMenuItem14.setEnabled(true); //Registrar usuarios
            jMenuItem15.setEnabled(true); //Consultar usuarios
            jMenuItem16.setEnabled(true); //Modificar Usuarios
            jMenuItem17.setEnabled(true); //Activar / Desactivar Usuarios
            jMenuItem18.setEnabled(true); //Reportar cuentas 
            jMenuItem19.setEnabled(true); //Reportar cuentas de un cliente
            jMenuItem20.setEnabled(true); //Reportar cuentas por tipo
            jMenuItem21.setEnabled(true); //Reportar cuentas por moneda
            jMenuItem22.setEnabled(true); //Reportar cuentas por tipo y moneda
            jMenuItem23.setEnabled(true); //Reportar clientes por nombre
            jMenuItem24.setEnabled(true); //Reportar movimientos de una cuenta
            jMenuItem25.setEnabled(true); //Reportar movimientos de una cuenta entre montos
            jMenuItem26.setEnabled(true); //Reportar movimientos de una cuenta entre fechas
            jMenuItem27.setEnabled(true); //Reportar movimientos de una cuenta por tipo movimiento
            jMenuItem28.setEnabled(true); //Reportar Usuarios
            jMenuItem29.setEnabled(true); //Reportar movimientos de bitacora entre fechas
            jMenuItem30.setEnabled(true); //Reportar movimientos de bitacora de un usuario
            jMenuItem31.setEnabled(true); //Cerrar sesión
            jButton1.setEnabled(true); //Registrar Usuarios
            jButton2.setEnabled(true); //Consultar Usuarios
            jButton3.setEnabled(true); //Modificar Usuarios
            jButton4.setEnabled(true); //Activar / Desactivar Usuarios
            jButton5.setEnabled(true); //Cerrar Sesión
            jButton6.setEnabled(true); //Salir
        }else{
            if (nivel.equals("Operacional")){
                jMenuItem1.setEnabled(true); //Registrar clientes
                jMenuItem2.setEnabled(true); //Consultar clientes
                jMenuItem3.setEnabled(true); //Modificar clientes
                jMenuItem4.setEnabled(true); //Registrar cuentas
                jMenuItem5.setEnabled(true); //Consultar cuentas
                jMenuItem6.setEnabled(false); //Activar / Desactivar cuentas
                jMenuItem7.setEnabled(false); //Eliminar cuentas
                jMenuItem8.setEnabled(true); //Registrar movimientos
                jMenuItem9.setEnabled(true); //Consultar movimientos
                jMenuItem10.setEnabled(false); //Anular movimientos
                jMenuItem14.setEnabled(false); //Registrar usuarios
                jMenuItem15.setEnabled(true); //Consultar usuarios
                jMenuItem16.setEnabled(false); //Modificar Usuarios
                jMenuItem17.setEnabled(false); //Activar / Desactivar Usuarios
                jMenuItem18.setEnabled(true); //Reportar cuentas 
                jMenuItem19.setEnabled(true); //Reportar cuentas de un cliente
                jMenuItem20.setEnabled(true); //Reportar cuentas por tipo
                jMenuItem21.setEnabled(true); //Reportar cuentas por moneda
                jMenuItem22.setEnabled(true); //Reportar cuentas por tipo y moneda
                jMenuItem23.setEnabled(true); //Reportar clientes por nombre
                jMenuItem24.setEnabled(true); //Reportar movimientos de una cuenta
                jMenuItem25.setEnabled(true); //Reportar movimientos de una cuenta entre montos
                jMenuItem26.setEnabled(true); //Reportar movimientos de una cuenta entre fechas
                jMenuItem27.setEnabled(true); //Reportar movimientos de una cuenta por tipo movimiento
                jMenuItem28.setEnabled(true); //Reportar Usuarios
                jMenuItem29.setEnabled(true); //Reportar movimientos de bitacora entre fechas
                jMenuItem30.setEnabled(true); //Reportar movimientos de bitacora de un usuario
                jMenuItem31.setEnabled(true); //Cerrar sesión
                jButton1.setEnabled(false); //Registrar Usuarios
                jButton2.setEnabled(true); //Consultar Usuarios
                jButton3.setEnabled(false); //Modificar Usuarios
                jButton4.setEnabled(false); //Activar / Desactivar Usuarios
                jButton5.setEnabled(true); //Cerrar Sesión
                jButton6.setEnabled(true); //Salir
            }else{
                if (nivel.equals("Final")){
                    jMenuItem1.setEnabled(false); //Registrar clientes
                    jMenuItem2.setEnabled(true); //Consultar clientes
                    jMenuItem3.setEnabled(false); //Modificar clientes
                    jMenuItem4.setEnabled(false); //Registrar cuentas
                    jMenuItem5.setEnabled(true); //Consultar cuentas
                    jMenuItem6.setEnabled(false); //Activar / Desactivar cuentas
                    jMenuItem7.setEnabled(false); //Eliminar cuentas
                    jMenuItem8.setEnabled(false); //Registrar movimientos
                    jMenuItem9.setEnabled(true); //Consultar movimientos
                    jMenuItem10.setEnabled(false); //Anular movimientos
                    jMenuItem14.setEnabled(false); //Registrar usuarios
                    jMenuItem15.setEnabled(false); //Consultar usuarios
                    jMenuItem16.setEnabled(false); //Modificar Usuarios
                    jMenuItem17.setEnabled(false); //Activar / Desactivar Usuarios
                    jMenuItem18.setEnabled(true); //Reportar cuentas 
                    jMenuItem19.setEnabled(true); //Reportar cuentas de un cliente
                    jMenuItem20.setEnabled(true); //Reportar cuentas por tipo
                    jMenuItem21.setEnabled(true); //Reportar cuentas por moneda
                    jMenuItem22.setEnabled(true); //Reportar cuentas por tipo y moneda
                    jMenuItem23.setEnabled(true); //Reportar clientes por nombre
                    jMenuItem24.setEnabled(true); //Reportar movimientos de una cuenta
                    jMenuItem25.setEnabled(true); //Reportar movimientos de una cuenta entre montos
                    jMenuItem26.setEnabled(true); //Reportar movimientos de una cuenta entre fechas
                    jMenuItem27.setEnabled(true); //Reportar movimientos de una cuenta por tipo movimiento
                    jMenuItem28.setEnabled(false); //Reportar Usuarios
                    jMenuItem29.setEnabled(false); //Reportar movimientos de bitacora entre fechas
                    jMenuItem30.setEnabled(false); //Reportar movimientos de bitacora de un usuario
                    jMenuItem31.setEnabled(true); //Cerrar sesión
                    jButton1.setEnabled(false); //Registrar Usuarios
                    jButton2.setEnabled(false); //Consultar Usuarios
                    jButton3.setEnabled(false); //Modificar Usuarios
                    jButton4.setEnabled(false); //Activar / Desactivar Usuarios
                    jButton5.setEnabled(true); //Cerrar Sesión
                    jButton6.setEnabled(true); //Salir
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator19 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Login Usuario:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 51, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Nivel:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 51, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banco (1).png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregue-el-simbolo-de-la-interfaz-de-personas-de-la-persona-negra-de-cerca-con-el-signo-mas-en-un-circulo-pequeno.png"))); // NOI18N
        jButton1.setToolTipText("Registrar Usuarios");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator8);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultac.png"))); // NOI18N
        jButton2.setToolTipText("Consultar Usuarios");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator9);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jButton3.setToolTipText("Modificar Usuarios");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator17);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estadoc.png"))); // NOI18N
        jButton4.setToolTipText("Activar / Desactivar Usuarios");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator18);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton5.setToolTipText("Cerrar Sesión");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator20);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (1).png"))); // NOI18N
        jButton6.setToolTipText("Salir");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator21);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Fecha:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 51, 0));

        jMenu1.setText("Clientes Banco");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registros-medicos.png"))); // NOI18N
        jMenuItem1.setText("Registrar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        jMenuItem2.setText("Consultar Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jMenuItem3.setText("Modificar Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cuentas Banco");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portapapelesc.png"))); // NOI18N
        jMenuItem4.setText("Registrar Cuentas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultac.png"))); // NOI18N
        jMenuItem5.setText("Consultar Cuentas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estadoc.png"))); // NOI18N
        jMenuItem6.setText("Activar / Desactivar Cuentas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator5);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarc.png"))); // NOI18N
        jMenuItem7.setText("Eliminar Cuentas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Movimientos Banco");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        jMenuItem8.setText("Registrar Movimientos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);
        jMenu3.add(jSeparator6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta_1.png"))); // NOI18N
        jMenuItem9.setText("Consultar Movimientos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);
        jMenu3.add(jSeparator7);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar_1.png"))); // NOI18N
        jMenuItem10.setText("Anular Movimientos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Usuarios Banco");

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregue-el-simbolo-de-la-interfaz-de-personas-de-la-persona-negra-de-cerca-con-el-signo-mas-en-un-circulo-pequeno.png"))); // NOI18N
        jMenuItem14.setText("Registrar Usuarios");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);
        jMenu5.add(jSeparator10);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta (1).png"))); // NOI18N
        jMenuItem15.setText("Consultar Usuarios");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);
        jMenu5.add(jSeparator11);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar-el-simbolo-de-la-interfaz-de-un-lapiz-en-un-papel-de-contorno-cuadrado.png"))); // NOI18N
        jMenuItem16.setText("Modificar Usuarios");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);
        jMenu5.add(jSeparator12);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/palanca.png"))); // NOI18N
        jMenuItem17.setText("Activar / Desactivar Usuarios");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Reportes Banco");

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facturacion.png"))); // NOI18N
        jMenuItem18.setText("Reportar Cuentas");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        jMenuItem19.setText("Reportar Cuentas de un Cliente");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/economia.png"))); // NOI18N
        jMenuItem20.setText("Reportar Cuentas por Tipo");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dinero.png"))); // NOI18N
        jMenuItem21.setText("Reportar Cuentas por Moneda");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem21);

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprobar.png"))); // NOI18N
        jMenuItem22.setText("Reportar Cuentas de un Tipo y Moneda");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem22);
        jMenu6.add(jSeparator16);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libreta-de-depositos.png"))); // NOI18N
        jMenuItem23.setText("Reportar Clientes Por Nombre");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem23);
        jMenu6.add(jSeparator13);

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte_1.png"))); // NOI18N
        jMenuItem24.setText("Reportar Movimientos de una Cuenta");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem24);

        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analitica.png"))); // NOI18N
        jMenuItem25.setText("Reportar Movimientos de una Cuenta entre Montos");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem25);

        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion-de-proyectos.png"))); // NOI18N
        jMenuItem26.setText("Reportar Movimientos de una Cuenta entre Fechas");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem26);

        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuenta-bancaria.png"))); // NOI18N
        jMenuItem27.setText("Reportar Movimientos de una Cuenta por Tipo Movimiento");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem27);
        jMenu6.add(jSeparator14);

        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo.png"))); // NOI18N
        jMenuItem28.setText("Reportar Usuarios");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);
        jMenu6.add(jSeparator15);

        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro_1.png"))); // NOI18N
        jMenuItem29.setText("Reportar Movimientos de Bitácora entre Fechas");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem29);

        jMenuItem30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hombre.png"))); // NOI18N
        jMenuItem30.setText("Reportar Movimientos de Bitácora de un Usuario");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem30);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Abandonar");

        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jMenuItem31.setText("Cerrar Sesión");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem31);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (1).png"))); // NOI18N
        jMenuItem11.setText("Salir");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Opcion anular movimiento
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        AnularMovimientos am = new AnularMovimientos();
        am.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    //Opción consultar usuarios
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        ConsultarUsuarios cu = new ConsultarUsuarios();
        cu.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    //Opcion reportar cuentas de un cliente
    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        ReportarCuentasPorCliente rc = new ReportarCuentasPorCliente();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    //Opción Registrar Clientes
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RegistrarClientes rc = new RegistrarClientes();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //Opción Consultar Clientes
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ConsultarClientes cc = new ConsultarClientes();
        cc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //Opción Modificar Clientes
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ModificarClientes mc = new ModificarClientes();
        mc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    //Opcion registrar cuentas
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RegistrarCuentas rc = new RegistrarCuentas();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    //Opcion ConsultarCuentas
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ConsultarCuentas cc = new ConsultarCuentas();
        cc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    //Opcion Activar desactivar cuentas
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ActivarDesactivarCuentas ac = new ActivarDesactivarCuentas();
        ac.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    //Opcion Eliminar Cuentas
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        EliminarCuentas ec = new EliminarCuentas();
        ec.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    //Opcion Registrar movimientos
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        RegistrarMovimientos rm = new RegistrarMovimientos();
        rm.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    //Opcion consultar movimientos
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ConsultarMovimientos cm = new ConsultarMovimientos();
        cm.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    //Opcion Registrar usuarios
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        RegistrarUsuarios ru = new RegistrarUsuarios();
        ru.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    //Opcion Modificar Usuarios
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        ModificarUsuarios mu = new ModificarUsuarios();
        mu.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    //Opción activar desactivar usuarios
    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        ActivarDesactivarUsuarios au = new ActivarDesactivarUsuarios();
        au.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    //Opción Cerrar Sesión
    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        IniciarSesion is = new IniciarSesion();
        is.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
        /*
        Llama al método ingresarbitacora del modelo para que se registre
        el movimiento en la bitácora
        */
        mb.ingresarbitacora(f.imprimefecha(), mu.ploginusuario, "Cierre de Sesión");
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    //Opción reportar cuentas
    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        ReportarCuentas rc = new ReportarCuentas();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    //Opcion reportar cuentas por tipo
    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        ReportarCuentasPorTipo rc = new ReportarCuentasPorTipo();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    //Opcion reportar cuentas por moneda
    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        ReportarCuentasPorMoneda rc = new ReportarCuentasPorMoneda();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    //Opcion reportar cuentas por tipo y moneda
    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        ReportarCuentasPorTipoYMoneda rc = new ReportarCuentasPorTipoYMoneda();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    //Opcion reportar clientes por nombre
    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        ReportarClientesPorNombre rc = new ReportarClientesPorNombre();
        rc.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    //Opcion reportar movimientos por cuenta
    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        ReportarMovimientosPorCuenta rm = new ReportarMovimientosPorCuenta();
        rm.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    //Opcion Reportar movimientos por cuenta entre montos
    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        ReportarMovimientosPorCuentaEntreMontos rm = new ReportarMovimientosPorCuentaEntreMontos();
        rm.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    //Opcion Reportar movimientos por cuenta entre fechas
    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        ReportarMovimientosPorCuentaEntreFechas rm = new ReportarMovimientosPorCuentaEntreFechas();
        rm.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    //Opcion reportar movimientos por cuenta por tipo
    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        ReportarMovimientosPorCuentaPorTipo rm = new ReportarMovimientosPorCuentaPorTipo();
        rm.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    //Opción reportar usuarios
    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        ReportarUsuarios ru = new ReportarUsuarios();
        ru.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    //Opcion reportar bitacora entre fechas
    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        ReportarBitacoraEntreFechas rb = new ReportarBitacoraEntreFechas();
        rb.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    //Opcion reportar bitacora de un usuario
    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        ReportarBitacoraPorUsuario rb = new ReportarBitacoraPorUsuario();
        rb.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    //Botón Registrar Usuarios
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistrarUsuarios ru = new RegistrarUsuarios();
        ru.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jButton1ActionPerformed

    //Botón Consultar Usuarios
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConsultarUsuarios cu = new ConsultarUsuarios();
        cu.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jButton2ActionPerformed

    //Botón Modificar Usuarios
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ModificarUsuarios mu = new ModificarUsuarios();
        mu.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jButton3ActionPerformed

    //Botón Activar / Desactivar Usuarios
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ActivarDesactivarUsuarios au = new ActivarDesactivarUsuarios();
        au.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jButton4ActionPerformed

    //Botón Cerrar Sesión
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        IniciarSesion is = new IniciarSesion();
        is.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
        /*
        Llama al método ingresarbitacora del modelo para que se registre
        el movimiento en la bitácora
        */
        mb.ingresarbitacora(f.imprimefecha(), mu.ploginusuario, "Cierre de Sesión");
    }//GEN-LAST:event_jButton5ActionPerformed

    //Opción salir
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        /*
        Llama al método ingresarbitacora del modelo para que se registre
        el movimiento en la bitácora
        */
        mb.ingresarbitacora(jTextField3.getText(), mu.ploginusuario, "Programa Abandonado");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    //Botón salir
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /*
        Llama al método ingresarbitacora del modelo para que se registre
        el movimiento en la bitácora
        */
        mb.ingresarbitacora(jTextField3.getText(), mu.ploginusuario, "Programa Abandonado");
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
