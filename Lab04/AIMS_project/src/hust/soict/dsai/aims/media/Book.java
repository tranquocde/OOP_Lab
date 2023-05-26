package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
    private List<String> authors= new ArrayList<String>();
    public Book(){};
    public boolean addAuthor(String author){
        for (String name:authors){
            if (author.equals(name)){
                System.out.println("The author is already in the list");
                return false;
            }
        }
        authors.add(author);
        return true;
    }
    public boolean removeAuthor(String author){
        for (String name: authors){
            if (authors.equals(name)){
                authors.remove(name);
                return true;
            }
        }
        return false;
    }
}
