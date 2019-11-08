/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

import java.util.Scanner;

/**
 *
 * @author Sadrac
 */
public class Metodo {

    /**
     * @param args the command line arguments
     */
    
    /*static void soma(int a, int b){
     *   int s = a+b;
     *   System.out.println("A soma dos números é: "+s);
     *}
     */
    static int soma(int a, int b){
        int s = a+b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
       int numA = teclado.nextInt();
        System.out.print("Digite um número inteiro: ");
       int numB = teclado.nextInt();
       int sm = soma(numA,numB);
        System.out.println("A soma é: "+sm);
    }
    
}
