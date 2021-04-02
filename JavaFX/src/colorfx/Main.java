package colorfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("vue/ChessVue.fxml"));
        primaryStage.setTitle("Chess");
        primaryStage.setScene(new Scene(root, 680, 680));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
