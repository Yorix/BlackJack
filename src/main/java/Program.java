import controllers.StartWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;


public class Program extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/start.fxml"));
        loader.setResources(ResourceBundle.getBundle("bundles/Locale", new Locale("ru")));
        Parent parent = loader.load();

        StartWindowController startWindowController = loader.getController();
        startWindowController.setStartStage(primaryStage);

        primaryStage.setTitle(loader.getResources().getString("key.title"));
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(parent));
        primaryStage.getIcons().add(new Image("/img/blackjack.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
