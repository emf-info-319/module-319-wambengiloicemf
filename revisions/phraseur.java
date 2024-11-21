package revisions;

public class phraseur {

    public final static int MIN = 0;

    public static void main(String[] args) {

        String[] tabChaineSujet = new String[] { "Law", "Kanye West", "Le Dalai Lama" };
        String[] tabChaineVerbe = new String[] { "mange", "détrousse", "cours sur" };
        String[] tabChaineChose = new String[] { "un Mac", "l'eau", "la police" };

        for (int i = 0; i <= 10; i++) {
            System.out.print(choisirMot(tabChaineSujet)+" ");
            System.out.print(choisirMot(tabChaineVerbe)+" ");
            System.out.println(choisirMot(tabChaineChose));

        }

    }

    public static int nbrAleatoire(int max, int MIN) {

        int random = (int) (Math.random() * (max - MIN + 1)) + MIN;

        return random;
    }

    public static String choisirMot(String[] tabChoisi) {

        int x = nbrAleatoire(tabChoisi.length -1, MIN);

        return tabChoisi[x];
    }

}
