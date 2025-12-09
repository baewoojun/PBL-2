import java.util.*;

/**
 * BookDB는 Book 객체들를 TreeSet 구조로 저장하는 클래스
 *
 * @author (2022320014_정재헌, 2022320035_배우준, 20220320018_이성민)
 * @version (2025.12.10)
 */
public class BookDB
{
    private TreeSet<Book> bookDB;
    private Book bookObject;
    
    public BookDB(){
        bookDB = new TreeSet<>();
    }

    public String addBook(Book b){
        bookDB.add(b);
        return "책이 등록 되었습니다.";
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
    
    public void deleteBook(Book b){
        bookDB.remove(b);
    }
    
    public Iterator<Book> getIterator(){
        return bookDB.iterator();
    }

}