
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
    
    public String registerOneBorrower(String name, String email){
        Borrower borrower = new Borrower(name, email);
        BorrowerDB.add(borrower);
        return "이용자 등록 완료";
    }

    public String registerOneBook(String title, String author){
        BookDB book = new Book(title, author);
        BookDB.add(book);
        return "책 1권 등록 완료";
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
        Book book = BookDB.findBook(UCNum, name, email);
        if(book==null){
            return "책 찾기 실패";
        }
        
        else(){
            return "책 찾기 성공";
        }
        
        
        Loan loan = new Loan(Book,Borrower);
        retun loanDB.addLoan(loan);
    }

    public String returnOneBook(String UCNum,String name, String email){
        
    }

    public String createUCNum(){
        
    }
    
    public String deleteOneBorrower(String name, String email){
        
    }

    public String deleteOneBook(String title, String author){

    }
}
