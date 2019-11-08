package aula07poo;

public class Luta {
    
    // Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private String local;
    private int rounds;
    private boolean aprovado;
    
    // Métodos 
    
    public void marcarLuta(Lutador l1,Lutador l2,String lo){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(this.isAprovado()){
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            int vencedor = (int) (1+Math.random()*(2-0));
            switch(vencedor){
                case 0:// Empatar
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:// Vitória desafiado
                    System.out.println("O lutador " + this.getDesafiado().getNome() + " ganhou!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:// Vitória desafiante
                    System.out.println("O lutador " + this.getDesafiante().getNome() + " ganhou!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
            
            
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
    
    // Métodos acessores

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int ro) {
        this.rounds = ro;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String lo) {
        this.local = lo;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean ap) {
        this.aprovado = ap;
    }
    
    
    
}
