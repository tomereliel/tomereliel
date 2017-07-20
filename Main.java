package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main (String[]args)
    {
        launch(args);
    }

    @Override
    public void start (Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("hello world");
        Parent layout = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene;
        scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
