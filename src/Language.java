/**
 * Diese Klasse beinhalted alle Nachrichten, die nachher an die Klasse InputAndOutput weitergereicht werden.
 * Jede Nachricht ist in den Sprachen Deutsch und Englisch definiert.
 */

public class Language {
    private boolean languageEnglish;

    /**
     * Diese Methode wird am Anfang des Spiels aufgerufen umd nach dem Sprachwunsch des Benutzers zufragen.
     */
    public String setLanguageMessage(){
        String message = "Willkommen! Bitte geben Sie [1] ein für Deutsch. Welcome! Please enter [0] for english.";
    }

    /**
     * Je nach Booleanwert gibt diese Methode eine Gewinn-Message auf Deutsch oder Englisch zurück.
     */
    public String outcomeWinMessage(){
        String message;
        if(languageEnglish){
            message = "Congratulations, you have won!"
        }else{
            message = "Gratulation, Sie haben gewonnen!"
        }
        return message
    }
    /**
     * Diese Methode gibt eine Message zurück, in Deutsch oder Englisch, im Falle eines Gleichstands.
     */
    public String outcomeDrawMessage(){
        String message;
        if(languageEnglish){
            message = "This game ends in a draw."
        }else{
            message = "Dieses Spiel endet mit einem Unentschieden."
        }
        return message
    }

    /**
     * Falls ein ungültiger Wert eingegeben wird vom Benutzer, wird diese Nachricht ausgegeben.
     */
    public String invalidInputMessage(){
        String message;
        if(languageEnglish){
            message = "Please give a valid input."
        }else{
            message = "Bitte geben Sie eine gültige Eingabe."
        }
        return message
    }

    /**
     * Am Ende des Spiels fragt diese Methode, ob ein neues gestarted werden soll.
     */
    public String outcomeDrawMessage(){
        String message;
        if(languageEnglish){
            message = "The game has ended, would you like to continue playing? No [1] Yes [0]"
        }else{
            message = "Das Spiel ist zu ende, möchten Sie weiter spielen? Nein [1] Ja [0]"
        }
        return message
    }

}
