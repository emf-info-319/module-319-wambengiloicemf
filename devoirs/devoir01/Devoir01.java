package devoirs.devoir01;

public class Devoir01 {
    public static void main(String[] args) {

        int monAge = 22;
     
        boolean estMajeur ;
      
        System.out.println("Je m'appelle Wa Mbengi Loïc");
        System.out.println("Mon âge est de " + monAge + " ans" );

        if (monAge > 20) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }

        if (estMajeur == true) { System.out.println( "Loïc est Majeur");
            
        }

        if (estMajeur ==false) { System.out.println("Loïc n'est pas majeur");}

        
  
    

    }

}
