package exerciciopoo;

public class Pessoa {
    
    // Atributos
    
    private String nome;
    private String sexo;
    private int idade;

    public Pessoa(String no, int id, String se) {
        this.nome = no;
        this.idade = id;
        this.sexo = se;
    }
   
    // Métodos Acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String se) {
        this.sexo = se;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }
    
    // Métodos Especiais
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
}
