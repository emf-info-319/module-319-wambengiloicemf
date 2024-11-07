package exercices.exercice12;

public class ExercicesString {

    public static void main(String[] args) {
        
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere :"+maChaineDeCaractere.length());
        
        // bonus expliqué par michael c'est comme quand tu séléctionne avec la souris 0 et 0 renvoie rien mais 01 renvoie la premiere lettre car il séléctionne de 0 à 1 
        System.out.println( maChaineDeCaractere.substring(1, 2));
        //4 -> indexof permet d'indiquer la position d'une chaine de caractère
        System.out.println("Le mot *contenu* commence à la position :"+ maChaineDeCaractere.indexOf("contenu"));
        //5 -> charAt ( Char = charactère )+ (At=à) -> iu se trouve le charactère 
        System.out.println("Le position 10 contient la lettre :" + maChaineDeCaractere.charAt(10));

        String monPrenom = "Loïc" ;
        

    }
    
}
