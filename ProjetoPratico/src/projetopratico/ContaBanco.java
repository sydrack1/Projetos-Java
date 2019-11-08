package projetopratico;

public class ContaBanco {
    
    // ATRIBUTOS
     
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // CONSTRUTOR
    
    public ContaBanco(){
        this.setSaldo(0);
        this.abrirConta(1, "SEU NOME","CC");
    }
    
    // MÉTODOS PERSONALIZADOS
    
    public void abrirConta(int n,String d,String t){
        this.setNumConta(n);
        this.setDono(d);
        if(t.equals("CC") || t.equals("cc")){
            this.setSaldo(saldo+=50);
            this.setTipo("CC");
        }else if(t.equals("CP") || t.equals("cp")){
            this.setSaldo(saldo+=150);
            this.setTipo("CP");
        }else{
            System.out.println("NÃO EXISTE ESSA MODALIDADE");
        }
        this.setStatus(true);
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("TIRE SEU DINHEIRO");
        }else if(this.getSaldo() < 0){
            System.out.println("PAGUE O QUE DEVE");
        }else{
            this.setStatus(false);
        }
    }
    public void depositar(int v){
        if(this.getStatus()){
            this.setSaldo(saldo+=v);
        }else{
            System.out.println("ESSA CONTA ESTÁ INDISPONÍVEL");
        }
    }
    public void sacar(int v){
      if(this.getStatus()){
        if(this.getSaldo() > v){
            this.setSaldo(saldo-=v);
        }else{
            System.out.println("NÃO TEM SALDO SUFICIENTE");
        }
      }else{
          System.out.println("ESTA CONTA ESTÁ INDISPONÍVEL");
      }
    }
    public void pagarMensal(){
      if(this.getStatus()){  
        int v;
        if(this.getTipo() == "CC" ){
            v = 12;
            this.setSaldo(saldo-=v);
        }else{
            v = 20;
            this.setSaldo(saldo-=v);
        }
      }else{
          System.out.println("ESTA CONTA ESTÁ INDISPONÍVEL");
      }  
    }
    
    // GETTERS E SETTERS

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    
    
}
