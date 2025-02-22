import java.util.Scanner; //Importation de la classe Scanner du package java.util

public class Boucles { //La classe Boucles commence ici.

    public static void main(String[] args) { //La methode main commence ici.

       Scanner clavier = new Scanner(System.in); //Creation d'un objet Scanner pour 
       //lire les entrees de l'utilisateur.

      int age; //Declaration de la variable age.

      do { //Debut de la boucle do...while
        System.out.println("Entrez votre age: "); //Demande a l'utilisateur d'entrer son age.
        age = clavier.nextInt(); //Lecture de l'age entree par l'utilisateur.

        if (age <= 0) { //Si l'age est negatif ou nul
          System.out.println("L'age doit etre positif !"); //Affiche un message d'erreur.
        } else if (age >= 18) { //Si l'age est superieur ou egal a 18
          System.out.println("Vous etes majeur."); //Affiche un message.

      } else if (age < 18) { //Si l'age est inferieur a 18
          System.out.println("Vous etes mineur.");   //Affiche un message.
        } //Fin de la structure conditionnelle if...else
       }while (age <= 0); // tant que l'age est negatif ou nul, on redemande
       
    } //Fin de la méthode main
    } //Fin de la classe Boucles