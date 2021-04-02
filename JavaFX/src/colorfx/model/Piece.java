package colorfx.model;

import javafx.fxml.FXML;

import javax.swing.text.Position;
import javax.swing.text.html.ImageView;
import java.awt.Color;

public abstract class Piece {

    // Possède :
    // - 1 couleur
    // Un état "mort"
    private boolean killed = false;
    private boolean white = false;
    private int positionStart;

    public Piece(boolean white, int positionStart) {
        this.setWhite(white);
        this.setPositionStart(0);
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public int getPositionStart() {
        return positionStart;
    }

    public void setPositionStart(int positionStart) {
        this.positionStart = positionStart;
    }
}
