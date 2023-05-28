package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist = "";
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public String getArtist() {
        return artist;
    }
    public CompactDisc(){super();}
    public boolean addTrack(Track track){
        for (Track name: tracks){
            if (track.equals(name)){
                return false;
            }
        }
        tracks.add(track);
        return true;
    }
    public boolean removeTrack(Track track){
        for (Track name : tracks){
            if(track.equals(name)){
                tracks.remove(track);
                return true;
            }
        }
        return false;
    }
    public int getLength(){
        int res = 0;
        for (Track track:tracks){
            int length = track.getLength();
            res+= length;
        }
        return res;
    }
    public String toString(){
        return String.format("Artist : %s, Category: %s, Director: %s, Cost: %f, Length: %d", this.getArtist(),this.getCategory(),
        this.getDirector(),this.getCost(),this.getLength());
    }
    public void play(){
        for (Track track:tracks){
            track.play();
        }
    }
    public static void main(String[] args){
        CompactDisc cd = new CompactDisc();
        cd.play();
    }
}
