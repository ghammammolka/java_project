import java.util.Scanner;
public class Additionner {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Additionner <nombre1> <nombre2>");
            return;
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int somme = n1 + n2;
            System.out.println("La somme est : " + somme);
        } catch (NumberFormatException e) {
            System.out.println("Les arguments doivent être des nombres entiers.");
        }
    }
}

