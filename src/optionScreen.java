import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by timurguler on 11/26/16.
 */
public class optionScreen extends Stage
{
    private Label labelOneOne;
    public optionScreen(Label labelOneOne)
    {
        super();
        this.labelOneOne = labelOneOne;
        start(this);
    }
    public void start(Stage optionScreen)
    {
        StackPane optionPane = new StackPane();
        Scene optionScene = new Scene(optionPane,350,250);

        // the label that asks if you want to play again
        Label optionLabel = new Label();
        optionLabel.setPrefSize(100,50);
        optionLabel.setAlignment(Pos.CENTER);
        optionLabel.setTranslateY(-50);
        optionLabel.setFont(Font.font("Helvatica", 15));
        optionLabel.setText("Play Again?");

        // the try again button
        Button tryAgainButton = new Button();
        tryAgainButton.setPrefSize(100,25);
        tryAgainButton.setTranslateY(50);
        tryAgainButton.setTranslateX(-70);
        tryAgainButton.setText("Try Again");

        //the quit button
        Button quitButton = new Button();
        quitButton.setPrefSize(100,25);
        quitButton.setTranslateY(50);
        quitButton.setTranslateX(70);
        quitButton.setText("Quit");

        // add everything to the pane
        optionPane.getChildren().addAll(optionLabel,tryAgainButton,quitButton);
        optionScreen.setScene(optionScene);
        optionScreen.show();

        tryAgainButton.setOnAction(event ->
        {
            // start a new game
            labelOneOne.getScene().getWindow().hide();
            optionScreen.close();
            gamePanel startGameAgain = new gamePanel();
            startGameAgain.show();
        });
        quitButton.setOnAction(event ->
        {
            // quit the game
            Platform.exit();
            System.exit(0);
        });
    }
}
