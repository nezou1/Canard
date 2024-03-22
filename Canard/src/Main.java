import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animateurs nezha = new Animateurs("Nezha");
        Joueurs younes = new Joueurs("Younes");
        Mare mare = new Mare();
        System.out.println(Arrays.toString(Mare.tabAnimaux));
        Mare.setTour();
        System.out.println(Arrays.toString(Mare.tabAnimaux));
        System.out.println(Mare.getTour());
        Mare.setTour();
        System.out.println(Arrays.toString(Mare.tabAnimaux));
        System.out.println(Mare.getTour());


    }
}