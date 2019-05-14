public class Book{
    private int numOfPages;
    private String author;
    private String title;
    private String genre;
    private boolean isHardCover;

    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setIsHardCover(){
        this.isHardCover = true;
    }
    public int getNumOfPages(){
        return numOfPages;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public boolean getIsHardCover(){
        return isHardCover;
    }

        



    
}