
package aula02poo;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("Erro");
        }else{
            System.out.println("Rabisco");
        }
    }
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor );
        System.out.println("Ponta: " + this.ponta);
        System.out.println("total de carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}

