
package boletin6_4;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Comparar {
    public Comparar(){}
    public void Datos(){
     Scanner ler=new Scanner(System.in);

        String perso1, perso2;
        int peso1, peso2;
        
        System.out.println("Introduzca nombre persona1:");
        perso1=ler.nextLine();
        System.out.println("Introduzca peso persona1:");
        peso1=ler.nextInt();
        
        System.out.println("Introduzca nombre persona2:");
        ler.nextLine();
        perso2=ler.nextLine();
        System.out.println("Introduzca peso persona2:");
        peso2=ler.nextInt();
        
        if (peso1<peso2){
            System.out.println("Nombre= "+perso2 + "\nPeso= "+ peso2+ "\nCon una diferencia de: "+(peso2-peso1) );
        }
        else{
             System.out.println("Nombre= "+perso1 + "\nPeso= "+ peso1+ "\nCon una diferencia de: "+(peso1-peso2) );
        }
        }
}
