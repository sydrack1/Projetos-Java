package polimorfismopoo1;

public class Ave extends Animal{
    // Atributos
    
    private String corPena;
    
    // Métodos Sobrepostos
    
    @Override
    public void locomover() {
        System.out.println("Voando");  
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");   
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");    
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
    // Métodos Acessores

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
