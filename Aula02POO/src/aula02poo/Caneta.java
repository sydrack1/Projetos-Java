
package aula02poo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("Erro");
        }else{
            System.out.println("Rabisco");
        }
    }
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor );
        System.out.println("Ponta: " + this.ponta);
        System.out.println("total de carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
