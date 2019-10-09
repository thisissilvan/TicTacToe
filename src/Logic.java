import java.util.List;

/**
 * Die Klasse Logic startet das Spiel, checkt die Spielregeln und gibt das Spielfeld aus.
 * Dabei greift sie auf die Methoden der anderen Klassen.
 * @author: Sydney Nguyen
 * @version: 2019_10_09
 * Modul: Software-Projekt 1, M. Mürner, Dr D. Ehrismann
 */

public class Logic {
    private int symbol;
    private Board board;
    private Language language;
    private InputAndOutput input;
    private int symbol_x = 11;
    private int symbol_o = 22;

    /**
     * Die Methode startGame() initialisiert ein neues Spielfeld board, eine neue Sprache language und
     * eine Inputfunktion input, zum einlesen der nächsten Spielzüge.
     * Die Sprache wird durch den Spieler festgelegt.
     * Die Methode playGame() wird gestartet.
     */
    public void startGame() {
        board = new Board();
        language = new Language();
        input = new InputAndOutput();

        String lang = input.getLanguage(this.language.setLanguageMessage());
        boolean isEnglish = "0".equals(lang);
        this.language.setLanguageEnglish(isEnglish);

        playGame();
    }

    /**
     * Die Methode playGame() nimmt den gewünschten Zug des Spielers als int entgegen, lässt das board updaten und
     * lässt das board auf der Konsole ausprinten.
     * Dabei wird auf illegale Inputs geprüft.
     * Das Spiel endet, sobald entweder jemand gewonnen hat oder das board voll ist.
     * Am Ende bekommen die Spieler die Option, ein neues Spiel zu starten.
     */
    private void playGame() {
        symbol = symbol_x;
        board.printBoard();

        while (!gameWon() && !board.boardIsFull()) {
            int newPosition = input.getNextMove(language.getNextMoveMessage());
            do {
                if (illegalEntry(newPosition)) {
                    System.out.println(language.invalidInputMessage());
                    newPosition = input.getNextMove(language.getNextMoveMessage());
                }
            } while(illegalEntry(newPosition));

            board.updateBoard(newPosition, symbol);
            board.printBoard();
            changeSymbol(symbol);

            System.out.println(language.turnChangesMessage());
        }

        if (gameWon())
            System.out.println(language.outcomeWinMessage());
        else
            System.out.println(language.outcomeDrawMessage());

        System.out.println(language.gameEndMessage());

        if(input.getNextGame() == 0)
            restartGame();
        else
            System.out.println(language.thankYouMessage());
    }

    private void restartGame() {
        board = new Board();
        input = new InputAndOutput();
        playGame();
    }

    private boolean illegalEntry(int newPosition) {
        List<Integer> cells = board.getCells();
        return (cells.get(newPosition)>8 || newPosition > 8 || newPosition < 0);
    }

    /**
     * Diese Methode prüft, ob das Spiel gewonnen wurde
     * @return true wenn drei Felder in der Zeile/Spalte/Diagonale dasselbe Symbol enthalten
     */
    private boolean gameWon() {
        List<Integer> cells = board.getCells();
        return
                // check horizontal lines
                ((cells.get(0) == cells.get(1)) && cells.get(0) == cells.get(2))
                        || ((cells.get(3) == cells.get(4)) && cells.get(3) == cells.get(5))
                        || ((cells.get(6) == cells.get(7)) && cells.get(6) == cells.get(8))
                        // check vertical lines
                        || ((cells.get(0) == cells.get(3)) && cells.get(0) == cells.get(6))
                        || ((cells.get(1) == cells.get(4)) && cells.get(1) == cells.get(7))
                        || ((cells.get(2) == cells.get(5)) && cells.get(2) == cells.get(8))
                        // check diagonals
                        || ((cells.get(0) == cells.get(4)) && cells.get(0) == cells.get(8))
                        || ((cells.get(2) == cells.get(4)) && cells.get(2) == cells.get(6));
    }

    private void changeSymbol(int currentSymbol) {
        int otherSymbol;
        if (symbol == symbol_x)
            symbol = symbol_o;
        else
            symbol = symbol_x;
    }
}