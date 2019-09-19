public class Song {
    private String artist = "";
    private String title = "";

    public static void Song(){}

    public void Song(String artist, String title){
        this.artist = artist;
        this.title = title;
    }

    public String display(){
        String s = "Title:\t" + title +
                "\nArtist:\t" + artist;
        return s;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
