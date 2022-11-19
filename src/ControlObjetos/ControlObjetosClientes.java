/*
Esta es la clase donde se controla el estado de los objetos que se trabajan en
cada formulario
*/
package ControlObjetos;

//Importa los paquetes que se va a utilizar en el programa
import javax.swing.*;

public class ControlObjetosClientes 
{
    //Procedimiento que permite bloquear los objetos en el formulario
    public void bloquearobjetosregistrar(
            JButton boton1,
            JButton boton2,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6){
        boton1.setEnabled(true);
        boton2.setEnabled(false);
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
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
            JTextField texto6){
        boton1.setEnabled(true);
        combo1.setEnabled(true);
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
    }
    
    //Procedimiento que permite bloquear los objetos en el formulario
    public void bloquearobjetosmodificar(
            JButton boton1,
            JButton boton2,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6){
        boton1.setEnabled(true);
        boton2.setEnabled(false);
        texto1.setEditable(true);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
    }
    
    //Procedimiento que permite desbloquear los objetos en el formulario
    public void desbloquearobjetosregistrar(
            JButton boton1,
            JButton boton2,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6){
        boton1.setEnabled(false);
        boton2.setEnabled(true);
        texto1.setEditable(false);
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(false);
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
            JTextField texto6){
        boton1.setEnabled(false);
        combo1.setEnabled(false);
        texto1.setEditable(false);
        texto2.setEditable(false);
        texto3.setEditable(false);
        texto4.setEditable(false);
        texto5.setEditable(false);
        texto6.setEditable(false);
    }
    
    //Procedimiento que permite desbloquear los objetos en el formulario
    public void desbloquearobjetosmodificar(
            JButton boton1,
            JButton boton2,
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6){
        boton1.setEnabled(false);
        boton2.setEnabled(true);
        texto1.setEditable(false);
        texto2.setEditable(true);
        texto3.setEditable(true);
        texto4.setEditable(true);
        texto5.setEditable(true);
        texto6.setEditable(false);
    }
    
    //Procedimiento que permite limpiar los campos textos de cada formulario
    public void limpiarcampostextosregistrar(
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6){
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto1.requestFocus();
    }
    
    //Procedimiento que permite limpiar los campos textos de cada formulario
    public void limpiarcampostextosconsultar(
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6){
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto1.requestFocus();
    }
    
    //Procedimiento que permite limpiar los campos textos de cada formulario
    public void limpiarcampostextosmodificar(
            JTextField texto1,
            JTextField texto2,
            JTextField texto3,
            JTextField texto4,
            JTextField texto5,
            JTextField texto6){
        texto1.setText("");
        texto2.setText("");
        texto3.setText("");
        texto4.setText("");
        texto5.setText("");
        texto6.setText("");
        texto1.requestFocus();
    }
}