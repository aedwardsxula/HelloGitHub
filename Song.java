

public class Song {
	private String name;
	private double length;

	public Song() {
		name = "Jamitha";
		length = 7.5;
	}

	@Override
	public String toString() {
		return name + " " + length;
	}
}
