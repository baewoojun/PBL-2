
/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.08)
 */
public class Borrower implements Comparable<Borrower>
{
    private String name;
    private String email;
    private Loan[] loanInfo;
    public Borrower(String name, String email){
        this.name = name;
        this.email = email;
        this.loanInfo = new Loan[10];
    }
    
    public boolean check(){
        if(this.loanInfo[9] == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Loan searchLoan(String bookID){
        for (Loan loan : loanInfo) {
            if (loan != null && loan.getBookID().equals(bookID)) {
                return loan;
            }
        }
        return null;
    }
    
    public Loan searchLoan(){
        for (Loan loan : loanInfo) {
            if (loan != null) {
                return loan;
            }
        }
        return null;
    }
    

    public String getID(){
        return this.email;
    }
    
    public void setLoan(Loan loan){
        for(int i = 0; i < loanInfo.length; i++){
            if (loanInfo[i] == null){
                loanInfo[i] = loan;
                return;
            }
        }
    }
        
    public void delete(Loan loan){
        for(int i = 0; i < loanInfo.length; i++){
            if (loanInfo[i].equals(loan)){
                loanInfo[i] = null;
                return;
            }
        }
    }
    
    public int compareTo(Borrower other) {
        return this.email.compareTo(other.email);
    }
}