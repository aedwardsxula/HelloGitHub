public class HelloGitHub {
	public static void main(String[] args) {
		System.out.println("\n\nHello, World!\n\n");
		System.out.println("Andrea");

		Song s = new Song();
		System.out.println("s song: " + s);

		PlayList music = new PlayList(10);
		System.out.println("music playlist: " + music + " " + Integer.toHexString(music.hashCode()));
	}
}