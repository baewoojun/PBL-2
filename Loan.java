
/**
 * Loan 객체를 생성하는 클래스
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.10)
 */
public class Loan
{
    private Book loanedBook;
    private Borrower borrower;
    
    public Loan(Book b, Borrower u){
        this.loanedBook = b;
        this.borrower = u;
        
        b.setLoan(this);
        u.setLoan(this);
        
    }
    
    public void unLinkLoan(){
        loanedBook.setLoan(null);
        borrower.unLinkLoan(this);
        this.loanedBook = null;
        this.borrower = null;
    }
    
    public String getBookID(){
        return loanedBook.getID();
    }
}