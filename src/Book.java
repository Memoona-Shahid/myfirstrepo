public class Book extends Media_library{

    private String author;
    public String memooona;

    public Book(String title, int year, String genre, String author){
        super(title, year, genre);
        this.author=author;
    }
    @Override
    public void displayInfo(){
        System.out.println("Information:" + super.memoona);
    }


}
