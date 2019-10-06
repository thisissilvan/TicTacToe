package src;

import javax.swing.*;

public class Logic {
    private int newPosition;
    private int symbol;

    private void startGame() {
        Board board = new Board();
        Language language = new Language();
        InputAndOutput input = new InputAndOutput();

        playGame();
    }

    private void playGame() {
    int x = 11;
    int o = 22;
    symbol = x;

        board.printBoard();
        while (!boardIsFull() || !gameWon()) {

            language.turnChangesMessage();
            newPosition = input.getNextMove();

            if(illegalEntry(newPosition))
                language.invalidInputMessage();
            else {
                board.updateBoard(newPosition, symbol);
                board.printBoard();
                changeSymbol(symbol);
            }
        }

        if(gameWon())
            language.outcomeWinMessage();
        else
            language.outcomeDrawMessage();

        language.gameEndMessage();

        }
     private boolean illegalEntry(int newPosition){
        if(newPosition > 8 || (board.get(newPosition) < 0 && (board.get(newPosition) > 8))
            return true;
     }

     private boolean gameWon(){
        if(board.get(0) == board.get(1) == board.get(2) || board.get(3) == board.get(4) == board.get(5) || board.get(6) == board.get(7) == board.get(8)
                || board.get(0) == board.get(3) == board.get(6) || board.get(1) == board.get(4) == board.get(7) || board.get(2) == board.get(5) == board.get(8)
                || board.get(0) == board.get(4) == board.get(8) || board.get(2) == board.get(4) == board.get(6) )
        return true;
     }

     private void changeSymbol(int currentSymbol){
        int otherSymbol;
        if(symbol == x)
            symbol = o;
        else
            symbol = x;
     }
}

