/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sadrac
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double v[] = {3.5, 2.75, 8.96, 3.65};
        System.out.print("Você quer organizar um vetor?(S/N) ");
        String res = teclado.nextLine();
        if(res.equals("s")||res.equals("S")){
          Arrays.sort(v);
        
          for(double valor: v){
            System.out.println("O valor é: "+valor);
          }
        }else{
            System.out.print("Digite um número real: ");
            float valor = teclado.nextFloat();
            int b = Arrays.binarySearch(v, valor);
            System.out.println("Está na posição "+b);
        }
    }
    
}
