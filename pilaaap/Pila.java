package pilaapp;

import java.util.Scanner;

public class Pila {
     Scanner leer=new Scanner(System.in);
     String pilaNumerica[]= new String[5];
     int cima=-1;
     
     
     //Ingresar
     public void push(){
         if(cima >=pilaNumerica.length -1){
             System.out.println("La pila esta llena");
         }else{
             cima+=1;
             System.out.print("Ingrese el dato: ");
             pilaNumerica[cima]=leer.next();
         }
     }
     
     //Eliminar
     public int pop(){
         int borrar = 0;
         
         if(cima==-1){
             System.out.println("La pila esta vacia");
         }else{
             System.out.println("Se ha eliminado un elemento");
             pilaNumerica[cima]=null;
             borrar=cima;
             cima--;     
         }
         return borrar;
 
     }
    
     public void  MostrarPila(){
         for (int tope = 4; tope >= 0; tope--) {  
             System.out.println("Los datos de la pila son: "+pilaNumerica[tope]);    
         }
     }
}
