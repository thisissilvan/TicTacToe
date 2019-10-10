import java.util.ArrayList;

/**
 * Die Klasse Board stellt das Spielfeld zur Verfügung. Hier sind alle relevanten Methoden untergebracht um das
 * Spielfeld zu modellieren.
 *
 * @author Silvan Luethy
 * @version 2019_10_09
 * Modul: Software-Projekt 1, M. Mürner, Dr D. Ehrismann
 */
public class Board {

    private InputAndOutput player = new InputAndOutput();
    private ArrayList<Integer> cells;

    /**
     * Der Konstruktor Board erstellt eine ArrayList unbekannter Grösse. Durch das Aufrufen der Methode
     * initialiseBoard() wird ein Feld der Grösse 3x3 erstellt.
     *
     * Der Einfachheit halber haben die Felder denselben Namen wie die jeweiligen Indexe der ArrayList.
     *
     */
    public Board()
    {
        cells = new ArrayList<>();
        initialiseBoard();
    }

    /**
     * Mit dieser Methode wird ein Spielfeld der Grösse 3x3 als ArrayList erstellt.
     */
    public void initialiseBoard()
    {
        for (int i = 0; i <= 8; i++) {
            cells.add(i);
        }
    }
    public ArrayList<Integer> getCells()
    {
        return cells;
    }

    public void setCells(ArrayList<Integer> cells)
    {
        this.cells = cells;
    }

    public ArrayList<Integer> getField()
    {
        return cells;
    }

    /**
     * Die Methode output produziert einen output-String, welcher das Spielfeld darstellt.
     * Es wird unterschieden, ob das Feld besetzt ist oder nicht, dementsprechend wird der String angepasst.
     *
     * @return Spielfeld mit 9 Feldern
     */
    public String createOutputString()
    {
        String output = " |----|----|----|\n";

        if(cells.get(0) == 0){
            output = output + " |  " + cells.get(0) + " |";
        } else {
            output = output + " | " + cells.get(0) + " |";
        }

        if(cells.get(1) == 1){
            output = output + "  " + cells.get(1) + " |";
        } else {
            output = output + " " + cells.get(1) + " |";
        }

        if (cells.get(2) == 2){
            output = output + "  " + cells.get(2) + " |\n" + " |____|____|____|\n";
        } else {
            output = output + " " + cells.get(2) + " |\n" + " |____|____|____|\n";
        }

        if(cells.get(3) == 3){
            output = output + " |  " + cells.get(3) + " |";
        } else {
            output = output + " | " + cells.get(3) + " |";
        }

        if(cells.get(4) == 4){
            output = output + "  " + cells.get(4) + " |";
        } else {
            output = output + " " + cells.get(4) + " |";
        }

        if (cells.get(5) == 5){
            output = output + "  " + cells.get(5) + " |\n" + " |____|____|____|\n";
        } else {
            output = output + " " + cells.get(5) + " |\n" + " |____|____|____|\n";
        }

        if(cells.get(6) == 6){
            output = output + " |  " + cells.get(6) + " |";
        } else {
            output = output + " | " + cells.get(6) + " |";
        }

        if(cells.get(7) == 7){
            output = output + "  " + cells.get(7) + " |";
        } else {
            output = output + " " + cells.get(7) + " |";
        }

        if (cells.get(8) == 8){
            output = output + "  " + cells.get(8) + " |\n" + " |____|____|____|\n";
        } else {
            output = output + " " + cells.get(8) + " |\n" + " |____|____|____|\n";
        }
        return output;
    }

    /**
     * Diese Methode prüft, ob das Spielfeld belegt ist oder nicht. Der Rückgabewert ist
     * false, solange es noch freie Felder auf dem Spielfeld hat.
     *
     * @return Ein boolean, welcher signalisiert, ob das Spielfeld voll belegt ist oder nicht
     *         false bedeutet, dass es noch freie Felder hat, true bedeutet, dass alle Felder belegt sind.
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
     * Die Methode updateBoard ersetzt ein freies Feld durch die Nummer der spielenden Person,
     * welche einen Spielzug macht.
     *
     * Personen, welche das Spiel spielen haben entweder die Bezeichnung 11 oder 22, diese Werte werden
     * als int-Wert gespeichert.
     *
     * @param position Die Position, an welcher das leere Feld ersetzt werden soll.
     * @param zeichen Das Zeichen der Person, welche an der Reihe ist, entweder 11 oder 22.
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

