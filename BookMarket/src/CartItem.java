public class CartItem {
    private String[] book;
    private int count;
    private int totalPrice;

    public CartItem(String[] book, int count) {
        this.book = book;
        this.count = count;
        this.updateTotalPrice();
    }

    public CartItem(String[] book) {
        this.book = book;
        this.count = 1;
        this.updateTotalPrice();
    }

    public void updateTotalPrice() {
        this.totalPrice = Integer.parseInt(this.book[2]) * this.count;
    }

    public String[] getBook() {
        return this.book;
    }

    public int getCount() {
        return this.count;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public void setCount(int count) {
        this.count = count;
        this.updateTotalPrice();
    }
}
