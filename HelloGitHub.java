public class HelloGitHub {
	public static void main(String[] args) {
		System.out.println("\n\nHello, World!\n\n");
		System.out.println("Andrea");

		Song s = new Song();
		System.out.println("\ns song: " + s);

		PlayList music = PlayList.randomSongs(10);
		System.out.println("\nmusic playlist: " + music);

		// TODO Fix Dashcode when outputting a playlist
		System.out.println("Zari");
	}
}