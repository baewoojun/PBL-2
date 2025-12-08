import java.util.TreeSet;
import java.util.*;

/**
 * BorrowerDB 클래스의 설명을 작성하세요.
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.08)
 */
public class BorrowerDB{
    private TreeSet<Borrower> borrowerDB;
    private Borrower borrowerObject;
    public BorrowerDB(){
        borrowerDB = new TreeSet<>();
        
    }
    
    public String addBorrower(Borrower u){
        // if(borrowerDB.add(u)){
            // return "이용자 등록이 완료되었습니다.";
        // }
        // else{
            // return "이미 등록된 사용자 입니다.";
        // }
        Iterator<Borrower> it = borrowerDB.iterator();
        while(it.hasNext()){
            Borrower borrower = it.next();
            if(borrower.equals(u)){
                return "이미 등록된 이용자입니다.";
            }
        }
        borrowerDB.add(u);
        return "이용자가 등록 완료 되었습니다.";
    }
    
    public Book findBorrower(String name, String email){
        
    }
    
    public String deleteBorrower(Borrower u){
        
    }
}