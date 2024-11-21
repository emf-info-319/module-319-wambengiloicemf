package revisions;

public class livret {

    public final static int MIN = 5;
    public final static int MAX = 20;
    public static void main(String[] args) {

        int aleatoire = choisirUnNombre(MIN, MAX);
        int aleatoire2 = choisirUnNombre(MIN, MAX);

        System.out.println(aleatoire +" "+ aleatoire2);
        String[] tableMultiplication = construireTableMultiplication(aleatoire, aleatoire2);
 
        for (int index = 0; index < tableMultiplication.length; index++) {
            System.out.println(tableMultiplication[index]);

        }


    }


    public static int choisirUnNombre (int chiffreUn, int chiffreDeux) {

        int random = (int) (Math.random() * (chiffreUn - chiffreDeux + 1)) + chiffreDeux;

        while (random > 10) {

         random = (int) (Math.random() * (chiffreUn - chiffreDeux + 1)) + chiffreDeux;
            
        }

        return random;
}

public static String [] construireTableMultiplication (int nombre1, int nombre2){

    String tab [] = new String [nombre1*nombre2];

    int a = 1;
    int b = 1;

     // Construction de chaque ligne de la table

     
     for (int i = 1; i <= tab.length; i++) {
        // Format de la chaîne : "<nombre1> x <i> = <resultat>"
        if (b > nombre2) {
            
            a++;
            b=1;
           
        }

        tab[i - 1] = a + " x " + b + " = " + (a * b);
        b++;


    }

return tab;
}

}
