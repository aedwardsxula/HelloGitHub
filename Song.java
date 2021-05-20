import java.util.Random;

public class Song {
	private String artist;
	private double minutes;

	public Song() {
		artist = "Jamitha";
		minutes = 7.5;
	}


	public Song(String artist, double minutes) {
		this.artist = artist;
		this.minutes = minutes;
	}

	public static Song randomSong() {
		Random rand = new Random();
        String[] titles = {"Tia", "Zari", "Jamitha", "Tuan", "Sue", "Mohib", "Alexus"};
        double minutes = rand.nextDouble() * 10; // songs are 0..<10 minutes
        Song s = new Song(titles[rand.nextInt(titles.length)], minutes);
		return s;
	}

	@Override
	public String toString() {
		return artist + " " + minutes;
	}
}
