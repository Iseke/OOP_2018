import java.io.Serializable;

public class Textbook implements Serializable {
    private int isbn;
    private String tittle;
    private String author;
    public Textbook(){
        this.isbn=0;
        this.tittle="no name";
        this.author="no author";
    }
    public Textbook(int isbn,String tittle,String author){
        this.isbn = isbn;
        this.tittle = tittle;
        this.author = author;
    }

    public void setAuthor(String author) { this.author = author; }

    public void setIsbn(int isbn) { this.isbn = isbn; }

    public void setTittle(String tittle) { this.tittle = tittle; }

    public int getIsbn() { return isbn; }

    public String getAuthor() { return author; }

    public String getTittle() { return tittle; }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this == obj) return true;
        if(!(obj instanceof Textbook)) return false;
        Textbook tb = (Textbook)obj;
        if(this.isbn == tb.isbn && this.tittle.equals(tb.tittle) && this.author.equals(tb.author)) return true;
        else return false;
    }
    public String toString(){
        return "Textbook: isbn:" + this.isbn + " Title:" + this.tittle + " Authors:" + this.author ;
    }
}
