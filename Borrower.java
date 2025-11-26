
/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Borrower{
    private String name;
    private String email;
    private Loan[] loanInfo;
    
    public Borrower(String name, String email){
        this.name = name;
        this.email = email;
        this.loanInfo = new Loan[10];
    }
    
    public boolean check(){
    
    }
    
    
}