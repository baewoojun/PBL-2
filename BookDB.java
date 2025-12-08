import java.util.TreeSet;
/**
 * BookDB 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class BookDB
{
    private TreeSet<Book> bookDB;
    private Book bookObject;
    public BookDB(){
        bookDB = new TreeSet<>();
        
    }
    
    public String addBook(Book b){
        if(bookDB.add(b)){
            return "책 등록이 완료되었습니다.";
        }
        else{
            return "이미 등록된 책입니다.";
        }
    }
    
    public Book findBook(){
    
    }
    
    public Book findBook(String UCNum){
    
    }
    
    public String deleteBook(Book b){
    
    }
}