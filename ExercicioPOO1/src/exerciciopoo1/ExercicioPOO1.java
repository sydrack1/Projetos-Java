package exerciciopoo1;

public class ExercicioPOO1 {

    public static void main(String[] args) {
     Video v[] = new Video[3];
     Gafanhoto g[] = new Gafanhoto[2];
     
     v[0] = new Video("Ionic 3");
     v[1] = new Video("React Native");
     v[2] = new Video("Xamarin.forms");   

     g[0] = new Gafanhoto("Dario",26,"MASC","Leão");     
     g[1] = new Gafanhoto("Fernanda",14,"FEM","BoNiTiNhAnOaZeItE");   
     
     Visualizacao vis = new Visualizacao(g[0] , v[0]);
     Visualizacao vis1 = new Visualizacao(g[1] , v[0]);
     vis.avaliar(98f);
     
        System.out.println(vis.toString());
        System.out.println(vis1.toString());
    }
    
}
