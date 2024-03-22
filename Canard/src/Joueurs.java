import java.util.ArrayList;

public class Joueurs extends Personne{

    ArrayList<Animaux> animauxGagne = new ArrayList<>();
    public Joueurs(String nom){
        super();
    }

    public void pecher(){

        int nbAlea = (int)(Math.random() * 10);
        if(Mare.tabAnimaux[nbAlea] != null){
            animauxGagne.add(Mare.tabAnimaux[nbAlea]);
            Mare.tabAnimaux[nbAlea] = null;
        }
    }


}
