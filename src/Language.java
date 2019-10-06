/**
 * Diese Klasse beinhalted alle Nachrichten, die nachher an die Klasse InputAndOutput weitergereicht werden.
 * Jede Nachricht ist in den Sprachen Deutsch und Englisch definiert für verschiedene Szenarien.
 * Am anfang wird durch die Klasse Logic der Boolean languageEnglish gesetzt, der nacher dafür sorgt,
 * dass alle Nachrichten in der gewünschten Sprache ausgegeben werden.
 */

public class Language {
    private boolean languageEnglish;

    public String setLanguageMessage(){
        String message = "Willkommen! Bitte geben Sie [1] ein für Deutsch. Welcome! Please enter [0] for english.";
    }

    public String turnChangesMessage(){
        String message;
        if(languageEnglish){
            message = "Please switch player."
        }else{
            message = "Bitte Spieler wechseln."
        }
        return message
    }

    public String outcomeWinMessage(){
        String message;
        if(languageEnglish){
            message = "Congratulations, you have won!"
        }else{
            message = "Gratulation, Sie haben gewonnen!"
        }
        return message
    }

    public String outcomeDrawMessage(){
        String message;
        if(languageEnglish){
            message = "This game ends in a draw."
        }else{
            message = "Dieses Spiel endet mit einem Unentschieden."
        }
        return message
    }

    public String invalidInputMessage(){
        String message;
        if(languageEnglish){
            message = "Please give a valid input."
        }else{
            message = "Bitte geben Sie eine gültige Eingabe."
        }
        return message
    }

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
