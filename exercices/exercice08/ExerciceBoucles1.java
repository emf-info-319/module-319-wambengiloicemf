package exercices.exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {

        for (int f = 1; f < 6; f++) {
           // grâce à cette ligne if je dis que si f  est égal à trois alors avant d'afficher le
           // sout on ajoute 1 
            if (f ==3) { 
                continue;
               // moi j'ai fait if f==3 alors f++; juste mais pas optimal pour long code
                
            }
            System.out.println("Boucle for, f : " + f);
    
        }

        int w = 1;
        boolean pendant = true;

        while (pendant) {

            System.out.println("w : " + w);
            w++;
            if (w > 3) {
                pendant = false;
            }

        }

        int nombredw = 0;
        boolean fairePendant = true;

        do {
            nombredw++;
            System.out.println("Nombredw : " + nombredw);
            if (nombredw > 4) {
                fairePendant = false;
            }

        } while (fairePendant);
    }


}
