/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Productos {
    public Productos(){}
    public void Datos(){
        Scanner ler=new Scanner(System.in);
        int vendasAnuais;
        String nomeProducto;
        System.out.println("Introduzca Producto");
        nomeProducto=ler.nextLine();
        System.out.println("Introduzca vendas");
        vendasAnuais=ler.nextInt();
        if (vendasAnuais<=100){
            System.out.println(nomeProducto+" É de baixo consumo");
        }
        else if (vendasAnuais<=500){
            System.out.println(nomeProducto+" É de consumo medio");
        }
        else if (vendasAnuais<=1000){
            System.out.println(nomeProducto+" É de consumo alto");
        }
        else{
            System.out.println(nomeProducto+" É de primeira necesidade");
        }
        
    }
}
