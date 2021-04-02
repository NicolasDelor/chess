package colorfx.model;

import javafx.scene.layout.Pane;

public class Case  {


    int[] xArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    int[] yArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    Pane pane;

    public Case( int[] xArray, int[] yArray, Pane pane) {
        this.xArray = xArray;
        this.yArray = yArray;
        this.pane = pane;
    }

    public int[] getxArray() {
        return xArray;
    }

    public void setxArray(int[] xArray) {
        this.xArray = xArray;
    }

    public int[] getyArray() {
        return yArray;
    }

    public void setyArray(int[] yArray) {
        this.yArray = yArray;
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }
}
