package Chuong2.Bai2_1_2;

public class TestBookAdvanced {
    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'f');

        BookAdvenced javaDummy = new BookAdvenced("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);

    }
}
