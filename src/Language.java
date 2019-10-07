/**
 * Diese Klasse beinhalted alle Nachrichten, die nachher an die Klasse InputAndOutput weitergereicht werden.
 * Jede Nachricht ist in den Sprachen Deutsch und Englisch definiert für verschiedene Szenarien.
 * Am anfang wird durch die Klasse Logic der Boolean languageEnglish gesetzt, der nacher dafür sorgt,
 * dass alle Nachrichten in der gewünschten Sprache ausgegeben werden. Falls der Wert vom boolean true ist,
 * wird die Sprache auf Englisch gesetzt und bei false ist sie Deutsch.
 */

public class Language {
    private boolean languageEnglish;

    /**
     * Diese Methode wird am Anfang des Spiels aufgerufen umd nach dem Sprachwunsch des Benutzers zufragen.
     */
    public String setLanguageMessage(){
        return "Willkommen! Bitte geben Sie [1] ein für Deutsch. Welcome! Please enter [0] for english.";
    }

    /**
     * Diese Methode gibt zurück, dass der nächste Spieler dran ist.
     */
    public String turnChangesMessage(){
        String message;
        if(languageEnglish){
            message = "Please switch player.";
        }else{
            message = "Bitte Spieler wechseln.";
        }
        return message;
    }

    /**
     * Je nach Booleanwert gibt diese Methode eine Gewinn-Message auf Deutsch oder Englisch zurück.
     */
    public String outcomeWinMessage(){
        String message;
        if(languageEnglish){
            message = "Congratulations, you have won!";
        }else{
            message = "Gratulation, Sie haben gewonnen!";
        }
        return message;
    }

    /**
     * Diese Methode gibt eine Message zurück, in Deutsch oder Englisch, im Falle eines Gleichstands.
     */
    public String outcomeDrawMessage(){
        String message;
        if(languageEnglish){
            message = "This game ends in a draw.";
        }else{
            message = "Dieses Spiel endet mit einem Unentschieden.";
        }
        return message;
    }

    /**
     * Falls ein ungültiger Wert eingegeben wird vom Benutzer, wird diese Nachricht zurückgegeben.
     */
    public String invalidInputMessage(){
        String message;
        if(languageEnglish){
            message = "Please give a valid input.";
        }else{
            message = "Bitte geben Sie eine gültige Eingabe.";
        }
        return message;
    }
    /**
     * Am Ende des Spiels fragt diese Methode, ob ein neues gestarted werden soll.
     */
    public String gameEndMessage(){
        String message;
        if(languageEnglish){
            message = "The game has ended, would you like to continue playing? No [1] Yes [0]";
        }else{
            message = "Das Spiel ist zu ende, möchten Sie weiter spielen? Nein [1] Ja [0]";
        }
        return message;
    }

    public void setLanguageEnglish(boolean languageEnglish) {
        this.languageEnglish = languageEnglish;
    }

    public String getNextMoveMessage() {
        String message;
        if(languageEnglish){
            message = "Please inter a number in the range 0 to 8";
        }else{
            message = "Bitte eine Zahl von 0 bis 8 eingeben";
        }
        return message;
    }

    public String thankYouMessage() {
        String message;
        message= "Thanks";
        return message;
    }
}
