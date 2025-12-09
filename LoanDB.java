import java.util.*;

/**
 * LoanDB는 Loan 객체들를 HashSet 구조로 저장하는 클래스
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.10)
 */
public class LoanDB
{
    private HashSet<Loan> loanDB;
    private Loan loanObject;
    
    public LoanDB(){
        loanDB = new HashSet<>();
    }
    
    public String addLoan(Loan l){
        if(loanDB.add(l)){
            return "대출 완료.";
        }
        else{
            return "이미 대출된 책과 이용자 입니다.";
        }
    }
    
    public String deleteLoan(Loan l){
        if(loanDB.remove(l)){
            return "반납 완료.";
        }
        else{
            return "이미 반납된 책과 이용자 입니다.";
        }
    }
}