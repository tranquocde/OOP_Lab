package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title = "";
    private int length = 0;
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    public Track() {
    }
    public boolean equals(Track track){
        return this.getTitle() == track.getTitle() & this.getLength() == track.getLength();
    }
    public void play(){
        System.out.println("Playing DVD: "+this.getTitle());
        System.out.println("DVD length: "+this.getLength()); 
    }
    public void setTitle(String nextLine) {
        this.title = nextLine;
    }
    public void setLength(int nextInt) {
        this.length = nextInt;
    }
    
    
}
