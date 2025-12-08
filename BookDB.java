import java.util.*;
/**
 * BookDB 클래스의 설명을 작성하세요.
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.08)
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
            return "등록이 완료되었습니다." + b.toString();
        }
        else{
            return "이미 등록된 책입니다.";
        }
    }
    
    public Iterator<Book> getIterator(){
        return bookDB.iterator();
    }
    public Book findBook(){
        return null;
    }
    
    public Book findBook(String UCNum){
    
    }
    
    public String deleteBook(Book b){
    
    }
}