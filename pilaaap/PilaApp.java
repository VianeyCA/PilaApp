package pilaapp;
import java.util.Scanner;
public class PilaApp {
     public static void main(String[] args) {
         // TODO code application logic here
         Pila obj=new Pila();
         Scanner op = new Scanner(System.in);
         int opc;
         do{
             System.out.println("*************Pilas*************");
             System.out.println("1.- Insertar");
             System.out.println("2.- Eliminar");
             System.out.println("3.- Mostrar");
             System.out.println("4.- Salir");
             System.out.print("Ingrese una opción: ");
             opc=op.nextInt();
             switch (opc){
                 case 1: 
                     obj.push();
                     break;
                 case 2:
                     obj.pop();
                     break;
                 case 3:
                     obj.MostrarPila();
                     break;
                 case 4: 
                     break;
                 default: 
                     System.out.println(" Opción invalida, intente nuevamente. ");
             }
             
         } while(opc !=4);
     }
}
