package herancapoo2;

public class Professor extends Pessoa{
    // Atributos
    
    private String especialidade;
    private float salario;
    
    // Métodos Especiais
    
    public void receberAumento(int au){
        this.setSalario(this.getSalario() + au);
    }
    
    // Métodos Acessores

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
