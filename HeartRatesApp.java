import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class HeartRatesApp extends Application {
    @Override
    public void start (Stage stage) throws Exception {
        Parent root=
            FXMLLoader.load(getClass().getResource("HeartRatesApp.fxml"));

            Scene scene= new Scene (root);
            stage.setTitle ("HeartRatesApp");
            stage.setScene (scene);
            stage.show();
    }
    public static void main (String[] args) {
        launch (args);
    }
}