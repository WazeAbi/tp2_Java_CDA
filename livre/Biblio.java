package livre;

public class Biblio {
  private Book book1;
  private Book book2;
  private Book book3;

    public Book getBook1() {
        return book1;

    }

    public Book getBook2() {
        return book2;

    }

    public Book getBook3() {
        return book3;
    }

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
    }

    public void showBiblio(){
        book1.showInfo();
        book2.showInfo();
        book3.showInfo();

    }
}
