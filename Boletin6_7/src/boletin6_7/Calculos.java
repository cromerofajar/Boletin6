package boletin6_7;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Calculos {
    public Calculos(){}
    public void menu (){
        Scanner ler=new Scanner (System.in);
        System.out.println("******************************MENU******************************\n Selecion que la figura de la cual desee calcular la superficie\n 1-> Cuadrado   2-> Triangulo   3-> Circulo");
        int opcion=ler.nextInt();
        switch (opcion){
            case 1: System.out.println("Introduzca la longitud de un lado del cuadrado: ");
                    float lado=ler.nextFloat();
                    System.out.println("La superfice del cuadrado es= "+(lado*lado));
                    break;
            case 2: System.out.println("Introduzca la longitud de la base del triangulo: ");
                    float base=ler.nextFloat();
                    System.out.println("Introduzca la altura del triangulo:");
                    float altura=ler.nextFloat();
                    System.out.println("La superfice del cuadrado es= "+(base*(altura/2)));
                    break;
            case 3: System.out.println("Introduzca la longitud del radio del circulo: ");
                    float radio=ler.nextFloat();
                    System.out.println("La superficie del circulo es= "+(radio*Math.PI));
                    break;
           default: System.out.println("No es una opcion valida.");
        }
    }
    
}
