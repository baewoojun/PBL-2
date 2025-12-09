import java.util.*;

/**
 * LibraryApplication 클래스의 설명을 작성하세요.
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.08)
 */
public class LibraryApplication {
    private String name;
    private BorrowerDB borrowerCollection;
    private LoanDB loanCollection;
    private BookDB bookCollection;
    private int Num;
    private String UCNum;

    public LibraryApplication(String name) {
        this.name = name;
        this.borrowerCollection = new BorrowerDB();
        this.loanCollection = new LoanDB();
        this.bookCollection = new BookDB();
        this.Num = 0;
    }

    public String registerOneBorrower(String name, String email){
        Borrower Cborrower = borrowerCollection.findBorrower(name, email);
        if(Cborrower == null){
            Borrower borrower = new Borrower(name, email);
            String saveIF = borrowerCollection.addBorrower(borrower);
            return saveIF;
        }
        else{
            return "이미 등록된 이용자 입니다.";
        }
    }

    public String registerOneBook(String title, String author){
        String UCNum = createUCNum();

        Book Cbook = bookCollection.findBook(UCNum); 
        if(Cbook == null){
            Book book = new Book(title, author, UCNum);
            String saveIF = bookCollection.addBook(book);
            return saveIF + " (고유번호: " + UCNum + ")";
        }
        else{
            return "이미 등록된 책 입니다.";
        }
    }

    public String displayBooksForLoan(){
        String result = "=== 대출 가능 도서 목록 ===\n";
        Iterator<Book> it = bookCollection.getIterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.check()) {
                result = result + book.display() + "\n";
            }
        }
        return result;
    }

    public String displayBooksOnLoan(){
        String result = "=== 대출 중 도서 목록 ===\n";
        Iterator<Book> it = bookCollection.getIterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.check()) {
                result = result + book.display() + "\n";
            }
        }
        return result;
    }

    public String lendOneBook(String UCNum,String name, String email){
        Book book = bookCollection.findBook(UCNum);

        if(book == null){
            return "등록되지 않은 책입니다.";
        }

        Borrower borrower = borrowerCollection.findBorrower(name, email);
        if(borrower == null){
            return "해당 이용자 정보를 찾지 못했습니다.";
        } 

        if (!book.check()) {
            return "해당 책은 현재 대출 중입니다.";
        }

        Loan loan = new Loan(book, borrower);
        String saveIF = loanCollection.addLoan(loan);

        return saveIF;
    }

    public String returnOneBook(String UCNum,String name, String email){
        Book book = bookCollection.findBook(UCNum);

        if (book == null) {
            return "책 고유번호(" + UCNum + ")에 해당하는 책 정보를 찾지 못하여 반납이 불가합니다.";
        } 

        Borrower borrower = borrowerCollection.findBorrower(name, email);
        if (borrower == null) {
            return "이용자(" + name + ", " + email + ") 정보를 찾지 못하여 반납이 불가합니다.";
        } 
        Loan loan1 = book.searchLoan(); 

        Loan loan2 = borrower.searchLoan(); 
        if (loan1 == null) {
            // 책이 대출 중이 아님
            return "책 (" + UCNum + ")은 현재 대출 중이 아니므로 반납할 수 없습니다.";
        }

        if (loan2 == null) {
            // 이용자가 대출 중인 책이 없음
            return "이용자 (" + name + ")의 대출 기록을 찾을 수 없어 반납이 불가합니다.";
        }

        //책과 이용자의 대출 기록 일치 여부 확인
        if (loan1 != loan2) {
            return "책 대출 정보와 이용자 대출 정보가 일치하지 않아 반납이 불가합니다.";
        }
        // 대출 관계 연결 해제
        loan1.unLinkLoan();

        // LoanDB에서 대출 기록 삭제
        String deleteIF = loanCollection.deleteLoan(loan1);
        return deleteIF;
    }

    public String createUCNum(){
        this.Num += 1;
        this.UCNum = "B" + Num;
        return this.UCNum;
    }

    public String deleteOneBorrower(String name, String email){
        Borrower borrower = borrowerCollection.findBorrower(name, email);

        if(borrower == null){
            return "해당 이용자 정보를 찾을 수 없습니다.";
        }

        if(borrower.searchLoan() != null){
            return "대출 중인 책이 있어 해당 이용자를 삭제 할 수 없습니다.";
        }
        String deleteIF = borrowerCollection.deleteBorrower(borrower);
        borrower.delete();
        return deleteIF;
    }

    public String deleteOneBook(String title, String author, String UCNum){
        Book book = bookCollection.findBook(UCNum);
        if(book == null){
            return "등록되지 않은 책입니다.";
        }
        
        String deleteIF = bookCollection.deleteBook(book);
        book.delete();
        return deleteIF;
    }
}

