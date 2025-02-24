public class Tableaux {
    public static void main(String[] args) {
       int [] tab1 = {15, 25, 345}; // On crée un tableau tab1
       int [] tab2 = new int[3]; // On crée un tableau tab2 de même taille que tab1
        for (int i = 0; i < tab1.length; i++) { // On parcourt le tableau tab1
            tab2[i] = tab1[i]; // On copie les éléments de tab1 dans tab2
        }

        for (int i = 0; i < tab2.length; i++) { // On parcourt le tableau tab2
            System.out.println(tab2[i]); // On affiche les éléments de tab2
        }

    }
}