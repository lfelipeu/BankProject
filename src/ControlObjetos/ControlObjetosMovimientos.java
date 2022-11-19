/*
Esta es la clase donde se controla el estado de los objetos que se trabajan en
cada formulario
 */
package ControlObjetos;

//Importa los paquetes que se va a utilizar en el programa
import javax.swing.*;

public class ControlObjetosMovimientos 
{
    //Procedimiento que permite bloquear los objetos en el formulario
    public void bloquearobjetosregistrar(
            JButton boton1,
            JButton boton2,
            JComboBox combo1,
            JComboBox combo2,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7,
            JTextField texto8){
        boton1.setEnabled(true);
        boton2.setEnabled(false);
        combo1.setEnabled(true);
        combo2.setEnabled(false);
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
        texto8.setEditable(false);
    }
    
    //Procedimiento que permite bloquear los objetos en el formulario
    public void bloquearobjetosconsultar(
            JButton boton1,
            JComboBox combo1,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7){
        boton1.setEnabled(true);
        combo1.setEnabled(true);
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
    }
    
    //Procedimiento que permite bloquear los objetos en el formulario
    public void bloquearobjetosanular(
            JButton boton1,
            JButton boton2,
            JComboBox combo1,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7){
        boton1.setEnabled(true);
        boton2.setEnabled(false);
        combo1.setEnabled(true);
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
    }
    
    //Procedimiento que permite desbloquear los objetos en el formulario
    public void desbloquearobjetosregistrar(
            JButton boton1,
            JButton boton2,
            JComboBox combo1,
            JComboBox combo2,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7,
            JTextField texto8){
        boton1.setEnabled(false);
        boton2.setEnabled(true);
        combo1.setEnabled(false);
        combo2.setEnabled(true);
        texto1.setEditable(false);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(true);
        texto7.setEditable(false);
        texto8.setEditable(false);
    }
    
    //Procedimiento que permite desbloquear los objetos en el formulario
    public void desbloquearobjetosconsultar(
            JButton boton1,
            JComboBox combo1,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7){
        boton1.setEnabled(false);
        combo1.setEnabled(false);
        texto1.setEditable(false);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
    }
    
    //Procedimiento que permite desbloquear los objetos en el formulario
    public void desbloquearobjetosanular(
            JButton boton1,
            JButton boton2,
            JComboBox combo1,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7){
        boton1.setEnabled(false);
        boton2.setEnabled(true);
        combo1.setEnabled(false);
        texto1.setEditable(false);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
        texto7.setEditable(false);
    }
    
    //Procedimiento que permite limpiar los campos textos de cada formulario
    public void limpiarcampostextosregistrar(
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7,
            JTextField texto8){
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        texto8.setText("");
        texto1.requestFocus();
    }
    
    //Procedimiento que permite limpiar los campos textos de cada formulario
    public void limpiarcampostextosconsultar(
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6,
            JTextField texto7){
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto7.setText("");
        texto1.requestFocus();
    }
    
    /*
    Este procedimiento permite agregar datos a un combo que se recibe como
    parámetro, y este procedimiento lo vamos a llamar en cualquier formulario
    donde necesitemos agregar datos a ese combo
    */
    public void cargarcombotipomovimiento(JComboBox combo){
        combo.addItem("Depósito");
        combo.addItem("Retiro");
    }
}
