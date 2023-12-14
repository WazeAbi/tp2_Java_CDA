package livre;
import java.util.*;
import org.w3c.dom.ls.LSOutput;

public class Exo4 {
    public static void main(String[] args) {

            Book alex = new Book();
            alex.setBookName("Crazy");
            alex.setAuthorFirstName("Alex");
            alex.setAuthorLastName("Dalle");
            Book naruto = new Book();
            naruto.setBookName("Shippuden");
            naruto.setAuthorFirstName("Naruto");
            naruto.setAuthorLastName("Uzumaki");
            Book luffy = new Book();
            luffy.setBookName("onepiece");
            luffy.setAuthorFirstName("Luffy");
            luffy.setAuthorLastName("MonkeyD");



    Biblio biblio = new Biblio();
    biblio.setBook1(alex);
    biblio.setBook2(naruto);
    biblio.setBook3(luffy);
    biblio.showBiblio();
    }


}
