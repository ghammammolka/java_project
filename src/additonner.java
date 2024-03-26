
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
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("entrer le premier nombre :");
        int n1 = scanner.nextInt();
        
        System.out.print("entrer le deuxiÃ¨me nombre :");
        int n2 = scanner.nextInt();
        
        int somme = n1 + n2;

        System.out.println("La somme est :" + somme);
    }
    
}
