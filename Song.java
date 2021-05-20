

public class Song {
	private String title;
	private double length;

	public Song() {
		title = "Jamitha";
		length = 7.5;
	}

	@Override
	public String toString() {
		return title + " " + length;
	}
}
