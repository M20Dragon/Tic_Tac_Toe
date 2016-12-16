import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.RED;

/**
 * Created by timurguler on 11/16/16.
 */
public class menuScreen extends Application
{
    public void start(Stage menuStage)
    {
        // this method shows the menu to start the tic tac toe game
        StackPane menuPane = new StackPane(); // initialize the window
        Scene menuScene = new Scene(menuPane,700,700); // initialize the group that will take the object used for user interaction

        Label gameName = new Label(); // make a new Label that shows the logo
        gameName.setMinSize(500,100); // sets the size of the label
        gameName.setTextFill(RED); // sets the text to red
        gameName.setText("Tic-Tac-Toe"); // sets the text of the title to what is typed in
        gameName.setAlignment(Pos.CENTER); // aligns the label to the center of the frame at all times
        gameName.setTranslateY(-100); // translates the label up 100 pixels
        gameName.setFont(Font.font("Helvatica", 60)); // sets the font and size of the text in the label

        Button startButton = new Button(); // makes a new button that acts as the start button
        startButton.setMinSize(100,50); // sets the minimum size of the button
        startButton.setTextFill(BLACK); // sets the color of the text
        startButton.setText("START"); // sets the text
        startButton.setAlignment(Pos.CENTER); // aligns the button to the center of the window
        startButton.setTranslateY(100); // translates the button down 100 pixels
        startButton.setFont(Font.font("Helvatica", 40)); // sets the font and size of the button text

        menuPane.getChildren().addAll(gameName,startButton); // gets all of the objects and adds them to scene
        menuStage.setScene(menuScene); // set the group of objects to the stage called
        menuStage.show(); // show the stage

        startButton.setOnAction(event -> // gets the input of the start button
        {
            gamePanel newGame = new gamePanel(); // declares a new instance of the gamePanel object
            newGame.show(); // calls the method
            menuStage.close(); // closes the menu window
        });
    }
    public static void main(String[] args)
    {
        launch(args); // launches the application
    }
}
