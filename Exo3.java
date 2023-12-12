import java.util.*;

public class Exo3 {
    public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner userString = new Scanner(System.in);
        String enter = userString.nextLine();
        String updatedString = "";

        if (enter.length() > 1) {
            for (int i = 0; i < enter.length(); i++) {
                if (i % 2 == 0) {
                    updatedString += '*';
                } else {
                    updatedString += enter.charAt(i);
                }
            }
        } else {
            updatedString = enter;
        }

        System.out.println(updatedString);
    }
}

