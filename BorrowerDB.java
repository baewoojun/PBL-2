import java.util.*;

/**
 * BorrowerDB는 Borrower 객체들를 TreeSet 구조로 저장하는 클래스
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.10)
 */
public class BorrowerDB{
    private TreeSet<Borrower> borrowerDB;
    private Borrower borrowerObject;
    
    public BorrowerDB(){
        borrowerDB = new TreeSet<>();
    }

    public String addBorrower(Borrower u){
        borrowerDB.add(u);
        return "이용자가 정상적으로 등록되었습니다.";
    }

    public Borrower findBorrower(String name, String email){ 
        Iterator<Borrower> it = borrowerDB.iterator();
        while(it.hasNext()){
            Borrower borrower = it.next();
            if(borrower.getID().equals(email)){ 
                return borrower;
            }
        }
        return null;
    }

    public void deleteBorrower(Borrower u){
        borrowerDB.remove(u);
    }
}