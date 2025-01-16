public class Eval1 {

    public final static int TEMPS_MIN = 35;
    public final static int TEMPS_MAX = 75;

    public static void main(String[] args) {

        String[] riders = { "Kilian", "Max", "Noé", "Beat", "André", "Alex", "John", "Fred" };

        int tour = 1;
        int numeroMeilleurRider =0;

        while (riders.length >= 2) {

            int tabTemps[] = genererTemps(riders.length);

            switch (tour) {
                case 1:
                    System.out.println("Résultat du quart de final :");

                    break;

                case 2:

                    System.out.println("Résultat de la demi-finale :");

                    break;

                case 3:

                    System.out.println("Résultat de la finale :");

                    break;

                default:
                    break;

            }

            for (int index = 0; index < riders.length; index++) {
                System.out.print(riders[index] + " " + "[" + tabTemps[index] + "],");

            }

            System.out.println(" ");
            System.out.println("----------------");
            tour++;

            riders = calculQualification(tabTemps, riders, numeroMeilleurRider);

            int retourtemps = positionMeilleurTemps(tabTemps);
            for (int index = 0; index < riders.length; index++) {
              
                System.out.print(riders[index] + " " + "[" + tabTemps[retourtemps] + "],");
                
                retourtemps = positionMeilleurTemps(tabTemps);
               
            }
            System.out.println(" ");
            System.out.println("----------------");
            tour++;

        }

    }

    public static int[] genererTemps(int tailleTableau) {

        int[] tableaux = new int[tailleTableau];

        for (int index = 0; index < tableaux.length; index++) {
            tableaux[index] = (int) (Math.random() * (TEMPS_MAX - TEMPS_MIN + 1)) + TEMPS_MIN;

        }

        return tableaux;
    }

    public static int positionMeilleurTemps(int[] tabTemps) {

        // comment faire pour retourner l'index de la premiere valeur

        int minimum = tabTemps[0];

        //int meilleurTemps = 0;

        for (int index = 0; index < tabTemps.length; index++) {
            minimum = Math.min(minimum, tabTemps[index]);
        }

        // recherche première occurence 
        int retour =0;
        for (int index = 0; index < tabTemps.length; index++) {
            if (minimum == tabTemps[index]) {
                 retour = index;
                break;

            }
    
           
        }
        return retour ; 
      
      

    }

        /* */
      

    public static String[] calculQualification(int[] tabTemps, String[] Riders, int numeroMeilleurRider) {

        String[] ridersRestant = new String[Riders.length / 2];

        for (int index = 0; index < ridersRestant.length; index++) {

           numeroMeilleurRider = positionMeilleurTemps(tabTemps);

            ridersRestant[index]  = Riders[numeroMeilleurRider];

            tabTemps[numeroMeilleurRider] = Integer.MAX_VALUE;

            


        }
 
     
       

        return ridersRestant;

    }

}
