public class CodageRound {

    public final static double PI = 3.14;

    public static void main(String[] args) {

        int[] rayons = new int[10];

        int min = 1;
        int max = 10;

        for (int index = 0; index < rayons.length; index++) {
            rayons[index] = genereNombre(min, max);


        }

        



        for (int i = rayons.length - 1; i >= 0; i--) {
            if (rayons [i] > 50) {
              
            }
       

        }


    }

    public static int genereNombre(int min, int max) {

        int random = (int) (Math.random() * (max - min + 1)) + min;
        return random;

    }

}
