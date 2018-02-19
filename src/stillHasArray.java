import java.util.ArrayList;
import java.util.Scanner;

public class Song {
	
	public static void main(String[] args){
		List<String> songList = new ArrayList<String>();
		Scanner keyboard = new Scanner(System.in);

		
		boolean addSong = false;
		int numberOfSongs = 0;
		System.out.println("Would you like to add a new song? (True/False)");
		addSong = keyboard.nextBoolean();
		if(addSong == true){
			numberOfSongs++;
		}
		
		
		System.out.println("Please name a song");
		String newSong = keyboard.next();
		songList.add(newSong);
			
	
		System.out.println(songList);
	}
}
