package aula06poo;
public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // Métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos

    @Override
    public void ligar() {
       setLigado(true);
    }

    @Override
    public void desligar() {
       setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Qual volume? " + this.getVolume());
        System.out.print("Está tocando? " + this.getTocando());
        for(int c=0;c<this.getVolume();c+=10){
            System.out.print(" |_| ");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
         if(this.getLigado()){
             this.setVolume(this.getVolume()+1);
         }
    }

    @Override
    public void menosVolume() {
          if(this.getLigado()){
              this.setVolume(this.getVolume()-1);
          }
    }

    @Override
    public void ligarMudo() {
          if(this.getLigado() && this.getVolume()>0){
              this.setVolume(0);
          }
    }

    @Override
    public void desligarMudo() {
           if(this.getLigado() && this.getVolume() == 0){
               this.setVolume(50);
           }
    }

    @Override
    public void play() {
           if(this.getLigado() && !(this.getTocando())){
               this.setTocando(true);
           }
    }

    @Override
    public void pause() {
           if(this.getLigado() && this.getTocando()){
               this.setTocando(false);
           }
    }
    
    
    
    
}
