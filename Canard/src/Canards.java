public class Canards extends Animaux{

    public Canards(String couleur){
        super();
        this.couleur = couleur;
        this.points = 3;
    }

    public String toString(){

        return "Canard" + Canards.getId();
    }
}
