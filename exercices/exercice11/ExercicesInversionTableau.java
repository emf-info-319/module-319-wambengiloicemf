public class ExercicesInversionTableau {

    public static void main(String[] args) {
        
        int [] tableau = new int [4];
        for (int index = 0; index < tableau.length; index++) {
            tableau [index] += index*8;
            System.out.println(tableau[index]);
        }
        
    


        inverseTableau(tableau);
        for (int index = 0; index < tableau.length; index++) {
            System.out.println(tableau[index]);

            
        }



    }

    public static void inverseTableau (int [] tableau){
    
        int [] tabInverse = new int [4];
        int celluleAInverser = tableau.length-1;
        for (int index = 0; index < tabInverse.length; index++) {
         celluleAInverser =tableau [index];
         


        }

    }
}