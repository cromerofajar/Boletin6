
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Comprobar {
    public Comprobar(){}
    public void Consulta(){
          Scanner ler=new Scanner (System.in);
        long num1;
        System.out.println("Introduzca numero a comprobar:");
        num1=ler.nextLong();
        if (num1 == 0){
            System.out.println("0");
        }
        else if (num1<0){
            System.out.println("-");
        }
        else{
            System.out.println("+");
        }
    }
    
}
