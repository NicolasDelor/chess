package colorfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import javax.swing.text.html.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {

    @FXML
    private Pane p11;
    @FXML
    private Pane p12;
    @FXML
    private Pane p13;
    @FXML
    private Pane p14;
    @FXML
    private Pane p15;
    @FXML
    private Pane p16;
    @FXML
    private Pane p17;
    @FXML
    private Pane p18;
    @FXML
    private Pane p21;
    @FXML
    private Pane p22;
    @FXML
    private Pane p23;
    @FXML
    private Pane p24;
    @FXML
    private Pane p25;
    @FXML
    private Pane p26;
    @FXML
    private Pane p27;
    @FXML
    private Pane p28;
    @FXML
    private Pane p31;
    @FXML
    private Pane p32;
    @FXML
    private Pane p33;
    @FXML
    private Pane p34;
    @FXML
    private Pane p35;
    @FXML
    private Pane p36;
    @FXML
    private Pane p37;
    @FXML
    private Pane p38;
    @FXML
    private Pane p41;
    @FXML
    private Pane p42;
    @FXML
    private Pane p43;
    @FXML
    private Pane p44;
    @FXML
    private Pane p45;
    @FXML
    private Pane p46;
    @FXML
    private Pane p47;
    @FXML
    private Pane p48;
    @FXML
    private Pane p51;
    @FXML
    private Pane p52;
    @FXML
    private Pane p53;
    @FXML
    private Pane p54;
    @FXML
    private Pane p55;
    @FXML
    private Pane p56;
    @FXML
    private Pane p57;
    @FXML
    private Pane p58;
    @FXML
    private Pane p61;
    @FXML
    private Pane p62;
    @FXML
    private Pane p63;
    @FXML
    private Pane p64;
    @FXML
    private Pane p65;
    @FXML
    private Pane p66;
    @FXML
    private Pane p67;
    @FXML
    private Pane p68;

    @FXML
    private ImageView whitePawn1;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Start !!");

        setBoard();

        p11.setOnMouseClicked(MouseEvent -> {
            System.out.println("Click");
            p11.setStyle("-fx-background-color: green;");
        });
    }

    private void setBoard() {

    }
}
