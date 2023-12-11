import java.util.*;

class Exo1 {
    static int a = 0;
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Saisir un Text");
        String Text = Scanner.nextLine();

        for (int i = 0; i< Text.length()+1;i++){
            a = i;
        };
        System.out.println(a);
        }
}
