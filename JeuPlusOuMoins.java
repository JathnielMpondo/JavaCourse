import java.util.Scanner;

public class JeuPlusOuMoins {
    public static void main(String[] args) {
        int nombre_secret, nombre_user; // Déclaration des variables
        
        Scanner clavier = new Scanner(System.in); // Création d'un objet Scanner pour lire les entrées de l'utilisateur

        nombre_secret = (int) (Math.random() * 10); // Génère un nombre aléatoire entre 0 et 10

        do {
            System.out.print ("Entrez un nombre entre 0 et 10: ");
            nombre_user = clavier.nextInt();

            if (nombre_user < nombre_secret) {
                System.out.println("Le nombre secret est plus grand.");
            } else if (nombre_user > nombre_secret) {
                System.out.println("Le nombre secret est plus petit.");
            } else {
                System.out.println("Bravo, vous avez trouvé le nombre secret !");
            }
        } while ( nombre_user != nombre_secret);

    }
}
