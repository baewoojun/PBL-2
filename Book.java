
/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
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
        return  Loan.loanState ==0;
    }
    
    public String display(){
        
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