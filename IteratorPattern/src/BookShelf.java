import java.util.ArrayList;

public class BookShelf implements Aggregate {

    private ArrayList<Book> Books = new ArrayList<Book>();

    public BookShelf() {

    }

    public void AddBook(Book book) {
        this.Books.add(book);
    }

    public Book GetBookAt(int index) {
        return this.Books.get(index);
    }

    public int GetLength() {
        return this.Books.size();
    }

    @Override
    public Iterator Iterator() {
        return new BookShelfIterator(this);
    }
}
