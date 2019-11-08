package sobrecargapolimorfismopoo;

public class Mamifero extends Animal{
    // Atributos
    
    protected String corPelo;
    
    // Métodos Especiais
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    // Métodos Acessores

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
