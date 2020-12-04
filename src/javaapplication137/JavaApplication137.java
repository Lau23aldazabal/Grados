/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication137;

import java.util.Scanner;

/**
 *
 * @author DAM128
 */
public class JavaApplication137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //273
     
     Scanner teclado=new Scanner(System.in);
     char rp='s';
     do{
     
     System.out.println("Introduce los grados centigrados: ");
     int gr=teclado.nextInt();
     int kelvin=273;
     System.out.println("La conversion ha kelvin da: "+(gr+kelvin));
     System.out.println("¿Desea continuar?");
     rp=teclado.next().charAt(0);
     
    }while(rp!='n' && rp!='N');
    
}}
