package exercices.exercice04;

public class EchangeValeurs {
    public static void main(String[] args) {

        int variable1 = 1;
        int variable2 = 2;

        System.out.println("le contenu de la variable1 est" + variable1);
        System.out.println("le contenu de la variable2 est" + variable2);
        System.out.println("traitement");

        int variablevide = variable1;

        variable1 = variable2;
    
        variable2 = variablevide;

        System.out.println("le contenu de la variable1 est" + variable1);
        System.out.println("le contenu de la variable2 est" + variable2);

    }

}
