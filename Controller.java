package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;
public class Controller
{
    @FXML
    private Label myMessege;
    public void generateRandom(ActionEvent event1)
    {
        Random rnd = new Random();
        int num = rnd.nextInt(10)+1;
        myMessege.setText(Integer.toString(num));
    }

    public void printHelloWorld(ActionEvent event2)
    {
        System.out.println("Hello World");
    }
}
