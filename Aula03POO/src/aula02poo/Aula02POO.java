
package aula02poo;

 
public class Aula02POO {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Galo doido";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 93;
        //c1.tampada = true;
        c1.destampar();
        c1.status(); 
    }
    
}
