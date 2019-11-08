package herancapoo2;

public class Bolsista extends Aluno{
    // Atributos
    
    private float bolsa;
    
    // Métodos Especiais
    
    public void renovarBolsa(){
        System.out.println("Renovando por mais um ano a bolsa do aluno " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista!! Pagamento facilitado.");
    }
    
    // Métodos Acessores

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
