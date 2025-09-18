public class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private int availableCopies;
    private int totalCopies;

    public Book(String id, String title, String author, String category, int availableCopies, int totalCopies){
        
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public int getAvailableCopies(){
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies){
        this.availableCopies = availableCopies;
    }

    public int getTotalCopies(){
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies){
        this.totalCopies = totalCopies;
    }

}
