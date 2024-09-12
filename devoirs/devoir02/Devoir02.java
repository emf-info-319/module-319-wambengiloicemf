package devoirs.devoir02;

public class Devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;
// à quoi sert les constantes ?
    public static void main(String[] args) {

        int reservoirA = 0;
        int reservoirB = 0;

        int MIN = 2;
        int MAX = 4;

        int remplissage = 8;

        int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        System.out.println("Valeur de remplissage " + nombre);


        while (reservoirA + reservoirB < remplissage) { 
            reservoirA++; remplissage--; 
            System.out.println(reservoirA + reservoirB);
            if (reservoirA == 3) { 
                reservoirB++ ; remplissage--;
                
            } 

        }
    }

}
