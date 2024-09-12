public class ExerciceBoucles2 {
    public static void main(String[] args) {
       
        
        for (int f = 5; f > 0; f--) {
            System.out.println("Boucle for, f : " + f);
        }
        System.out.println("Décollage !!");

        int w = 5;
        boolean pendant = true;

        while (pendant) {

            System.out.println("w : " + w);
            w--;
            if (w < 1) {
                pendant = false;
            }
        }
        System.out.println("Décollage !!");


        int nombredw = 6;
        boolean fairePendant = true;

        do {
            nombredw--;
            System.out.println("Nombredw : " + nombredw);
            if (nombredw < 2) {
                fairePendant = false;
            }

        } while (fairePendant);
        System.out.println("Décollage !!");
    }
}
