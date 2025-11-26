
/**
 * LibraryApplication 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibrayApplication {
    private String name;
    private BorrowerDB borrowerCollection;
    private LoanDB loanCollection;
    private BookDB bookCollection;


    public LibrayApplication(String name) {
        this.name = name;
        this.borrowerCollection = new BorrowerDB();
        this.loanCollection = new LoanDB();
        this.bookCollection = new BookDB();
    }
    
    public String registerOneBorrower(String name, String email) {
    }

    public String registerOneBook(String title, String author) {

    }

    public void displayBooksForLoan() {

    }

    public void displayBooksOnLoan() {

    }

    public void lendOneBook(String title, String author,
                            String name, String email) {

    }

    public void returnOneBook(String title, String author,
                              String name, String email) {
        
    }

    public String createUCNum() {

    }

    public String deleteOneBook(String title, String author) {

    }
}
