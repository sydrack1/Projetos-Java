package projetopratico;

public class ProjetoPratico {

   
    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco();
       c1.depositar(150);
       System.out.println("Saldo: " + c1.getSaldo()+
               " tipo: " + c1.getTipo());
        
    }
    
}
