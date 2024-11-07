import java.util.Scanner;

public class Devoir05 {

    public final static int limiteSupComprise = 100;
    public final static int limiteInfComprise = 1;

    public static void main(String[] args) {
        int nbre = (int) (Math.random() * (limiteSupComprise - limiteInfComprise + 1)) + limiteInfComprise;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une valeur svp : ");
        int valeur = scanner.nextInt();
        //scanner.nextLine();

        while (valeur != nbre) {

            if (valeur < nbre) {
                System.out.println("Plus Grand");

            } else if (valeur > nbre) {
                System.out.println("Plus petit");

            }
           
            System.out.print("Entrez à nouveau une valeur svp : ");
            valeur = scanner.nextInt();
            // t'avais essayé de remettre le scanner mais t'avais remis le int y fallait 

            
        }
        // j'ai du mal à comprendre comment structurer la boucle pour relancer
        // l'instruction de taper dans le scanner
        // je peux pas mettre dans la boucle sinon je peux pas utiliser la valeur
        // "valeur"

        System.out.println("Bravo");

    }

}
