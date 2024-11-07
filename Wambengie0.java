public class Wambengie0 {

    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX = 6;
    public final static int NBR_NOTES = 5;

    public static void main(String[] args) {

        int[] notesObtenues = new int[NBR_NOTES];
        float totalNote = 0;
        // j'aurais du mettre lui aussi en float

        for (int i = 0; i < notesObtenues.length; i++) {
            int random = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1)) + NOTE_MIN;
            notesObtenues[i] = random;

            totalNote = totalNote + notesObtenues[i];

        }

        /*
         * for (int i = 0; i < notesObtenues.length; i++) {
         * if (notesObtenues[i] == NOTE_MAX) { System.out.println("La note obtenu est "+
         * notesObtenues[i] + " : Très bien" );
         * }
         * 
         * else if (notesObtenues[i] ==5) { System.out.println("La note obtenu est  "+
         * notesObtenues[i] + " : Bien" );
         * }
         * else if (notesObtenues[i] ==4 ) { System.out.println("La note obtenu est  "+
         * notesObtenues[i] + " : Suffisant" );
         * } else { System.out.println("La note obtenu est  "+ notesObtenues[i] +
         * " : Insuffisant");
         * }
         * 
         * 
         * }
         */

        for (int i = 0; i < notesObtenues.length; i++) {

            switch (notesObtenues[i]) {
                case 6:
                    System.out.println("La note obtenu est : " + notesObtenues[i] + " Très bien");
                    break;

                case 5:
                    System.out.println("La note obtenu est : " + notesObtenues[i] + " Bien");
                    break;

                case 4:
                    System.out.println("La note obtenu est : " + notesObtenues[i] + " Suffisant");
                    break;

                default:
                    System.out.println("La note obtenu est : " + notesObtenues[i] + " Insuffisant");
            }
        }

        float moyenne;
        moyenne = totalNote / notesObtenues.length;
        System.out.println(" La moyenne est de : " + moyenne);

        if (moyenne > 4) {
            System.out.println("L'éléve est promu");

        } else {
            System.out.println("L'éléve est non promu");
        }

    }
}
