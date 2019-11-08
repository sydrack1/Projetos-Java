package herancapoo1;

public class Aluno extends Pessoa{
    // Atributos
    
    private int mat;
    private String curso;
    
    // Métodos Especiais
    
    public void cancelarMatr(){
        System.out.println("Matrícula cancelada");
    }
    
    // Métodos Acessores

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
