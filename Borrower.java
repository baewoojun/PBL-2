
/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class BorrowerDB{
    private String name;
    private String email;
    private Loan loanInformation;
    
    public Borrower(String name, String email){
        this.name = name;//미 대출 상태
        this.email = email;// 고유 email 생성
        
    }
    
    public boolean check(){
    
    }
    
 
    
}