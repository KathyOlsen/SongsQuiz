import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            System.out.println("Please enter an artist: ");
            String r1 = key.nextLine();
            System.out.println("Please enter a song title: ");
            String r2 = key.nextLine();
            Song s = new Song();
            s.setArtist(r1);
            s.setTitle(r2);
            songs.add(s);
        }
        for(Song song : songs){
            System.out.println(song.display());
        }

        String titleToFind = "Purple Rain";
        for (Song song : songs){
            if(song.getTitle().equalsIgnoreCase("Purple Rain")){
                System.out.printf("I found:\n %s \r\n", song.display());
            }
        }
    }
}
