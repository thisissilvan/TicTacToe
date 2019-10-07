import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Board stellt das Spielfeld zur Verfügung. Hier sind alle relevanten Methoden untergebracht um das
 * Spielfeld zu modellieren.
 *
 * @author Silvan Luethy
 * @version 2019_10_06
 */
public class Board {

    private InputAndOutput player = new InputAndOutput();
    private List<Integer> cells = new ArrayList<>();

    /**
     * Der Konstruktor Board erstellt ein Spielfeld und füllt die Felder mit der
     * Feldbezeichnung auf.
     *
     * Ein Feld besteht aus 9 leeren Feldern. Der Einfachheit halber haben die Felder
     * denselben Namen wie die jeweiligen Indexe der ArrayList.
     *
     * Sobald ein Spielzug gespielt wird, soll der Inhalt des Feldes mit der Bezeichnung des aktuellen Spielers,
     * der aktuellen Spielerin überschrieben werden.
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
     * Getter Methode der Klasse Board.
     * @return cells
     */
    public List<Integer> getCells()
    {
        return cells;
    }

    /**
     * Setter Methode der Klasse Board.
     * @param cells
     */
    public void setCells(List<Integer> cells)
    {
        this.cells = cells;
    }

    /**
     * Diese Methode gibt die Felder als ArrayList zurück.
     * @return ArrayList
     */
    public List<Integer> getField()
    {
        return cells;
    }

    /**
     * Die Methode output produziert einen output-String, welcher das Spielfeld darstellt.
     */
    public String createOutputString()
    {
        String output =
        " |----|----|----|\n" +
        " |  " + cells.get(0) + " | " + cells.get(1) + "  | " + cells.get(2) + "  |   \n" +
        " |____|____|____|\n" +
        " |  " + cells.get(3) + " | " + cells.get(4) + "  | " + cells.get(5) + "  |   \n" +
        " |____|____|____|\n" +
        " |  " + cells.get(6) + " | " + cells.get(7) + "  | " + cells.get(8) + "  |   \n" +
        " |____|____|____|";

        return output;
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
     * Mit dieser Methode kann das Spielfeld aktuelisiert werden.
     *
     * Es muss die ursprüngliche Position und das zu spielende Zeichen angegeben werden. Mit updateBoard
     * wird in der ArrayList das alte Zeichen gesucht und durch das zu spielende Zeichen ersetzt.
     */
    public void updateBoard(int position, int zeichen)
    {
        cells.set(position, zeichen);
    }

    /**
     * Diese Methode gibt den aktuellen Spielstand auf der Konsole aus.
     */
    public void printBoard()
    {
        System.out.println(createOutputString());
    }

}

