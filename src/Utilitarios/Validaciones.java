/*
Clase que permite validar si los campos en los que se escribe se aceptan solo
números o solo letras.
 */
package Utilitarios;

//Se importa todo lo de la clase SQL para poder utilizar los comandos de SQL
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Validaciones 
{
    //Procedimiento para que acepte solo numero en un campo texto
    public void solonumeros(java.awt.event.KeyEvent evt){
        //Aquí permite que se obtenga el carácter digitado por el usuario
        char a = evt.getKeyChar();
        
        //Este if es para descartar que el usuario no hay digitado teclas de borrar
        if (a != KeyEvent.VK_BACK_SPACE && a != KeyEvent.VK_DELETE){
            if (!Character.isDigit(a)){
                JOptionPane.showMessageDialog(null,
                        "Solo se Aceptan Números",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                evt.consume();
            }
        }
    }
    
    //Procedimiento para que acepte solo letras
    public void sololetras(java.awt.event.KeyEvent evt){
        //Aquí permite que se obtenga el carácter digitado por el usuario
        char a = evt.getKeyChar();
        
        if (Character.isDigit(a) || (Character.isSpace(a))){
            JOptionPane.showMessageDialog(null,
                    "Solo se Aceptan Letras",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }
}