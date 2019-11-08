package aula07poo;

public class Lutador {
    
// Atributos   
    private String nome;
    private String nacionalidade;
    private String categoria;
    private float peso;
    private float altura;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    
// Métodos acessores

    public Lutador(String nom, String nac, float pes, float alt, int ida, int vit, int der, int emp) {
        this.setNome(nom);
        this.setNacionalidade(nac);
        this.setPeso(pes);
        this.setAltura(alt);
        this.setIdade(ida);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(emp);
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso()>=52.2 && this.getPeso()<=120.2){
            if(this.getPeso()<=70.3){
            this.categoria = "Pena";
            }else if(this.getPeso()<=83.9 && this.getPeso()>70.3){
                this.categoria = "Médio";
            }else{
                this.categoria = "Pesado";            }
        }else{
            this.categoria = "Inválido";
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
  
  // Métodos Públicos
     public void apresentar(){
         System.out.println("Esse é o lutador "+
                 this.getNome() + " da modalidade "+
                 this.getCategoria());
     }  
     public void status(){
         System.out.println("Nome: "+this.getNome()+
                 " Idade: "+this.getIdade()+
                 " Origem: "+this.getNacionalidade()+
                 " Altura e peso: "+this.getAltura()+" "+this.getPeso()+
                 " Vitórias: "+this.getVitorias());
     }
     public void ganharLuta(){
         this.setVitorias(this.getVitorias()+1);
     }
     public void perderLuta(){
         this.setDerrotas(this.getDerrotas()+1);
     }
     public void empatarLuta(){
         this.setEmpates(this.getEmpates()+1);
     }
}
