import java.util.*;

public class Library {
    private List<Book> BookCollection;
    private List<Member> Members;

    public Library(List<Book> books, List<Member> members){
        this.BookCollection = books;
        this.Members = members;
    }

    public Library(){
        this.BookCollection = new ArrayList<>();
        this.Members = new ArrayList<>();
    }

    public void addBook(Book newBook){
        this.BookCollection.add(newBook);
    }

    public void removeBook(Book newBook){
        this.BookCollection.remove(newBook);
    }

    public void addNewMember(Member newMember){
        this.Members.add(newMember);
    }
}



