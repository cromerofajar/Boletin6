/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Consulta {
    public Consulta(){}
    public void comprobar(){
        Scanner ler= new Scanner (System.in);
        int numeroTecleado;
        System.out.println("Introduzca numero:");
        numeroTecleado=ler.nextInt();
        if (numeroTecleado>=0){
            System.out.println("E positivo");
            
        }
        else {}
    }

}
