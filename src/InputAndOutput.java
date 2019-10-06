import java.util.Scanner;

public class InputAndOutput {
    private Language language;

    public InputAndOutput() {
        String language = getLanguage();
        boolean isGerman = "1".equals(language);

        this.language = new Language();
        this.language.setLanguageEnglish(!isGerman);
    }

    private String getString() {
        Scanner input = new Scanner(System.in);
        String result = input.next();
        input.close();
        return result;
    }

    public int getNextMove() {
        // TODO: use method in Language class here
        System.out.println("Please input your next move\n" +
                "use only number from 0-8.");
        String result = getString();
        return Integer.parseInt(result);
    }

    public String getLanguage() {
        System.out.println(language.setLanguageMessage());
        return getString();
    }


}
