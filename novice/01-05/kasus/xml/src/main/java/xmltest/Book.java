package xmltest;

public class Book {
    private String title;
    private String author;
    private int price;
    public Book(String t, String a, int pr) {
       title = t.trim();
       author = a.trim();
       price = pr;
    }

    public String toString() {
       String temp = "\n\tJudul buku: " + title + "\n\tPenulis: " + author;
       temp += "\n\tHarga Rp" + price + "\n";
       return temp;
    }
 }
