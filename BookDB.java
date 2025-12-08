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
        // if(bookDB.add(b)){
            // return "책 등록이 완료되었습니다.";
        // }
        // else{
            // return "이미 등록된 책입니다.";
        // }
        Iterator<Book> it = bookDB.Iterator();
        while(it.hasNext()){
            Book book = BookDB.get();
            if(book.check() == false){
                return "이미 등록된 책입니다.";
            }
        }
        저장ㅁㅅㄷ
        ㄷㄹ요
    }
    
    public Iterator<Book> getIterator(){
        return bookDB.iterator();
    }
    public Book findBook(){
        return null;
    }
    
    public Book findBook(String UCNum){
        Iterator<Book> it = bookDB.iterator();
        while(it.hasNext()){
            Book book = it.next();
            if(book.getID().equals(UCNum)){
                return book;
            }
        }
        return null;
    }
    
    public String deleteBook(Book b){
    
    }
}