import java.util.List;

public class Member {
    private String id;
    private String name;
    private String email;
    private List<String> borrowedBooks;

    public Member(String id, String name, String email, List<String> borrowedBooks){
        this.id = id;
        this.name = name;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public List<String> getBorrowedBooks(){
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<String> borrowedBooks){
        this.borrowedBooks = borrowedBooks;
    }
}
