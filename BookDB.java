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
        // Iterator<Book> it = bookDB.iterator();
        // while(it.hasNext()){
            // Book book = it.next();
            // if(book.equals(b)){
                // return "이미 등록된 책입니다.";
            // }
        // }
        bookDB.add(b);
        return "책이 등록 되었습니다.";
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
        if(bookDB.remove(b)){ 
            return "책을 삭제 완료했습니다.";
        }
        else{
            return "책을 삭제하지 못하였습니다";
        }
    }
}