import java.util.Scanner;

public class InputAndOutput {
    private Language language;

    public InputAndOutput() {
        String language = getLanguage();
        boolean isGerman = "g".equals(language);

        this.language = new Language(!isGerman);
    }

    public String getLanguage() {
        System.out.println("Please input your language\n" +
                "for English type e\n" +
                "for German g");
        Scanner input = new Scanner(System.in);
        String result = input.next();
        input.close();
        return result;
    }

    // Print the current board

    // get input

    //
}
