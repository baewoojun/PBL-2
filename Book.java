 import java.util.*;
/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.08)
 */
public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private String UCNum;
    private Loan loan;
    
    public Book(String title, String author, String UCNum){
        this.title = title;
        this.author = author;
        this.UCNum = UCNum;
        
    }
    
    public boolean check(){
        if(this.loan == null){
            return true;
        }
        else {
            return false;
        }
    }
    
    public String display(){
        return "제목: " + title + ", 저자: " + author + ", 등록번호: " + UCNum;
    }
    
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
    
    public String getID(){
        return this.UCNum;
    }
    
    public void delete(){
        
    }
    
    public void setLoan(Loan loan){
        this.loan = loan;
    }
    
    public int compareTo(Book book1){
        return Integer.parseInt(this.UCNum) - Integer.parseInt(book1.UCNum);
    }
}