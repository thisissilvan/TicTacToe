import java.util.List;

public class Logic {
    private int symbol;
    private Board board;
    private Language language;
    private InputAndOutput input;
    private int symbol_x = 11;
    private int symbol_o = 22;

    public void startGame() {
        board = new Board();
        language = new Language();
        input = new InputAndOutput();

        String lang = input.getLanguage(this.language.setLanguageMessage());
        boolean isEnglish = "0".equals(lang);
        this.language.setLanguageEnglish(isEnglish);

        playGame();
    }

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
    }

    private boolean illegalEntry(int newPosition) {
        List<Integer> cells = board.getCells();
        return (cells.get(newPosition)>8 || newPosition > 8 || newPosition < 0);
    }

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

