
/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.08)
 */
public class Loan
{
    private Book loanedBook;
    private Borrower borrower;
    public static int loanState =0;
    
    public Loan(Book b, Borrower u){
        this.loanedBook = b;
        this.borrower = u;
        b.setLoan(this);
<<<<<<< HEAD
        u.set;
=======
        u.set
>>>>>>> c33c44839028203a4310b512ce3894dc5362864c
        loanState =0;
    }
    
    public void unLinkLoan(){
        
    }
    
}