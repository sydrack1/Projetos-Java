package sobrecargapolimorfismopoo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SobrecargaPolimorfismoPOO {

    public static void main(String[] args) {
        Date anoAtual = new Date();
        DateFormat horaAtual = new SimpleDateFormat("HH");
        DateFormat minutoAtual = new SimpleDateFormat("mm");
        int hora = Integer.parseInt(horaAtual.format(anoAtual));
        int minuto = Integer.parseInt(minutoAtual.format(anoAtual));
        
           Cachorro c = new Cachorro();
           
           c.setCorPelo("Branco");
           c.emitirSom();
           c.reagir("Porra");
           c.reagir(false);
           c.reagir(8, 16.9f);
           c.reagir(hora, minuto);
           
    }
    
}
