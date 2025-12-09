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
        // return "?  ?  ?   ?  록이 ?  료되?  ?  ?  ?  .";
        // }
        // else{
        // return "?   ? ?  록된 ?  ?  ?   ?  ?  ?  .";
        // }
        Iterator<Borrower> it = borrowerDB.iterator();
        while(it.hasNext()){
            Borrower borrower = it.next();
            if(borrower.equals(u)){
                return "등록된 이용자가 없습니다.";
            }
        }
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

    public String deleteBorrower(Borrower u){
        if(borrowerDB.remove(u)){
            return "이용자 정보가 삭제 되었습니다";
        }
        else{
            return "삭제 실패 : 해당 이용자가 없습니다";
        }
    }
}