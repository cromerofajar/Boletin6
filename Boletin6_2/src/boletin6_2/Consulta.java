
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Consulta {
    public Consulta(){}
    public void consultar(){
            Scanner ler= new Scanner (System.in);
        short num1, num2;
        System.out.println("Introduzca numero 1:");
        num1=ler.nextShort();
        System.out.println("Introduzca numero 2:");
        num2=ler.nextShort();
        if (num1>=num2){
            System.out.println("La suma es: "+(num1+num2)+"\nLa resta es:"+(num1-num2));
        }
        else {System.out.println("La suma es: "+(num1+num2));}
    }
}
