package revisions;

public class Wambengi319E00 {

    public final static int NOMBRE_PTS_VICTOIRE = 3;

    public static void main(String[] args) {

        String nomEquipe1 = "Barcelone";
        String nomEquipe2 = "Madrid";

        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;

        for (int random = 0; random < 10; random++) {
            System.out.println(random);

            int scoreEquipe1 = (int) (Math.random() * (10 - 1 + 1)) + 1;
            int scoreEquipe2 = (int) (Math.random() * (10 - 1 + 1)) + 1;

            System.out.println(nomEquipe1 + " joue contre " + nomEquipe2 + " et le résultat est de : " + scoreEquipe1
                    + " et " + scoreEquipe2);

                    System.out.println("Nombre point Barcelone " + nombrePointEquipe1 + " Nombre point Madrid " + nombrePointEquipe2 );

            if (scoreEquipe1 < scoreEquipe2) {
                nombrePointEquipe1 += NOMBRE_PTS_VICTOIRE;
                System.out.println("Barcelone a gagné");
            }

            else if (scoreEquipe1 > scoreEquipe2) {
                nombrePointEquipe2 += NOMBRE_PTS_VICTOIRE;
                System.out.println("Madrid a gagné");

            } else if (scoreEquipe1 == scoreEquipe2) {
                nombrePointEquipe1 += 1;
                nombrePointEquipe2 += 1;
                System.out.println("Match nul");

            }

        }

        System.out
                .println("Barcelone a " + nombrePointEquipe1 + " point " + "Madrid a " + nombrePointEquipe2 + " point");

    }

}
