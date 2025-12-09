
/**
 * Loan 클래스의 설명을 작성하세요.
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
    
    public String getBookID(){
        return loanedBook.getID();
    }
    
    public void unLinkLoan(){
        loanedBook.setLoan(null);
        borrower.unLinkLoan(this);
        this.loanedBook = null;
        this.borrower = null;
    }
}