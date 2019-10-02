import java.util.Scanner;

public class InputAndOutput {
    private Language language;

    public InputAndOutput() {
        String language = getLanguage();
        boolean isGerman = "g".equals(language);

        this.language = new Language(!isGerman);
    }

    private String getString() {
        Scanner input = new Scanner(System.in);
        String result = input.next();
        input.close();
        return result;
    }

    //
    // Print the current board
    // get input
    public int getNextMove() {
        System.out.println("Please input your next move\n" +
                "use only number from 0-8.");
        String result = getString();
        return Integer.parseInt(result);
    }

    public String getLanguage() {
        System.out.println("Please input your language\n" +
                "for English type e\n" +
                "for German g");
        return getString();
    }


}
