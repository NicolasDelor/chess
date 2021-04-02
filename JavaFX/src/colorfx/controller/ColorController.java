package colorfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import colorfx.model.Color;
import colorfx.model.Palette;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ColorController {

    private Color color;
    private Palette palette;

    @FXML
    private Slider sliderRed;

    @FXML
    private Slider sliderGreen;

    @FXML
    private Slider sliderBlue;

    @FXML
    private TextField textFieldRed;

    @FXML
    private TextField textFieldBlue;

    @FXML
    private TextField textFieldGreen;

    @FXML
    private TextField hexColor;

    @FXML
    private Pane paneColor;

    @FXML
    private Pane paneColorPalette1;

    @FXML
    private Pane paneColorPalette2;

    @FXML
    private Pane paneColorPalette3;

    @FXML
    private Pane paneColorPalette4;

    @FXML
    private Pane paneColorPalette5;

    public void initialize(URL location, ResourceBundle resources) {

        color = new Color(0, 0, 0);
        palette = new Palette(color);

        updateUI();

        sliderRed.valueProperty()
                .addListener((observable, oldValue, newValue) -> setColor(COLOR.RED, newValue.intValue()));
        textFieldRed.textProperty()
                .addListener((observable, oldValue, newValue) -> setColor(COLOR.RED, Integer.valueOf(newValue)));
        sliderGreen.valueProperty()
                .addListener((observable, oldValue, newValue) -> setColor(COLOR.GREEN, newValue.intValue()));
        textFieldGreen.textProperty()
                .addListener((observable, oldValue, newValue) -> setColor(COLOR.GREEN, Integer.valueOf(newValue)));
        sliderBlue.valueProperty()
                .addListener((observable, oldValue, newValue) -> setColor(COLOR.BLUE, newValue.intValue()));
        textFieldBlue.textProperty()
                .addListener((observable, oldValue, newValue) -> setColor(COLOR.BLUE, Integer.valueOf(newValue)));
    }

    private void setColor(COLOR rgb, int value) {
        switch (rgb) {
            case RED:
                color.setRed(value);
                break;
            case GREEN:
                color.setGreen(value);
                break;
            case BLUE:
                color.setBlue(value);
                break;
        }
        updateUI();
    }

    private enum COLOR {
        RED, GREEN, BLUE;
    }

    private void updateUI() {

        palette.updatePalette();

        sliderRed.setValue(color.getRed());
        sliderGreen.setValue(color.getGreen());
        sliderBlue.setValue(color.getBlue());

        textFieldRed.setText(String.valueOf(color.getRed()));
        textFieldGreen.setText(String.valueOf(color.getGreen()));
        textFieldBlue.setText(String.valueOf(color.getBlue()));

        hexColor.setText(color.getHexValue());

        paneColor.setStyle("-fx-background-color: " + color.getHexValue() + ";");
        paneColorPalette1.setStyle("-fx-background-color: " + palette.getPalette().get(0).getHexValue() + ";");
        paneColorPalette2.setStyle("-fx-background-color: " + palette.getPalette().get(1).getHexValue() + ";");
        paneColorPalette3.setStyle("-fx-background-color: " + palette.getPalette().get(2).getHexValue() + ";");
        paneColorPalette4.setStyle("-fx-background-color: " + palette.getPalette().get(3).getHexValue() + ";");
        paneColorPalette5.setStyle("-fx-background-color: " + palette.getPalette().get(4).getHexValue() + ";");
    }

}
