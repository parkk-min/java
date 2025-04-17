
public class Cart {
    static CartItem[] mCart = new CartItem[3];
    private static int mCartItemCount = 0;

    public boolean isCartInBook(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (bookId.equals(mCart[i].getBook().getID())) {
                return true;
            }
        }
        return false;
    }

    public void appendBook(Book book) {
        mCart[mCartItemCount++] = new CartItem(book);
    }

    public void inCreaseBookCount(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (mCart[i].getBook().getID().equals(bookId)) {
                mCart[i].setCount(mCart[i].getCount() + 1);
                return;
            }
        }
    }
}
