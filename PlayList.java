import java.util.ArrayList;
import java.util.List;

public class PlayList {
	List<Song> songs;

	public PlayList() {
		songs = new ArrayList<>();
	}


	public void add(Song s) {
		songs.add(s);
	}


	public static PlayList randomSongs(int numSongs) {
		PlayList result = new PlayList();
		for (int i = 0; i < numSongs; i++) {
			result.add(Song.randomSong());
		}

		return result;
	}


	
}
