package exerciciopoo;
public class ExercicioPOO {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] leitor = new Pessoa[3];
        Livro[] livro = new Livro[3];
        leitor[0] = new Pessoa("Sydrack",15,"Masculino");
        livro[0] = new Livro("Barão de Mauá","Candido Portelli",128, leitor[0]);
        livro[0].detalhes();
        leitor[1] = new Pessoa("Elias",13,"Masculino");
        livro[1] = new Livro("Bulbo","Purentino Marcos",18, leitor[1]);
        livro[1].detalhes();
        leitor[2] = new Pessoa("Ana",39,"Feminino");
        livro[2] = new Livro("Estrada da Vida","Miguel Rosa",264, leitor[2]);
        livro[2].detalhes();
        
    }
    
}
