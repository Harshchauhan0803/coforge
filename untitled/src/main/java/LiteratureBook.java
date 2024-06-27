public class LiteratureBook extends Book {
    private String author, pname;

    public LiteratureBook(long isbn, String bname, float cost, String author, String pname) {
        super(isbn, bname, cost);
        this.author = author;
        this.pname = pname;
    }
    void literatureBookInfo(){
        System.out.println("book Information");
        System.out.println(getIsbn());
        System.out.println(getBname());
        System.out.println(getCost());
        System.out.println(author);
        System.out.println(pname);
    }

    public static void main(String[] args) {
       LiteratureBook literatureBook=new LiteratureBook(10001,"two streets",450,"chetan bhjagat","raj kumar");
       literatureBook.literatureBookInfo();
    }
}

