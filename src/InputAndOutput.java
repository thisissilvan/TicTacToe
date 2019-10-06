import java.util.Scanner;

public class InputAndOutput {

    private String getString() {
        Scanner input = new Scanner(System.in);
        String result = input.next();
        input.close();
        return result;
    }

    public int getNextMove(String message) {
        System.out.println(message);
        String result = getString();
        return Integer.parseInt(result);
    }

    public String getLanguage(String message) {
        System.out.println(message);
        return getString();
    }
}
