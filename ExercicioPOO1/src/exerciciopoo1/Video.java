package exerciciopoo1;

public class Video implements AcoesVideo{
    // Atributos
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private boolean curtiu;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
        this.setCurtiu(false);
    }
    
    
    
    // Métodos Especiais

    @Override
    public void play() {
        if(this.isReproduzindo() == false){  
        
        this.setReproduzindo(true);
        
        }
    }

    @Override
    public void pause() {
        if(this.isReproduzindo()){  
        
        this.setReproduzindo(false);
        
        }
    }

    @Override
    public void like() {
        
        if(isCurtiu()){
            this.setCurtidas(this.getCurtidas() - 1);
            setCurtiu(false);
        }else{
            this.setCurtidas(this.getCurtidas() + 1);
            setCurtiu(true);
            
        }
        
        System.out.println(isCurtiu());
        
    }
   
    
    // Métodos Acessores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public boolean isCurtiu() {
        return curtiu;
    }

    public void setCurtiu(boolean curtiu) {
        this.curtiu = curtiu;
    }

    @Override
    public String toString() {
        return "Video{ " + "titulo= " + titulo + ", avaliacao= " + this.avaliacao + ", views= " + views + ", curtidas= " + curtidas + ", reproduzindo= " + reproduzindo + ", curtiu= " + curtiu + '}';
    }
    
    
    
}
