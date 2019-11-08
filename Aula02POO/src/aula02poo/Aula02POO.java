
package aula02poo;

 
public class Aula02POO {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "2018";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 98;
        c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
        c2.ponta = 0.7f;
        c2.carga = 37;
        c2.tampada = true;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
