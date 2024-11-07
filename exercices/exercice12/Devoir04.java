public class Devoir04 {

    public static void main(String[] args) {

        int annee = 2024;
        int mois = 2;
        int jour = 8;

        if (annee < 0 || annee >= 9999) {
            System.out.println("L'année est " + annee + " est hors limite");

        }

        else
            System.out.println("La date formatée est le " + jour + " février " + annee);
        // comment formater le mois en texte ?? //

        if (jour < 0 || jour > 31) {
            System.out.println("Le jour est " + jour + " est hors limite");

        }
        // manque les mois de 30 jours et le mois de février //

        if (mois < 0 || mois > 12) {
            System.out.println("Le mois est " + mois + " est hors limite");

        }

        /*
         * mickail
         * String[] tabMois = {"Janvier", "Février", "Mars"};
         * String moisTexte = tabMois[mois-1];
         * System.out.println(moisTexte);
         * 
         * ou alors tu fais un switch
         * 
         * 
         */

         /* 
        String moisTexte;
        switch (mois) {
            case 1:
                moisTexte = "Janvier";

                break;

            case 2:
                moisTexte = "Février";
                break;

            case 3:
                moisTexte = "Mars";

                break;
            default:
                break;
        
        }
                */
    }
}