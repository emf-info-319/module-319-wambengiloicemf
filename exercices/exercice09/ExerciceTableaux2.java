package exercices.exercice09;

public class ExerciceTableaux2 {
    public final static int MIN = 1;
    public final static int MAX = 6;

    public static void main(String[] args) {

        int[] montab = new int[10]; // déclaration du tableau 

        for (int i = 0; i < montab.length; i++) {
            int random = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            montab[i] = random;
            System.out.println(montab[i]);


            /*montab[1 + i] = (int) (Math.random() * (MIN - MAX + 1)) + MIN;
            System.out.println(montab[i]);*/

        }



/*



        int[] tableau =new int[10];
        int caseDuTableau=0;
       

        while (caseDuTableau!=5) {
            int chiffre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            tableau[caseDuTableau]=chiffre;
            caseDuTableau++;

            fori
        }*/
    }


}
