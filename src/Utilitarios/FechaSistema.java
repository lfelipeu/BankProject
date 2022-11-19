/*
Esta es la clase que nos permite obtener la fecha del sistema cuando es llamada
desde otra clase
*/
package Utilitarios;

//Se importa todo lo de la clase SQL para poder utilizar los comandos de SQL
import java.util.Date;

public class FechaSistema 
{
    /*
    Función que se encarga de imprimir la fecha que se obtiene
    */
    public String imprimefecha(){
        //Variables locales de la función
        int dia, mes, anio;
        
        //Define y construye la variable f del tipo Date
        Date f = new Date();
        
        //Asigna a la variable dia el día que obtiene de la fecha del sistema
        dia = f.getDate();
        
        //Obtiene el mes y le sumamoos 1 porque esa función obtiene a partir de 0
        mes = f.getMonth() + 1;
        
        /*
        La función getYear obtiene el año y le sumamos 1900 para que el año
        trabaje con cuatro dígitos
        */
        anio = f.getYear() + 1900;
        
        //Aquí retorna la fecha en el formato especificado
        return dia + "/" + mes + "/" + anio;
    }
}