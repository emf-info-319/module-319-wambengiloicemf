public class ExerciceTableaux3 {
    public final static int MIN = 1;
    public final static int MAX = 6;

    public static void main(String[] args) {

        int[] montab = new int[10]; // déclaration du tableau

        int total = 0;
    

        for (int i = 0; i < montab.length; i++) {

            int random = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            montab[i] = random; // le i changeant de valeur permet d'assigner à chaque tour de boucle une
                                // nouvelle valeur à une case incrementer de 1
            System.out.println(i);

           total = total + montab[i];

// j'arrive vraiment pas à trouver un moyen d'additioner les résultats random
            System.out.println("Total actuel" + total);
        }

        float moyenne;
      moyenne =  total / montab.length;

      System.out.println("moyenne " + moyenne);

        // trouver la moyenne => total / nombreNote

    }
}
