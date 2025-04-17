public class Book {

    private String id;
    private String bookName;
    private int price;
    private String name;
    private String process;
    private String special;
    private String date;


    public Book(String id, String bookName, int price, String name, String process, String special, String date) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.name = name;
        this.process = process;
        this.special = special;
        this.date = date;
    }

    public String getID() {
        return this.id;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getProcess() {
        return this.process;
    }

    public String getSpecial() {
        return this.special;
    }

    public String getDate() {
        return this.date;
    }

    @Override
    public String toString() {
        return id + '\'' + bookName + '\'' + price + '\'' + name + '\'' + process + '\'' + special + '\'' + date + '\'';
    }
}
