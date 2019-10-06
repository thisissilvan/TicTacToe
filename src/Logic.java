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


        //method to print the empty board (from class InputAndOutput or from class Board
        (if isEnglish()){
            while (!boardIsFull() || !gameWon()) {
                //either method from InputAndOutput that says players should switch or I do:
                System.out.println(x.name + ", it is your turn."); //muss das noch ausbauen
                int neuePosition = scanner.nextInt();

                //if(illegalEntry) do print: illegal entry, pls do another entry
                //else updateBoard(neuePosition) and print board

            }
            //if(game won) do print: x.name hat gewonnen
            //else print Game over.
        }else{
            //the same block, just in German
        }


        }
     public void illegalEntry(){

     }


    }

