import java.util.Scanner;

/**
 * Die Klasse InputAndOutput ist für die Ein- und Ausgaben auf der Kommandozeile verantwortlich.
 * Sie bietet Methoden, die den Anwendenden zu Eingaben auffordert und dabei Hinweistexte anzeigt.
 * Die vom Anwendenden eingegeben Daten werden dann in das benötigte Format konvertiert und an den
 * Aufrufer zurückgegeben.
 *
 * @author  Ala Hadi
 * @version 2019-10-09
 * Modul: Software-Projekt 1, M. Mürner, Dr D. Ehrismann
 */
public class InputAndOutput {

    private String getString() {
        Scanner input = new Scanner(System.in);
        String result = input.next();
        return result;
    }

    /**
     * Diese Methode fragt den Anwendenden nach dem nächsten Spielzug.
     * @param message Die Nachricht, die dem Anwender zur Eingabe angezeigt wird
     * @return Die Nutzereingabe
     */
    public int getNextMove(String message) {
        System.out.println(message);
        String result = getString();
        return Integer.parseInt(result);
    }

    /**
     * Diese Methode fragt den Anwendenden, ob das nächste Spiel gestartet werden soll.
     * @param message Die Nachricht, die dem Anwender zur Eingabe angezeigt wird
     * @return Die Nutzereingabe
     */
    public int getNextGame(String message) {
        System.out.println(message);
        String result = getString();
        return Integer.parseInt(result);
    }

    /**
     * Diese Methode fragt den Anwendenden nach seiner Sprach-Präferenz.
     * @param message Die Nachricht, die dem Anwender zur Eingabe angezeigt wird
     * @return Die Nutzereingabe
     */
    public String getLanguage(String message) {
        System.out.println(message);
        return getString();
    }
}
