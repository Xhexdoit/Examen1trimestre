package examen1trimestre;

import java.util.Scanner;


public class Examen1trimestre {

   
    public static void main(String[] args) {
        //1er ejercicio
        
        Scanner input=new Scanner(System.in);
        //declaración de las variables necesarias
        int total=0; //cada vez que se introduzca un número lo aumentaré
        int mayor=0; //si en algún momento hay un número mayor, lo cambiaré.
        int media=0; //voy a ir almacenando la suma de los valores y luego la
        //dividiré entre el total.
        int actual=0; //guardaré cada valor introducido
        int posicion=0; //en la posición voy a guardar el número más alto.
        
        while(actual>=0){
            System.out.println("Introduce números para calcular. Introduce un número negativo"
                    + " para parar ");
            actual=input.nextInt();
            //vamos a aplicar toda la lógica del programa.
            if(actual>=0){
                total++;
                media+=actual;
                //si es el mayor de los números.
                if(actual>=mayor){
                    mayor=actual; //guardo mi nuevo máximo
                    posicion=total;
                }
                
            }
            
        }
        if (total>0) {
            media=media/total;
            System.out.println("El total de números positivos ha sido: "+total);
            System.out.println("El número más alto ha sido: "+mayor + " y estaba en la "
                    + "posición: "+posicion);
            System.out.println("La media de todos los números es: "+media);
            
        }else{
            System.out.println("No se han introducido números.");
        }
        
    }
    
}
