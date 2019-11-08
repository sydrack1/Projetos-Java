package polimorfismopoo1;

public class Peixe extends Animal{
    // Atributos
    
    private String corEscama;
    
    // Métodos Sobrepostos

    @Override
    public void locomover() {
        System.out.println("Nadando");    
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");   
    }
    
    public void soltarBolha(){
        System.out.println("Soltou um bolha");
    }
    
    // Métodos Acessores

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
