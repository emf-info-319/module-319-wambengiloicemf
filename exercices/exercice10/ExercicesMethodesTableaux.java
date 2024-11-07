package exercices.exercice10;
public class ExercicesMethodesTableaux {

    public static void main(String[] args) {

        int valeurTailleTab = 50;
        int[] monTab = creerTab(valeurTailleTab);

        // Affichage de la taille du tableau pour vérifier
        System.out.println("Taille du tableau : " + monTab.length);

       
        remplirTab(monTab);

        // Affichage des valeurs du tableau pour vérifier son contenu
        for (int valeur : monTab) {
            System.out.print(valeur + " ");
        }

        remplissageAleatoire(monTab, 20, 1);

        // Affichage des valeurs du tableau pour vérifier son contenu

        for (int index = 0; index < monTab.length; index++) {
            System.out.println("Chiffre aléatoire de mon tableau " + monTab[index] + " !");
        }


        // j'ai du mal a faire stocker sur une valeur int à part comme y faudrait //

        quelleTaille(monTab);

        lireTableau(monTab);

        minimumTableau(monTab);

        maximumTableau(monTab);

        compterFrequence(monTab);

        sommeTableau(monTab);

        moyenneTableau(monTab);

        int valeurCherché = 3;
        int valeurRemplacement = 82;

        remplacerValeur(monTab, valeurCherché, valeurRemplacement);

        for (int index = 0; index < monTab.length; index++) {
            System.out.println("Nouveau tableau avec valeur changé " + monTab[index] + " !");
        }

        int chiffre = 2 ; 
        premiereOccurence(monTab, chiffre);

        int chiffre2 = 5;

        derniereOccurrence(monTab, chiffre2);

    }

    public static int[] creerTab(int tailleTab) {

        int[] tableaux = new int[tailleTab];

        return tableaux;

    }

    public static void remplirTab(int[] tableau) {
        for (int index = 0; index < tableau.length; index++) {
            tableau[index] = index;
        }
    }

    // je sais pas comment remplir jusqu'à 5
    public static void remplissageAleatoire(int[] tableau, int grandChiffre, int petitChiffre) {

        for (int index = 0; index < tableau.length; index++) {
            int resultat = (int) (Math.random() * (grandChiffre - petitChiffre + 1)) + petitChiffre;
            tableau[index] = resultat;

        }

    }

    public static int quelleTaille(int[] tableau) {

        System.out.println("La taille du tableau est : " + tableau.length);
        int resultat = tableau.length;
        return resultat;

    }

    public static void lireTableau(int[] tableau) {

        for (int index = 0; index < tableau.length; index++) {
            System.out.println("Contenu du tableau " + tableau[index]);
        }

    }

    // j'ai eu besoin de Chat GPT pour utiliser la fonction Math.min //

    public static int minimumTableau(int[] tableau) {

        int minimum = tableau[0];
        for (int index = 0; index < tableau.length; index++) {
            minimum = Math.min(minimum, tableau[index]);
        }

        System.out.println("Plus petit chiffre du tableau " + minimum);

        return minimum;
    }

    // Méthode 7 //
    public static int maximumTableau(int[] tableau) {

        int maximum = tableau[0];
        for (int index = 0; index < tableau.length; index++) {
            maximum = Math.max(maximum, tableau[index]);
        }

        System.out.println("Plus grand chiffre du tableau " + maximum);

        return maximum;
    }

    // Méthode 8 j'ai ppas réussi c'est chatgpt //

    public static int compterFrequence(int[] tableau) {
        int compteur = 0;
        int valeur = 4;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                compteur++;
            }
        }
        System.out.println("La valeur " + valeur + " apparaît " + compteur + " fois dans le tableau.");
        return compteur;
    }


    // Méthode 9 //

    public static int sommeTableau(int[] tableau) {

        int somme = 0;
        for (int index = 0; index < tableau.length; index++) {
            somme = somme + tableau[index];

        }

        System.out.println("Somme " + somme);

        return somme;
    }

    // Méthode 10 //

    public static int moyenneTableau(int[] tableau) {

        int somme = 0;
        for (int index = 0; index < tableau.length; index++) {
            somme = somme + tableau[index];

        }

        int moyenne = somme / tableau.length;

        System.out.println("Moyenne  " + moyenne);

        return moyenne;

    }

    // Méthode 11 //

    public static void remplacerValeur(int[] tableau, int valeurCherché, int valeurRemplacement) {

        for (int index = 0; index < tableau.length; index++) {

            if (tableau[index] == valeurCherché) {
                tableau[index] = valeurRemplacement;

            }

        }

    }

    // Méthode 12 //

    public static int premiereOccurence(int[] tableau, int chiffreCherche) {

        for (int index = 0; index < tableau.length; index++) {
            if (chiffreCherche == tableau [index] ) {

                int retour = index;
                System.out.println("La valeur " + chiffreCherche +  " a été trouvée la première fois à la position N° "+ retour );
                return retour ;

            
                
            }
           
            
        }

        int valeurEchec = -1;
        System.out.println("Valeur introuvable ");

        return valeurEchec;

    }

    // Méthode 13 //

    public static int derniereOccurrence(int[] tableau, int chiffreCherche) {
        for (int index = tableau.length - 1; index >= 0; index--) {
            if (tableau[index] == chiffreCherche) {

                System.out.println("La valeur " + chiffreCherche +  " a été trouvée la dernière fois à la position N° "+ index );

                return index; // Retourne l'index dès que la dernière occurrence est trouvée
            }
        }
        System.out.println("Valeur introuvable ");
        return -1; // Retourne -1 si la valeur n'est pas dans le tableau
    }


}
