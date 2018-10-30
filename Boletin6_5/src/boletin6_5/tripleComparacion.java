package boletin6_5;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class tripleComparacion {
    public tripleComparacion(){}
    public void datos(){
                Scanner ler=new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introzca numero1");
        num1=ler.nextInt();
        System.out.println("Introzca numero2");
        num2=ler.nextInt();
        System.out.println("Introzca numero3");
        num3=ler.nextInt();
        if (num1<num2){
            if(num2<num3){
            System.out.println("El mayor es num3= "+num3);}
            else{
            System.out.println("El mayor es num2= "+num2);
            }
        }
        else if (num1>num3)
            System.out.println("El mayor es num1= "+num1);
        else{
            System.out.println("El mayor es num3= "+num3);
        }
    }
    
}
