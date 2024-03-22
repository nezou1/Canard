public class Cygnes extends Animaux{

    public Cygnes(){
        super();
        this.couleur = "Blanc";
        this.points = 5;
    }

    public String toString(){

        return "Cygne"+ Cygnes.getId();
    }
}
