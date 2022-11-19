/*
Formulario Registrar Movimientos
 */
package VistaMovimientos;

//Importa los paquetes y clases a utilizar en este formulario
import javax.swing.JOptionPane;
import ControlObjetos.ControlObjetosMovimientos;
import Modelos.ModeloDatosMovimientos;
import Modelos.ModeloDatosBitacora;
import Modelos.ModeloDatosUsuarios;
import Utilitarios.*;
import VistaInicio.MenuPrincipal;

public class RegistrarMovimientos extends javax.swing.JFrame {

    //Instancia las clases a utilizar en el formulario
    ControlObjetosMovimientos co = new ControlObjetosMovimientos();
    ModeloDatosMovimientos md = new ModeloDatosMovimientos();
    ModeloDatosBitacora mb = new ModeloDatosBitacora();
    ModeloDatosUsuarios mu = new ModeloDatosUsuarios();
    FechaSistema f = new FechaSistema();
    Validaciones v = new Validaciones();
    
    //Constructor
    public RegistrarMovimientos() {
        initComponents();
        co.bloquearobjetosregistrar(jButton1, jButton2,
                jComboBox1, jComboBox2, 
                jTextField1, jTextField2,
                jTextField3, jTextField4, 
                jTextField5, jTextField6, 
                jTextField7, jTextField8);
        md.cargarcombocuentas(jComboBox1);
        co.cargarcombotipomovimiento(jComboBox2);
        desplegarfechasistema();
    }

    public void desplegarfechasistema(){
        //Despliega la fecha del sistema en el campo texto
        jTextField2.setText("" + f.imprimefecha());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Registrar Movimientos");
        setResizable(false);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 0));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 0));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registrar Movimiento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Número de Cuenta");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Cuentas Registradas");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Fecha Movimiento");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 0));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Tipo Movimiento");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 0));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Monto Movimiento");

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 0));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Nombre Responsable");

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Detalle Movimiento");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deshacer.png"))); // NOI18N
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-archivo.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 0));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Tipo Moneda");

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 51, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Condición Cuenta");

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 51, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Saldo en Cuenta");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambio-de-dinero.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(372, 372, 372))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(364, 364, 364)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(36, 36, 36)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
                .addComponent(jLabel12)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    Evento click del combo para que le asigne al campo texto el elemento 
    seleccionado del combo
    */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Asigna al campo texto, el elemento seleccionado del combo
        jTextField1.setText("" + jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Botón Buscar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        Aquí verifica que el campo texto no esté vacío
        */
        if (jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                "Faltan Datos por Completar",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
        }else{
            /*
            Aquí llama a la función buscarnumcuenta del modelo datos
            */
            if (md.buscarnumcuenta(jTextField1.getText())==1){
                JOptionPane.showMessageDialog(null,
                    "Cuenta Encontrada. Puede Realizar Movimiento.",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
                co.desbloquearobjetosregistrar(jButton1, jButton2,
                        jComboBox1, jComboBox2, 
                        jTextField1, jTextField2,
                        jTextField3, jTextField4, 
                        jTextField5, jTextField6, 
                        jTextField7, jTextField8);
                md.cargartipomoneda(jTextField1.getText(), jTextField3);
                md.cargarcondicion(jTextField1.getText(), jTextField7);
                md.cargarsaldocuenta(jTextField1.getText(), jTextField8);
            }else{
                JOptionPane.showMessageDialog(null,
                    "Cuenta No Encontrada",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    //Botón Limpiar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        co.limpiarcampostextosregistrar(jTextField1, jTextField2, 
                jTextField3, jTextField4, 
                jTextField5, jTextField6,
                jTextField7, jTextField8);
        co.bloquearobjetosregistrar(jButton1, jButton2,
                jComboBox1, jComboBox2, 
                jTextField1, jTextField2,
                jTextField3, jTextField4, 
                jTextField5, jTextField6, 
                jTextField7, jTextField8);
        desplegarfechasistema();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Botón Registrar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ingresardatos(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    //Botón Regresar
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.show(); //Muestra el form instanciado
        this.hide(); //Oculta el form actual de donde se instanció
        this.dispose(); //Elimina el espacio en memoria ocupado por el menú
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        v.solonumeros(evt);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        v.sololetras(evt);
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        v.solonumeros(evt);
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        v.sololetras(evt);
    }//GEN-LAST:event_jTextField5KeyTyped

    public void ingresardatos(java.awt.event.ActionEvent e){
        //Instancia el form
        RegistrarMovimientos rm = new RegistrarMovimientos();
        Object tipomovimiento;
        tipomovimiento = jComboBox2.getSelectedItem();
        //Aquí se verifica que los campos texto tengan datos almacenados
        if (jTextField2.getText().equals("") ||
                jTextField4.getText().equals("") ||
                jTextField5.getText().equals("") ||
                jTextField6.getText().equals("")){
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos por Completar",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            /*
            Estos if´s son para controlar especificamente cada uno de los 
            campos textos
            */
            if (jTextField6.getText().isEmpty()){
                jTextField6.requestFocus();
            }
            if (jTextField5.getText().isEmpty()){
                jTextField5.requestFocus();
            }
            if (jTextField4.getText().isEmpty()){
                jTextField4.requestFocus();
            }
            if (jTextField2.getText().isEmpty()){
                jTextField2.requestFocus();
            }
        }else{
            /*
            Condicion que verifica si la cuenta esta activa o desactiva, en 
            caso de estar desactiva no puede realizar movimientos
            */
            if (jTextField7.getText().equals("Desactiva")){
                JOptionPane.showMessageDialog(null,
                    "Cuenta Desactivada, No Puede Realizar Movimientos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else{
                /*
                Condicion para verificar si el movimiento es un retiro, si es 
                asi se consulta si el movimiento a realizar supera el saldo
                disponible en la cuenta. Si es mayor, no se puede realizar
                */
                if (jComboBox2.getSelectedItem().equals("Retiro")){
                    if (Double.parseDouble(jTextField8.getText()) < Double.parseDouble(jTextField4.getText())){
                        JOptionPane.showMessageDialog(null,
                            "No Puede Retirar más Dinero del Disponible",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }else{
                        /*
                        Aquí llama a la funcion para ingresar un movimiento en la
                        tablamovimientos
                        */
                        if (md.ingresarmovimientos(jTextField1.getText(),
                                jTextField2.getText(),
                                tipomovimiento,
                                Double.parseDouble(jTextField4.getText()),
                                jTextField5.getText(),
                                jTextField6.getText())==true){
                            /*
                            Llama al método ingresarbitacora del modelo para que se registre
                            el movimiento en la bitácora
                            */
                            mb.ingresarbitacora(f.imprimefecha(), mu.ploginusuario, rm.getTitle());
                            md.modificarmontocuenta(jTextField1.getText(),
                                    tipomovimiento,
                                    Double.parseDouble(jTextField4.getText()));
                            JOptionPane.showMessageDialog(null,
                                "Movimiento Completado Correctamente",
                                "Información",
                                JOptionPane.INFORMATION_MESSAGE);
                            co.limpiarcampostextosregistrar(jTextField1, jTextField2, 
                                    jTextField3, jTextField4, 
                                    jTextField5, jTextField6,
                                    jTextField7, jTextField8);
                            co.bloquearobjetosregistrar(jButton1, jButton2,
                                    jComboBox1, jComboBox2, 
                                    jTextField1, jTextField2,
                                    jTextField3, jTextField4, 
                                    jTextField5, jTextField6, 
                                    jTextField7, jTextField8);
                            desplegarfechasistema();
                            jTextField1.requestFocus();
                        }else{
                            JOptionPane.showMessageDialog(null,
                                "Movimiento No Completado",
                                "Advertencia",
                                JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }else{
                    /*
                    Aquí llama a la funcion para ingresar un movimiento en la
                    tablamovimientos
                    */
                    if (md.ingresarmovimientos(jTextField1.getText(),
                            jTextField2.getText(),
                            tipomovimiento,
                            Double.parseDouble(jTextField4.getText()),
                            jTextField5.getText(),
                            jTextField6.getText())==true){
                        mb.ingresarbitacora(f.imprimefecha(), mu.ploginusuario, rm.getTitle());
                        md.modificarmontocuenta(jTextField1.getText(),
                                tipomovimiento,
                                Double.parseDouble(jTextField4.getText()));
                        JOptionPane.showMessageDialog(null,
                            "Movimiento Completado Correctamente",
                            "Información",
                            JOptionPane.INFORMATION_MESSAGE);
                        co.limpiarcampostextosregistrar(jTextField1, jTextField2, 
                                jTextField3, jTextField4, 
                                jTextField5, jTextField6,
                                jTextField7, jTextField8);
                        co.bloquearobjetosregistrar(jButton1, jButton2,
                                jComboBox1, jComboBox2, 
                                jTextField1, jTextField2,
                                jTextField3, jTextField4, 
                                jTextField5, jTextField6, 
                                jTextField7, jTextField8);
                        desplegarfechasistema();
                        jTextField1.requestFocus();
                    }else{
                        JOptionPane.showMessageDialog(null,
                            "Movimiento No Completado",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(RegistrarMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarMovimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
