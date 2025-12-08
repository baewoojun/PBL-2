
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
        while(모든 책 출력 완료 !=true){
            //BookDB에게 책 1권을 가져온다
            Book book = BookDB.get();
            if(book == 대출가능(수정해야함)){
                //책의 정보를 화면에 출력
                book.display();
            }
        }
    }

    public void displayBooksOnLoan(){
        while(){
            //BookDB에게 책 1권을 가져온다
            Book book = BookDB.get();
            if(book == 대출가능(수정해야함)){
                //책의 정보를 화면에 출력
                book.display();
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
