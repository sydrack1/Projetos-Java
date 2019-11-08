package herancapoo2;

public final class Tecnico extends Aluno{
    // Atributos
    
    private int registroProfissional;

    // Métodos Especiais
    
    public void praticar(){
        System.out.println("Hora do serviço " + this.getNome());
    }
    
    // Métodos Acessores

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
