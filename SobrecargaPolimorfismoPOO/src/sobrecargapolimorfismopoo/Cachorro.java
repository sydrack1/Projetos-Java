package sobrecargapolimorfismopoo;



public class Cachorro extends Lobo{
    
    // Métodos Especiais
    // Sobreposição
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au! ");
    }
    // Sobrecarga
    
    public void reagir(String frase){
        if(frase.equals("Quer comida") || frase.equals("Ola")){
            System.out.println("Abanar o rabinho");
        }else{
            System.out.println("Rosnar para espantar");
        }
    }
    public void reagir(int hora,
                       int min){
        if(hora < 12){
            System.out.println("Abanar, porque está cedo");
        }else if(hora >= 18){
            System.out.println("Ignorar, porque o cachorro está com sono");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar o rabinho para o dono");
        }else{
            System.out.println("Rosnar e latir para o estranho");
        }
    }
    public void reagir(int idade,
                       float peso){
        if(idade<5){
            if(peso < 8){
                System.out.println("Abanar, porque o cachorro é leve e novo");
            }else{
                System.out.println("Latir, porque o cachorro é pesado e novo");
            }
        }else{
            if(peso < 8){
                System.out.println("Rosnar, porque o cachorro é leve e velho");
            }else{
                System.out.println("Ignorar, porque o cachorro é pesado e velho");
            }
        }
    }
    
}
