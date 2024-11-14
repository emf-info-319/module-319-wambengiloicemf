package exercices.exercice13;
public class Exercicecoaching {
    public static void main(String[] args) {
        int [] tab ;
        tab = new int [] {1,0,1,3,4,5};
       
        for (int index = 0; index < tab.length; index++) {
            System.out.println(tab[index]);
        }

        // int [] tab = new int [5];

        // quand on sais deja ce qu'on veut mettre dans le RP on peut faire // 
// new int [] {1,0,1,3,4,5};

for (int i = 0; i < tab.length; i++) {
    tab[i]=5;

    System.out.println(tab[i]);

}

//très important les tableaux commencent à zéro si tu veux afficher la première case 
// tu mets tab.[0]      
for (int i = 0; i < tab.length; i++) {

    System.out.println("affiche cellule: "+ i +" : " + tab[i]);

}

    }
    
}
