public class Hangman {

	public static void main(String[] args) {
		//Enter code here:
		Game game = new Game("earthquake");
    Prompter prompter = new Prompter(game);
    prompter.play();
	}
}