import java.util.ArrayList;
import java.util.Scanner;

public class Song {
	
	public static void main(String[] args){
		ArrayList<String> songList = new ArrayList();
		
		System.out.println("Please name a song");
		Scanner ns = new Scanner(System.in);
		String newSong = ns.next();
		songList.add(newSong);
			
	
		System.out.println(songList);
	}
}
