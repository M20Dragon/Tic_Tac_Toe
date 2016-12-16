//xoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxo


// PLAYER 1 IS X
// PLAYER 2 IS O
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by timurguler on 11/18/16.
 */
public class gamePanel extends Stage
{
    private boolean oneOneChecked = false, twoOneChecked = false, threeOneChecked = false, oneTwoChecked = false, twoTwoChecked = false, threeTwoChecked = false, oneThreeChecked = false, twoThreeChecked = false, threeThreeChecked = false;
    private Label labelOneOne,labelTwoOne,labelThreeOne,labelOneTwo,labelTwoTwo,labelThreeTwo,labelOneThree,labelTwoThree,labelThreeThree;
    private TextArea console;
    private boolean xTurn = false;
    private int turnCounter = 2;
    public int winningPlayer = 0;
    private boolean gameTie = false;
    public gamePanel()
    {
        super();
        start(this);
    }
    public void start(Stage gamePanel)
    {
        StackPane gamePane = new StackPane(); // declares a new StackPane
        Scene gameScene = new Scene(gamePane,620,950); // makes a new scene
        gamePanel.setMinWidth(620); // sets the minimum width of the gamePanel
        gamePanel.setMinHeight(850); // sets the minimum height of the gamePanel

        gamePane.setStyle("-fx-background-color:whitesmoke;"); //sets the color of the background of the window (set to desired color but makesure defaultColor is the same color
        Color defaultColour = Color.WHITESMOKE; // sets the default font color
        Color xColor = Color.BLUE; // defines the color of the x's
        Color oColor = Color.RED; // defines the color of the o's

        GridPane ticTacGrid = new GridPane(); // creates a new grid pane
        ticTacGrid.setGridLinesVisible(true); // sets the grid lines visible for notable separtation

        labelOneOne = new Label(); // makes a new label
        labelOneOne.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelOneOne, 1, 1); // column=1 row=1
        labelOneOne.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelOneOne.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelTwoOne = new Label(); // makes a new label
        labelTwoOne.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelTwoOne, 2, 1); // column=1 row=1
        labelTwoOne.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelTwoOne.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelThreeOne = new Label(); // makes a new label
        labelThreeOne.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelThreeOne, 3, 1); // column=1 row=1
        labelThreeOne.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelThreeOne.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelOneTwo = new Label(); // makes a new label
        labelOneTwo.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelOneTwo, 1, 2); // column=1 row=2
        labelOneTwo.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelOneTwo.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelTwoTwo = new Label(); // makes a new label
        labelTwoTwo.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelTwoTwo, 2, 2); // column=2 row=2
        labelTwoTwo.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelTwoTwo.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelThreeTwo = new Label(); // makes a new label
        labelThreeTwo.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelThreeTwo, 3, 2); // column=3 row=1
        labelThreeTwo.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelThreeTwo.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelOneThree = new Label(); // makes a new label
        labelOneThree.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelOneThree, 1, 3); // column=1 row=3
        labelOneThree.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelOneThree.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelTwoThree = new Label(); // makes a new label
        labelTwoThree.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelTwoThree, 2, 3); // column=2 row=3
        labelTwoThree.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelTwoThree.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        labelThreeThree = new Label(); // makes a new label
        labelThreeThree.setFont(Font.font("Helvatica", 150)); // sets the font for the label
        GridPane.setConstraints(labelThreeThree, 3, 3); // column=3 row=3
        labelThreeThree.setTextFill(defaultColour); // sets the color of the text to the defaultColour
        labelThreeThree.setText(" Z "); // sets the text to z to make sure grid does not get smaller

        console = new TextArea();
        console.setMaxSize(gamePane.getWidth(),296);
        console.setTranslateY(328);
        console.isWrapText();
        console.setStyle("-fx-background-color:black;");

        ticTacGrid.getChildren().addAll(labelOneOne,labelTwoOne,labelThreeOne,labelOneTwo,labelTwoTwo,labelThreeTwo,labelOneThree,labelTwoThree,labelThreeThree); // adds all of the label to the GridPane
        /*while(console.getLayoutY() <= labelThreeThree.getLayoutY()+labelThreeThree.getHeight())
        {
            console.setTranslateY(1);
        }*/
        gamePane.getChildren().addAll(ticTacGrid,console);// adds all of the declared objects to the screen
        gamePanel.setScene(gameScene); // sets the scene of the Stage to gameScene
        gamePanel.show(); // shows the contents of the screen

        //////////////////////////////////////////////////////////////////////////////////////FOR UPDATING DISPLAY

        console.setStyle("-fx-text-fill:cyan ; -fx-font-size: 11;"); // makes the text a cyan color at the start of the game
        console.appendText("GAME START" + "\n"); // tells the players that the game has started

            console.appendText("\nO's Turn"); // shows that X goes first
            labelOneOne.setOnMouseClicked(event -> // event that the top left label is clicked
            {
                if(oneOneChecked) // if label is clicked then it tells the players to pick another label
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(1,1)clicked");
                    oneOneChecked = true;
                    if (xTurn)
                    {
                        labelOneOne.setTextFill(xColor);
                        labelOneOne.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelOneOne.setTextFill(oColor);
                        labelOneOne.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelTwoOne.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(twoOneChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(2,1)clicked");
                    twoOneChecked = true;
                    if (xTurn)
                    {
                        labelTwoOne.setTextFill(xColor);
                        labelTwoOne.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelTwoOne.setTextFill(oColor);
                        labelTwoOne.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelThreeOne.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(threeOneChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(3,1)clicked");
                    threeOneChecked = true;
                    if (xTurn)
                    {
                        labelThreeOne.setTextFill(xColor);
                        labelThreeOne.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelThreeOne.setTextFill(oColor);
                        labelThreeOne.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelOneTwo.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(oneTwoChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(1,2)clicked");
                    oneTwoChecked = true;
                    if (xTurn)
                    {
                        labelOneTwo.setTextFill(xColor);
                        labelOneTwo.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelOneTwo.setTextFill(oColor);
                        labelOneTwo.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelTwoTwo.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(twoTwoChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(2,2)clicked");
                    twoTwoChecked = true;
                    if (xTurn)
                    {
                        labelTwoTwo.setTextFill(xColor);
                        labelTwoTwo.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelTwoTwo.setTextFill(oColor);
                        labelTwoTwo.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelThreeTwo.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(threeTwoChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(3,2)clicked");
                    threeTwoChecked = true;
                    if (xTurn)
                    {
                        labelThreeTwo.setTextFill(xColor);
                        labelThreeTwo.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelThreeTwo.setTextFill(oColor);
                        labelThreeTwo.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelOneThree.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(oneThreeChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(1,3)clicked");
                    oneThreeChecked = true;
                    if (xTurn)
                    {
                        labelOneThree.setTextFill(xColor);
                        labelOneThree.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelOneThree.setTextFill(oColor);
                        labelOneThree.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelTwoThree.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(twoThreeChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(2,3)clicked");
                    twoThreeChecked = true;
                    if (xTurn)
                    {
                        labelTwoThree.setTextFill(xColor);
                        labelTwoThree.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelTwoThree.setTextFill(oColor);
                        labelTwoThree.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
            labelThreeThree.setOnMouseClicked(event -> // if label is clicked then it tells the players to pick another label
            {
                if(threeThreeChecked)
                {
                    console.appendText("\nALREADY CLICKED! PLEASE PICK ANOTHER SQUARE THAT IS EMPTY");
                }
                else // else then set the text and logic accordingly
                {
                    System.out.println("(3,3)clicked");
                    threeThreeChecked = true;
                    if (xTurn)
                    {
                        labelThreeThree.setTextFill(xColor);
                        labelThreeThree.setText(" X ");
                    } else if (!xTurn)
                    {
                        labelThreeThree.setTextFill(oColor);
                        labelThreeThree.setText(" O ");
                    }
                    turnCounter++;
                    checkForEnd();
                }
            });
    }
    public void checkForEnd()
    {
        if (xTurn)
            console.setStyle("-fx-text-fill: red; -fx-font-size: 11;");
        else if (!xTurn)
            console.setStyle("-fx-text-fill: blue; -fx-font-size: 11;");
        progressChecker findResults = new progressChecker();
        findResults.setValues(oneOneChecked, twoOneChecked, threeOneChecked, oneTwoChecked, twoTwoChecked, threeTwoChecked, oneThreeChecked, twoThreeChecked, threeThreeChecked, labelOneOne, labelTwoOne, labelThreeOne, labelOneTwo, labelTwoTwo, labelThreeTwo, labelOneThree, labelTwoThree, labelThreeThree);
        if(findResults.gameEnded())
        {
            System.out.println("end game");
            if(turnCounter % 2 == 0)
                winningPlayer = 1;
            else if(turnCounter % 2 == 1)
                winningPlayer = 2;
        }
        if(oneOneChecked && twoOneChecked && threeOneChecked && oneTwoChecked && twoTwoChecked && threeTwoChecked && oneThreeChecked && twoThreeChecked && threeThreeChecked)
        {
            console.appendText("\nThere was a tie");
            gameTie = true;
            optionScreen tieWinOption = new optionScreen(labelOneOne);
            tieWinOption.show();
        }
        if(!findResults.gameEnded())
        {
            System.out.println(turnCounter);
            if (turnCounter % 2 == 0)
            {
                xTurn = false;
                if(!gameTie)
                console.appendText("\nO's Turn");
            }
            else if (turnCounter % 2 == 1)
            {
                xTurn = true;
                if(!gameTie)
                console.appendText("\nX's Turn");
            }
        }
        if(winningPlayer == 1)
        {
            System.out.println("O is the winner");
            console.setStyle("-fx-text-fill: lime; -fx-font-size: 11;");
            console.appendText("\nX wins!");
            optionScreen xWinOption = new optionScreen(labelOneOne);
            xWinOption.show();
        }
        else if(winningPlayer == 2)
        {
            System.out.println("O is the winner");
            console.setStyle("-fx-text-fill: lime; -fx-font-size: 11;");
            console.appendText("\nO wins!");
            optionScreen oWinOption = new optionScreen(labelOneOne);
            oWinOption.show();
        }
        System.out.println(winningPlayer);
    }
}
