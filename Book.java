
/**
 * Book 객체를 생성하는 클래스
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.10)
 *///
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
        return "제목 " + title + ", 저자: " + author + ", 번호: " + UCNum;
    }
    
    public String delete(){
        this.title = null;
        this.author = null;
        this.UCNum = null;
        this.loan = null;
        return "책 삭제를 완료 했습니다.";
    }
    
    public void setLoan(Loan loan){
        this.loan = loan;
    }

    public String getID(){
        return this.UCNum;
    }

    public Loan searchLoan(){
        return this.loan;
    }
    
    public int compareTo(Book other) {
        return this.UCNum.compareTo(other.UCNum);
    }
}