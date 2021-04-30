/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.de.pkgwhile;

/**
 *
 * @author Erick
 */
import java.util.Scanner;
public class ActividadDeWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Actividad con el uso de el ciclo while. 29/04/2021." );
        System.out.println("......................................................" );
         
        //2.-Calcular el factorial de 10
        System.out.println("2.-Calcular el factorial de 10" );     
        int cont = 1;
        int factorial=1;
        System.out.println("la lista es de:" );
        while (cont <=10){
           
        System.out.println("el numero "+cont );
                
            factorial*= cont;
            cont++;
            System.out.println("= "+factorial);
            
            
    }
     System.out.println("......................................................" );
     //4.-La media de la suma del 0 hasta el número introducido por el usuario
     System.out.println("4.-La media de la suma del 0 hasta el número introducido por el usuariO." );
     int num=0;
     int sum=0;
     int media=0;
     int i=0;
    Scanner insertar=new Scanner(System.in);
    System.out.println("Teclee el numero que desee:" ); 
    num=insertar.nextInt();
    while (i<=num){
        sum+=i;
        i++;
        media=sum/num;
        
    } 
 System.out.println("La suma del listado es igual a : " +sum); 
        System.out.println("La media es igual a : "+media);
        {
    }
    System.out.println("......................................................" );
    //5.-Suma, promedio, y cual es el mayor y menor de un n introducido por el usuario leido n veces
     System.out.println("5.-Suma, promedio, y cual es el mayor y menor de un n introducido por el usuario leido n veces" ); 
     int n=0;
     int s=0;
     int prom=0;
     int mayor=0;
     int menor = 0;
     int contadora=0;
     int contadorb=0;
     
     System.out.println("Teclee la cantidad de numeros que desee:" );  
     n=insertar.nextInt();
     System.out.println("Se inicia la sumatoria:" );
     while( i<=n ){
     s+=i; 
     prom=s/n; 
     System.out.println("+ "+i+" es igual a: "+ s);
    }
        if (n>mayor) {
            mayor=n;
            contadora++;
        } 
        if (n<=menor) {
            menor=n;
            contadorb++;
        }
            
System.out.println("Su promedio de "+s+" es igual a: "+prom);
System.out.println("El digito mayor es:"+ mayor);
System.out.println("El digito menor es:"+ menor);
contadora=mayor-menor;
System.out.println("Su distancia númerica es de: "+contadora);
         }     
    
}
