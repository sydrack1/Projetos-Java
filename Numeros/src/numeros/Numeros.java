/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Sadrac
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n,s=0;
        String resp;
        do{
            
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N]: ");
            resp = teclado.next();
            
        }while(resp.equals("S")||resp.equals("s"));
        
        System.out.println("A soma de todos os valores é: "+s);
    }
    
}
