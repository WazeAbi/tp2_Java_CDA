package livre;
    public class Book {

        private String bookName;
        private String authorFirstName;
        private String authorLastName;

        public String getBookName() {

            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getAuthorFirstName(String luffy) {
            return authorFirstName;
        }

        public void setAuthorFirstName(String authorFirstName) {
            this.authorFirstName = authorFirstName;
        }

        public String getAuthorLastName() {
            return authorLastName;
        }

        public void setAuthorLastName(String authorLastName) {
            this.authorLastName = authorLastName;
        }

        public void showInfo(){
            System.out.println(bookName+" " +authorFirstName+" "+authorLastName);
         }

    }



