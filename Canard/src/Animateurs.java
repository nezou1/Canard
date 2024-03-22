public class Animateurs extends Personne {
    public Animateurs(String nom){
        super();
    }

    public void ajouter(Animaux animal){
        int cmpt = 0;
        for(int i = 0; i< Mare.tabAnimaux.length; i++){
            if(Mare.tabAnimaux[i] == null){
                cmpt++;
            }
        }

        if(cmpt > 4){
            Animaux newAnimal = new Animaux();
            for(int i = 0; i< Mare.tabAnimaux.length; i++){
                if(Mare.tabAnimaux[i] == null){
                    Mare.tabAnimaux[i] = newAnimal;
                }
            }
        }

    }
}
