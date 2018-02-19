import java.util.ArrayList;
import java.util.Scanner;

public class Song {
	
	public static void main(String[] args){
		ArrayList<String> songList = new ArrayList();
		
		System.out.println("Please name a song");
		Scanner ns = new Scanner(System.in);
		while (ns.hasNext()){
			songList.add(ns);
		}
		System.out.println(songList);
	}
}
		

Playlist one = new Playlist();


public String name;
public String artist;
public int year;

public Song(String songName, String artistName, int releaseDate){
name = songName;
artist = artistName;
year = releaseDate;
}
public void setName(String songName){
name = songName;
}

}
}