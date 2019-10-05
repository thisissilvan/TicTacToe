public class Language {
    private boolean languageEnglish;

    // display welcome message to choose language
    public String setLanguageMessage(){
        String message = "Willkommen! Bitte geben Sie [1] ein für Deutsch. Welcome! Please enter [0] for english.";
    }

    // custom message for a win
    public String outcomeWinMessage(){
        String message;
        if(languageEnglish){
            message = "Congratulations, you have won!"
        }else{
            message = "Gratulation, Sie haben gewonnen!"
        }
        return message
    }


}
