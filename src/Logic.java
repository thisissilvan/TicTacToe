package src;

public class Logic {


    public void startGame() {
        // init. a new board
        Board board = new Board();

        // get language input
        Language language = new Language();

        // create new players
        Player x = new Player();
        Player o = new Player();
        //initialize inputandoutput

        // play game
        playGame();

        // show game results
    }

    private void playGame() {
    int x = 11;
    int o = 22;
    int symbol = x;
        //method to print the empty board (from class InputAndOutput or from class Board

        while (!boardIsFull() || !gameWon()) {

            language.turnChangesMessage();
            int newPosition = scanner.nextInt();

            if(illegalEntry(newPosition))
                language.illegalMove();
            else {
                updateBoard(newPosition, symbol);
                printBoard();
            }
        }
        //if(game won) do print: x.name hat gewonnen
        //else print Game over.


        }
     public boolean illegalEntry(int newPosition){
        if(newPosition > 8 || (board.get(newPosition) < 0 && (board.get(newPosition) > 8))
            return true;
     }




    }

