import java.util.*;
public class Exo2 {
    static String saisiUtilisateur;
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        System.out.println("Saisir un Texte");
        saisiUtilisateur = Enter.nextLine();
        System.out.println("L'entrée de base "+saisiUtilisateur);
        System.out.println(saisiUtilisateur.toLowerCase());
        System.out.println(saisiUtilisateur.toUpperCase());
    }


    }

