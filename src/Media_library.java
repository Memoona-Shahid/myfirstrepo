public class Media_library {
    private String title;
    private int year;
    public String memoona;
    private String genre;
    public  Media_library(String title, int year, String genre)
    {
        this.title=title;
        this.year=year;
        this.genre=genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo(){
        System.out.println("information:"+title+year+genre);
    }
}
