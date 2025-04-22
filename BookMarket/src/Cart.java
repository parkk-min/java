import java.util.ArrayList;

public class Cart implements CartInterface {
    private ArrayList<CartItem> mCart = new ArrayList<>();

    @Override
    public boolean isCartInItem(String bookId) {
        for (CartItem item : this.mCart) {
            if (bookId.equals(item.getBook().getItemId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clearCart() {
        this.mCart.clear();
    }

    @Override
    public Item removeCartItem(String bookId) {
        Book book = null;
        for (CartItem item : this.mCart) {
            if (item.getBook().getItemId().equals(bookId)) {
                book = item.getBook();
                this.mCart.remove(item);
                break;
            }
        }
        return book;
    }

    @Override
    public void appendItem(Item book) {
        this.mCart.add(new CartItem((Book) book));

    }

    @Override
    public void inCreaseItemCount(String bookid) {
        for (CartItem item : this.mCart) {
            if (item.getBook().getItemId().equals(bookid)) {
                item.setCount(item.getCount() + 1);
                break;
            }
        }
    }

    @Override
    public Item deCreaseItemCount(String bookid) {
        Book book = null;
        for (CartItem item : this.mCart) {
            if (item.getBook().getItemId().equals(bookid)) {
                book = item.getBook();
                item.setCount(item.getCount() - 1);
                if (item.getCount() == 0) {
                    System.out.println("수량이 0이 되어 항목을 장바구니에서 삭제합니다.");
                    this.mCart.remove(item);
                    break;
                }
            }
        }
        return book;
    }

    @Override
    public void printCart() {
        System.out.println("장바구니 상품 목록 보기 :");
        System.out.println("---------------------------------------------");
        System.out.println("도서ID\t\t|수량\t\t\t\t|총가격");

        for (int i = 0; i < this.mCartItemCount; i++) {
            System.out.print((i + 1) + " " + this.mCart[i].getBook().getItemId() + "\t| ");
            System.out.print(this.mCart[i].getCount() + "\t\t\t\t| ");
            System.out.print(this.mCart[i].getTotalPrice());
            System.out.println();
        }
        System.out.println("---------------------------------------------");
    }

}
