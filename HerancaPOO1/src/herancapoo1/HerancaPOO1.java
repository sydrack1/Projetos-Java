package herancapoo1;

public class HerancaPOO1 {

    public static void main(String[] args) {
          Pessoa p1 = new Pessoa();
          Aluno p2 = new Aluno();
          Professor p3 = new Professor();
          Funcionario p4 = new Funcionario();
          
          p1.setNome("Pedro");
          p2.setNome("Maria");
          p3.setNome("Claúdio");
          p4.setNome("Fabiana");
          
          p1.setSexo("M");
          p2.setSexo("F");
          p3.setSexo("M");
          p4.setSexo("F");
          
          p1.setIdade(87);
          p2.setIdade(16);
          p3.setIdade(32);
          p4.setIdade(29);
          
          p2.setCurso("Informática");
          p3.setSalario(2500.75f);
          p4.setSetor("Estoque");
          
          System.out.println(p1.toString());
          System.out.println(p2.toString());
          System.out.println(p3.toString());
          System.out.println(p4.toString());
    }
    
}
