import java.util.*;
public class Exo3 {
    static String Enter;
    static char a ;
    static char star;

    static String updateString;
    public static void main(String[] args){
        System.out.println("Enter String");
        Scanner text = new Scanner(System.in);
        Enter = text.nextLine();
        if (Enter.length()>2){
            for (int i =0;i<Enter.length();i++) {
                if (i%2==0){
                 a = Enter.charAt(i);
                 star = '*';
                 updateString = Enter.replace(a, star);
                 Enter=updateString;
                }

            }
        }
        System.out.println(Enter);
    }
}
