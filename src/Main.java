import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        View view = new View();
        Scene scene = new Scene(view, 300, 600);
        stage.setScene(scene);
        stage.show();
    }
}