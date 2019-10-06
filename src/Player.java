public class Player {
    private String name;
    private String symbol;

    /**
     * Der Konstruktor erstellt einen neuen Spieler und speichert seinen Namen sowie sein Zeichen für das Spielfeld.
     */
    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * Diese Methode gibt den Namen des Spielers zurück.
     */
    public String getPlayerName() {
        return name;
    }


}
