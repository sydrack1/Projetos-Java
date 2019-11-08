package exerciciopoo;

public class Livro implements Publicacao{
    // Atributos
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
        
    }
    
    
    
    // Métodos Acessores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor (String au) {
        this.autor = au;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int to) {
        this.totPaginas = to;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa le) {
        this.leitor = le;
    }
    
    // Métodos Especiais
    
    public void detalhes(){
        System.out.println("==================== LIVRO ======================");
        System.out.println("Autor                ==|==    " + this.getAutor());
        System.out.println("Título               ==|==    " + this.getTitulo());
        System.out.println("Página atual         ==|==    " + this.getPagAtual());
        System.out.println("Total de páginas     ==|==    " + this.getTotPaginas());
        System.out.println("Leitor               ==|==    " + this.getLeitor().getNome());
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(p);
        }
        
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
}
