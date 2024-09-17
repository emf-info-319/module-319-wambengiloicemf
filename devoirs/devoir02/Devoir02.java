package devoirs.devoir02;

public class Devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    // à quoi sert les constantes ?
    public static void main(String[] args) {

        int reservoirA = 0;
        int reservoirB = 0;

        int MIN = 0;
        int MAX = 8;

        int remplissage = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        System.out.println("Valeur de remplissage " + remplissage);

        // j'ai du mal à appliquer la consigne plus loin que çaje ne comprends pas ce
        // qui se passe dans mon programme j'ai essayé de demander à chatgpt de m'expliquer ce qzui m'a permis d^'apporter deux trois amélioration mais je reste bloqué ici

        while (reservoirA + reservoirB < remplissage) {
            reservoirA++;
            remplissage--;
            System.out.println("reservoir a : " + reservoirA + " / reservoir b : "+ reservoirB);
            System.out.println("reservoir de remplissage " + remplissage);
            if (remplissage > 0) {
                break;

            }
            else if (reservoirA == 3) {
                reservoirB++;
                remplissage--;

            }
           

        }
    }

}
