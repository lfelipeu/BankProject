/*
Clase que permite establecer formatos numericos a datos que se despliegan 
en campos textos
*/
package Utilitarios;

//Importa la clase DecimalFormat que nos permite construir formatos personalizados por el programador
import java.text.DecimalFormat;
import javax.swing.*;

public class FormatoNumeros 
{
    /*
    Define y construye la variable formato con el formato establecido de signo de colones y decimales
    */
    public DecimalFormat formatocolones = 
            new DecimalFormat ("¢0.00");
    
    public DecimalFormat formatodolares =
            new DecimalFormat("$0.00");
    
    /*
    Este procediiento recibe como parámetro un campo texto y un dato de tipo doble para que se le asigne
    el formato texto
    */
    public void aplicaformatocolones(
                  JTextField campo, double dato)
    {
        campo.setText(""+formatocolones.format(dato));
        /*
        Asigna al campo texto que recibe como parámetro el dato de la variable pero con el formato que construyó 
        previamente
        */
    }
    
    public void aplicaformatodolares(
                  JTextField campo, double dato)
    {
        campo.setText(""+formatodolares.format(dato));
     /*
     Asigna al campo texto que recibe como parámetro el dato de la variable pero con el formato que construyó 
     previamente
     */
    }
    
}
//Fin de clase