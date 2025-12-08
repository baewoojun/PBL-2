import java.util.*;
/**
 * LibraryApplication 클래스의 설명을 작성하세요.
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.08)
 */
public class LibrayApplication {
    private String name;
    private BorrowerDB borrowerCollection;
    private LoanDB loanCollection;
    private BookDB bookCollection;
    private int Num;
    private String UCNum;

    public LibrayApplication(String name) {
        this.name = name;
        this.borrowerCollection = new BorrowerDB();
        this.loanCollection = new LoanDB();
        this.bookCollection = new BookDB();
    }
    

    public String registerOneBorrower(String name, String email){
        if(findBorrower(name, email).eqauls()){
            
        }
        Borrower borrower = new Borrower(name, email);
        String saveIF = borrowerCollection.addBorrower(borrower);
        return saveIF;
    }

    public String registerOneBook(String title, String author){
        String UCNum = createUCNum();
        Book book = new Book(title, author, UCNum);
        String saveIF = bookCollection.addBook(book);
        return saveIF + UCNum;
    }

    public void displayBooksForLoan(){
        Iterator<Book> it = bookCollection.getIterator();
        
        System.out.println("===대출 가능 도서 목록 ==");
        while(bookit.hasNext()){
            Book book = (bookit.next());
            if(book.check() == true){
                System.out.println(book.display());
            }
        }
    }

    public void displayBooksOnLoan(){
        Iterator<Book> it = bookCollection.getIterator();
        
        System.out.println("===대출 중 도서 목록 ==");
        while(bookit.hasNext()){
            Book book = bookit.next();
            if(book.check() == false){
                System.out.println(book.display());
            }
        }
    }

    public String lendOneBook(String UCNum,String name, String email){
        Book book = BookCollection.findBook(UCNum);
        Borrower borrower = BorrowerCollection.findBook(name, email);
        if(book == null){
            return "해당 책을 찾을 수 없습니다.";
        }
        Borrower borrower = BorrowerCollection.findBook(name, email);
        if(borrower == null){
            return "해당 이용자를 찾을 수 없습니다";
        }
        Loan loan = new Loan(Book,Borrower);
        retun loanDB.addLoan(loan);

        Loan loan = new Loan(book,borrower);
        return loanDB.addLoan(loan);
    }

    public String returnOneBook(String UCNum,String name, String email){
        
    }

    public String createUCNum(){
        this.Num += 1;
        this.UCNum = "B" + Num;
        return this.UCNum;
    }
    
    public String deleteOneBorrower(String name, String email){
        
    }

    public String deleteOneBook(String title, String author){
        
    }
}
