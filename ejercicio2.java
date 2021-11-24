
package examen1trimestre;

import java.util.Scanner;


public class Examen1trimestre {
    public static int limiteInferior;
    public static int limiteSuperior;
    public static Scanner input=new Scanner(System.in);
   
    
    public static int [] creaIniArray(){
        boolean valido=false; //salir del bucle
        int tam;
        int [] miArray=null;
        
        do{
            System.out.println("Introduce el tamaño del array: ");
            tam=input.nextInt();
            if(tam>0){
                //si el tamaño es mayor que cero creo el array y salgo del bucle
                //mediante valido que lo pondré a true.
                miArray=new int[tam];
                valido=true;
            }else{
                System.out.println("Tamaño no válido");
            }
            
        }while(valido==false);
        
        return miArray;
    }
    
    public static void pideLimites(){
        boolean correcto=false;
        
        while (correcto==false) {
            //va a entrar por lo menos una vez
            System.out.println("Introduce el límite inferior: ");
            limiteInferior=input.nextInt();
            System.out.println("Introduce el limite superior: ");
            limiteSuperior=input.nextInt();
           
            //ahora comprobaré que son ambos mayores que 0
            
            if(limiteInferior>=0 && limiteSuperior>=0){
                //Los dos límites son mayores de cero;
                if (limiteSuperior>limiteInferior) {
                    //esto es lo que espero y salgo del bucle
                    correcto=true;
                    
                }else{
                    System.out.println("Límites no válidos");
                }
            }else{
                System.out.println("Límites no válidos");
            } 
        } 
    }
    
    public static boolean esPrimoConLimite(int numero, int inf, int superior){
        //voy a apostar que el número es correcto y si no lo es
        //cambiaré el boolean.
        boolean numValido=true;
        //primero compruebo si estoy en los límites.
        
        if (numero<inf || numero>superior) {
            //este número está fuera de los límites
            numValido=false;
            
        }else{
            //si estoy aqui el número está en los límites.
            //compruebo si es primo.
            
            for (int i = numero-1; i > 1; i--) {
                //comienzo por el número-1 porque él mismo si se divide
                //llego al dos porque por uno ya sé que se dividen.
                if (numero%i==0) {
                    //significa que el número no es primo.
                    numValido=false;
                    
                }  
            } 
        } 
        return numValido;
    }
    
    public static int [] rellenarArray(int [] miArray){
        int numActual;
        boolean numValido=false;
        
        for (int i = 0; i < miArray.length; i++) {
            while (numValido==false) {
                System.out.println("Introduce un número para el array: ");
                numActual=input.nextInt();
                numValido=esPrimoConLimite(numActual, limiteInferior, limiteSuperior);
                //esto devuelve un boolean.
                
                if (numValido==true) {
                    //el número actual estaba en los límites y era primo.
                    miArray[i]=numActual;
                    System.out.println("Número introducido");
                    
                }else{
                    System.out.println("Número no válido");
                    
                }  
            } 
        }

        return miArray;
    }
    
    public static void mostrarArray(int [] miArray){
        
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
            
        } 
    }
    
    public static void main(String[] args) {
    //ejercicio 2 Comprobaciones
    
    /*int [] miArray=creaIniArray();
        System.out.println(miArray.length);
    
    
        pideLimites();
        System.out.println(limiteInferior);
        System.out.println(limiteSuperior);*/
        
        
        //System.out.println(esPrimoConLimite(5, 0, 10));
        
        
        int [] miArray;
        miArray=creaIniArray();
        pideLimites();
        rellenarArray(miArray);
        System.out.println("Mostrar el Array: ");
        mostrarArray(miArray);
        
    } 
}
