import java.util.ArrayList;

public class Mare {

    static Animaux[]  tabAnimaux;
    private static int nbTour;
    ArrayList<Joueurs> listeJoueurs = new ArrayList<>();
    ArrayList<Animateurs> listeAnim = new ArrayList<>();
    public Mare(){

        int j;
        tabAnimaux  = new Animaux[10];
        for(int i = 0 ; i< 7 ; i++){
            if(i%2 == 0){
                Cygnes cygne = new Cygnes();
                tabAnimaux[i] = cygne;
            }else{
                Canards canards = new Canards("Jaune");
                tabAnimaux[i] = canards;
            }
        }

        nbTour = 0;

    }

    private static void AvancerCanards() {
        int i;
        Animaux[] newTab = new Animaux[10];
        for (i = 0; i < 9; i++) {
            newTab[i + 1] = tabAnimaux[i];
        }
        newTab[0] = tabAnimaux[9];
        for (i = 0; i < 10; i++) {
            tabAnimaux[i] = newTab[i];
        }
    }

    public static int setTour(){
        AvancerCanards();
        nbTour++;
        return nbTour;
    }

    public static int getTour(){ return nbTour;}



}
