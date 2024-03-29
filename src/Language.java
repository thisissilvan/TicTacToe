/**
 * Diese Klasse beinhalted alle Nachrichten, die nachher an die Klasse InputAndOutput weitergereicht werden.
 * Jede Nachricht ist in den Sprachen Deutsch und Englisch definiert für verschiedene Szenarien.
 * Am Anfang wird durch die Klasse Logic der Boolean languageEnglish gesetzt, der nacher dafür sorgt,
 * dass alle Nachrichten in der gewünschten Sprache ausgegeben werden. Falls der Wert vom boolean true ist,
 * wird die Sprache auf Englisch gesetzt und bei false ist sie Deutsch.
 * @author Küsang Kündetsang
 * @version 2019_10_09
 * Modul: Software-Projekt 1, M. Mürner, Dr D. Ehrismann
 */

public class Language {
    private boolean languageEnglish;

    public void setLanguageEnglish(boolean languageEnglish) {
        this.languageEnglish = languageEnglish;
    }

    /**
     * Diese Methode wird am Anfang des Spiels aufgerufen umd nach dem Sprachwunsch des Benutzers zufragen.
     */
    public String setLanguageMessage() {
        return "Willkommen! Bitte geben Sie [0] ein für Englisch und jede andere Nummer für Deutsch.\n" +
                "Welcome! Please enter [0] for English and any other number for German.";
    }

    /**
     * Diese Methode gibt zurück, dass der nächste Spieler dran ist.
     */
    public String turnChangesMessage() {
        String message;
        if (languageEnglish) {
            message = "Please switch player.";
        } else {
            message = "Bitte Spieler wechseln.";
        }
        return message;

    }

    /**
     * Diese Nachricht wird ausgegeben vor jedem Zug.
     * */
    public String getNextMoveMessage() {
        String message;
        if(languageEnglish){
            message = "Please enter a number that ranges from 0 to 8";
        }else{
            message = "Bitte eine Zahl von 0 bis 8 eingeben";
        }
        return message;
    }

    /**
     * Je nach Booleanwert gibt diese Methode eine Gewinn-Message auf Deutsch oder Englisch zurück.
     */
    public String outcomeWinMessage() {
        String message;
        if (languageEnglish) {
            message = "Congratulations, you have won!";
        } else {
            message = "Gratulation, Sie haben gewonnen!";
        }
        return message;
    }

    /**
     * Diese Methode gibt eine Message zurück, in Deutsch oder Englisch, im Falle eines Gleichstands.
     */
    public String outcomeDrawMessage() {
        String message;
        if (languageEnglish) {
            message = "This game ends in a draw.";
        } else {
            message = "Dieses Spiel endet mit einem Unentschieden.";
        }
        return message;
    }

    /**
     * Falls ein ungültiger Wert eingegeben wird vom Benutzer, wird diese Nachricht zurückgegeben.
     */
    public String invalidInputMessage() {
        String message;
        if (languageEnglish) {
            message = "Please give a valid input.";
        } else {
            message = "Bitte geben Sie eine gültige Eingabe ein.";
        }
        return message;
    }

    /**
     * Am Ende des Spiels fragt diese Methode, ob ein neues gestarted werden soll.
     */
    public String gameEndMessage() {
        String message;
        if (languageEnglish) {
            message = "The game has ended. To continue playing press [0] and exit with any number.";
        } else {
            message = "Das Spiel ist zu ende. Um weiterzuspielen drücken Sie [0] und jede andere Nummer, um das Spiel zu beenden.";
        }
        return message;
    }

    /**
     * Im Falle das der Benutzer nicht mehr weiterspielen möchte, wird am Ende noch eine Dankeschön-Nachricht ausgegeben.
     */
    public String thankYouMessage() {
        String message;
        if (languageEnglish) {
            message = "Thank you very much for playing!";
        } else {
            message = "Danke viel Mals fürs spielen!";
        }
        return message;
    }
}
