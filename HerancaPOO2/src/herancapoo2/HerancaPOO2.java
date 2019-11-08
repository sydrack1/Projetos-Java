package herancapoo2;

public class HerancaPOO2 {

    public static void main(String[] args) {
       Aluno a1 = new Aluno();
       Bolsista b1 = new Bolsista();
       Tecnico t1 = new Tecnico();
       a1.setNome("Marcos");
       a1.pagarMensalidade();
       b1.setNome("Lucas");
       b1.pagarMensalidade();
       t1.setNome("Ana");
       t1.praticar();
       
    }
    
}
