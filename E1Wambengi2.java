import java.util.Scanner;

// j'ai pas un jeu qui marche parfaitement il ,m'aurait fallu un peu de temps pour pouvoir améliorer quelques détails

public class E1Wambengi2 {

    public final static int DES_MIN = 1;
    public final static int DES_MAX = 6;
    public final static int NOMBRES_TUILES = 12;

    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] tuiles = new int[NOMBRES_TUILES];

        boolean enJeu = true;

        System.out.println("**********************************");
        System.out.println("* 'Shut The Box' *");
        System.out.println("**********************************");
        System.out.println(
                "Il faut baisser les tuiles pour avoir un total équivalent au total de la sommes des dès. Le 0 \r\n" + //
                        "permet de terminer la partie.");

        for (int index = 0; index < tuiles.length; index++) {

            tuiles[index] = 1;

        }

        while (enJeu = true) {

            afficheTuiles(tuiles);

            int totalDes = tireLesDes();

            System.out.println(" Donnez les nombres à enlever");

            tuiles = enleveTuiles(tuiles, totalDes);

            boolean encore = contientEncoreDesTuilesABaisser(tuiles);

            if (encore == false) {
                System.out.println(" Jeu termine");

                scanner.close();
                enJeu = false;


            }
        }

    }


    public static boolean contientEncoreDesTuilesABaisser ( int []tabTuiles) {

        boolean retour = false ;

        for (int index = 0; index < tabTuiles.length; index++) {

            if (tabTuiles [index] != 0 ) { 
                return true ;
                
            }

            
            
        }

        return false ;

    }

    // j'ai renommé le paramètre de méthode tuiles en tab tuiles pour pas
    // confondre avec tableau du main dénommé tuiles
    public static void afficheTuiles(int[] tabTuiles) {

        // j'ai choisi a la fin de sortir l'index de la boucle pour essayer de la réiniatialiser a cahquue iteration 
        int index ;
        for (index = 0; index < 10; index++) {

            if (tabTuiles[index] == 0) {
                System.out.print("_ _");

            }

            else
                System.out.print("0" + index + "|");

        }



        for (index = 10; index < tabTuiles.length; index++) {

            if (tabTuiles[index] == 0) {
                System.out.print("_ _");
            }
            

            else
                System.out.print(index + "|");

        }

        index = 0;



    }

    public static int tireLesDes() {

        int valeur1 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int valeur2 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;

        int total = valeur1 + valeur2;

        System.out.println(" Les nomnbres tirés sont " + valeur1 + " et " + valeur2 + " qui font un total de " + total);

        return total;

    }

    public static int[] enleveTuiles(int[] tabTuiles, int totalDesDes) {

        int[] tuilesTemp = copieTableau(tabTuiles);

        int totalEnleve = 0;
        boolean demandeEncore = true;

        do {

            int valeur = scanner.nextInt();
            totalEnleve = valeur + totalEnleve;
            if (valeur == 0) {
                System.out.println("Abandon...");
                for (int index = 0; index < tuilesTemp.length; index++) {
                    tuilesTemp[index] = 0;

                }

                int[] retourCopieTableau = copieTableau(tuilesTemp);
                // j'ai choisi dappeler le retour de ma méthode copie tableau ainsi afin de
                // respecter
                // la régle dont vous nous avez parlé qui disait quil etait mieux d'enregistrer
                // nos tableaux dans une variable d'enregistrement

                demandeEncore = false;

            }

            else if (valeur < 1 || valeur > tuilesTemp.length) {

                System.out.println("Hors limites !");

                totalEnleve = 0;

            }

            else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println(" Vous avez déjà baissé la tuile à la position " + valeur);
                totalEnleve = valeur - totalEnleve;
            } else if (totalEnleve < totalDesDes) {
                tuilesTemp[valeur - 1] = 0;
                System.out.println("Ce n'est pas suffisant, merci d'enlever encore");

            }

            else if (totalEnleve > totalDesDes) {
                System.out.println(" Le total est dépassez, choississez d'autres nombres");
                tuilesTemp = copieTableau(tabTuiles);
                totalEnleve = 0;

                afficheTuiles(tabTuiles);

            }

            else {

                tuilesTemp[valeur - 1] = 0;
                System.out.println(" Parfait ");
                tabTuiles = copieTableau(tuilesTemp);
                demandeEncore = false;
            }

        } while (demandeEncore == true);

        return tabTuiles;
    }

    public static int[] copieTableau(int[] tabTuiles) {

        int[] copie = new int[tabTuiles.length];

        for (int i = 0; i < tabTuiles.length; i++) {
            copie[i] = tabTuiles[1];

        }
        return copie;
    }

}
