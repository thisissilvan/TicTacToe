/**
 * In der Klasse TicTacToe wird mittels der main-Methode ein Logic Objekt erstellt und mit der Methode
 * logic.startGame() das Spiel via logik-Klasse gestartet.
 *
 * Spielablauf:
 *
 * Es können 2 Mitspieler/innen an einem Spiel teilnehmen. Anstatt X und O wird 11 für die erste Person und 22 für
 * die zweite Person verwendet.
 *
 * Zu Beginn des Spieles kann die Sprache gewählt werden.
 *
 * Abwechslungsweise können die 2 Mitspieler/innen auf einem 3x3 Feld grossen Spielfeld ihre Spielzüge
 * machen. Sobald eine Person 3 gleiche Symbohle (11 oder 22) nebeneinander (senkrecht, diagonal oder vertikal)
 * gesetzt hat, gewinnt diese Person das Spiel.
 *
 * Illegale Züge (überschreiben eines bereits belegten Feldes oder Spielzug auf ein nicht existierendes Feld) werden
 * nicht durchgeführt und die Mitspieler/innen haben die Möglichkeit, ihre Auswahl zu
 * korrigieren, sie werden durch das System dazu aufgefordert.
 *
 * Sobald ein Spiel gewonnen ist, kann man entweder mit der gleichen Sprache weiterspielen oder das Programm beenden.
 *
 * Die weiteren Beschreibungen zu den einzelnen Methoden sind in den einzelnen Klassen aufgeführt.
 *
 * @author: Silvan Lüthy
 * @version: 2019_10_10
 * Modul: Software-Projekt 1, M. Mürner, Dr D. Ehrismann
 */

public class TicTacToe {
    public static void main(String[] args) {

        Logic logic = new Logic();
        logic.startGame();
    }
}
