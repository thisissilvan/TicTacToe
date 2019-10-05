import java.util.ArrayList;


public class Board {

    private InputAndOutput player = new InputAndOutput;
    private ArrayList<Integer> cells = new ArrayList<>();

    /**
     * Der Konstruktor Board erstellt ein Spielfeld und füllt die Felder mit der
     * Feldbezeichnung auf.
     *
     * Ein Feld besteht aus 9 leeren Feldern. Der Einfachheit halber haben die Felder
     * denselben Namen wie die jeweiligen Indexe der ArrayList.
     *
     * Sobald ein Spielzug gespielt wird, soll der Inhalt des Feldes überschrieben werden.
     *
     */

    public Board()
    {
        cells.add(0);
        cells.add(1);
        cells.add(2);
        cells.add(3);
        cells.add(4);
        cells.add(5);
        cells.add(6);
        cells.add(7);
        cells.add(8);
    }

    /**
     * Diese Methode prüft, ob das Spielfeld belegt ist oder nicht. Der Rückgabewert ist
     * false, solange es noch freie Felder auf dem Spielfeld hat.
     * @return boolean isFull
     */
    public boolean boardIsFull()
    {
        boolean isFull = false;

        if((cells.get(0) != 0) && (cells.get(1) != 1) && (cells.get(2) != 2) &&
           (cells.get(3) != 3) && (cells.get(4) != 4) && (cells.get(5) != 5) &&
           (cells.get(6) != 6) && (cells.get(7) != 7) && (cells.get(8) != 8)) {
           isFull = true;
        }

        return isFull;
    }

    /**
     * Beim Aufrufen dieser Methode wird das Spielfeld ausgegeben. Ebenso wird
     * die play Methode aus der Klasse InputAndOutput aufgerufen, mit welcher die
     * Variabeln für den Spielzug via Scanner-Input entgegengenommen werden.
     */
    public void play()
    {
        printBoard();
        player.play();
    }


    /**
     * Mit der Methode printBoard kann der aktuelle Spielstand auf die Konsole ausgegeben werden.
     */
    public void printBoard()
    {
        System.out.println();
        System.out.println(" |----|----|----|");
        System.out.println(" |  " + cells.get(0) + " | " + cells.get(1) + "  | " + cells.get(2) + "  |   ");
        System.out.println(" |____|____|____|");
        System.out.println(" |  " + cells.get(3) + " | " + cells.get(4) + "  | " + cells.get(5) + "  |   ");
        System.out.println(" |____|____|____|");
        System.out.println(" |  " + cells.get(6) + " | " + cells.get(7) + "  | " + cells.get(8) + "  |   ");
        System.out.println(" |____|____|____|");

    }

}

