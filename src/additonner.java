import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class additonner {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer le premier nombre : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ce n'est pas un entier. Veuillez entrer un entier.");
            scanner.next(); // Consommer l'entrée invalide
        }
        int n1 = scanner.nextInt();
        
        System.out.print("Entrer le deuxième nombre : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ce n'est pas un entier. Veuillez entrer un entier.");
            scanner.next(); // Consommer l'entrée invalide
        }
        int n2 = scanner.nextInt();
        
        int somme = n1 + n2;

        System.out.println("La somme est : " + somme);
    }
}
