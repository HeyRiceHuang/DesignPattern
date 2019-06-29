public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int last = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean HasNext() {
        if (last < bookShelf.GetLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object Next() {
        Book book = bookShelf.GetBookAt(last);
        last++;
        return book;
    }
}
