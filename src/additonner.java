public class additonner {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez fournir deux nombres en argument.");
            return; // Quitte le programme si les arguments ne sont pas fournis
        }

        // Convertit les arguments en entiers
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int somme = n1 + n2;
            System.out.println("La somme est : " + somme);
        } catch (NumberFormatException e) {
            System.out.println("Les arguments ne sont pas des nombres valides.");
        }
    }
}
