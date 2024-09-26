package devoirs.devoir03;

public class Devoir03Loic {
    public static void main(String[] args) {
        int jour = 31;
        int mois = 12;
        int annee = 2024;
        int totalJours = jour;
        for (int i = 1; i < mois; i++) {
            if (i == 2) {
                totalJours += (annee % 4 == 0) ? 29 : 28;
            } else if (i % 2 != 0) {
                totalJours += 31;
            } else {
                totalJours += 30;
            }
        }
        System.out.println("Nous sommes au jour : " + totalJours);
    }
 }
    

    

