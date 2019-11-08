/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12repeticao;
import javax.swing.JOptionPane;

/**
 *
 * @author Sadrac
 */
public class Exercicio12Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float m=0,s=0;
        int n, p=0 , i=0,c=0, ac=0;
       do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null,
                   "<html>informe um número:<br/> <em>(Valor 0 interrompe)</em></html>",
                   "Entrada de valores", 
                   JOptionPane.WARNING_MESSAGE));
           //s += n;
           c++;
           if( n % 2 != 1 ){
               p++;
           }else{
               i++;
           }
               
            if(n == 0){
                p--;
                c--;
            }   
            
            if(n > 100){
                ac++;
            }
            s += n;
            
            m = s/c;
       }while(n != 0);
       JOptionPane.showMessageDialog(null,
               "<html>Resultado<hr> "+"Total de valores: "+(c)+
                       "<br>Total de pares: "+(p)+
                       "<br>Total de ímpares: "+i+
                       "<br>Acima de cem: "+ac+
                       "<br>Média dos números: "+m+"</html>");
    }
    
}
