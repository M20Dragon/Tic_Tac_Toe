import javafx.scene.control.Label;

/**
 * Created by timurguler on 11/23/16.
 */
public class progressChecker
{
    private boolean oneOneState, twoOneState, threeOneState, oneTwoState, twoTwoState, threeTwoState, oneThreeState, twoThreeState, threeThreeState;
    private Label labelOneOne, labelTwoOne, labelThreeOne, labelOneTwo, labelTwoTwo, labelThreeTwo, labelOneThree, labelTwoThree, labelThreeThree;
    public progressChecker()
    {

    }
    public void setValues(boolean oneOneState, boolean twoOneState, boolean threeOneState, boolean oneTwoState, boolean twoTwoState, boolean threeTwoState, boolean oneThreeState, boolean twoThreeState, boolean threeThreeState, Label labelOneOne, Label labelTwoOne, Label labelThreeOne, Label labelOneTwo, Label labelTwoTwo, Label labelThreeTwo, Label labelOneThree, Label labelTwoThree, Label labelThreeThree)
    {
        this.oneOneState = oneOneState;this.twoOneState = twoOneState;this.threeOneState = threeOneState;this.oneTwoState = oneTwoState;this.twoTwoState = twoTwoState;this.threeTwoState = threeTwoState;this.oneThreeState = oneThreeState;this.twoThreeState = twoThreeState;this.threeThreeState = threeThreeState;
        this.labelOneOne = labelOneOne;this.labelTwoOne = labelTwoOne;this.labelThreeOne = labelThreeOne;this.labelOneTwo = labelOneTwo;this.labelTwoTwo = labelTwoTwo;this.labelThreeTwo = labelThreeTwo;this.labelOneThree = labelOneThree;this.labelTwoThree = labelTwoThree;this.labelThreeThree = labelThreeThree;
        // this calls the method to update the game
        updateLogic();
    }
    public void updateLogic()
    {

    }
    public boolean gameEnded()
    // this method checks if someone won or not
    {
        System.out.println(oneThreeState + "  " + twoThreeState + "  " + threeThreeState);
        if(oneOneState)
        {
            if(labelOneOne.getText().equals(" X "))
            {
                if(labelOneTwo.getText().equals(" X ") && labelOneThree.getText().equals(" X ") || labelTwoOne.getText().equals(" X ") && labelThreeOne.getText().equals(" X ") || labelTwoTwo.getText().equals(" X ") && labelThreeThree.getText().equals(" X "))
                    return true;
            }
            else if(labelOneOne.getText().equals(" O "))
            {
                if(labelOneTwo.getText().equals(" O ") && labelOneThree.getText().equals(" O ") || labelTwoOne.getText().equals(" O ") && labelThreeOne.getText().equals(" O ") || labelTwoTwo.getText().equals(" O ") && labelThreeThree.getText().equals(" O "))
                    return true;
            }
        }
        if(twoOneState)
        {
            if(labelTwoOne.getText().equals(" X "))
            {
                if(labelOneOne.getText().equals(" X ") && labelThreeOne.getText().equals(" X ") || labelTwoTwo.getText().equals(" X ") && labelTwoThree.getText().equals(" X "))
                    return true;
            }
            else if(labelTwoOne.getText().equals(" O "))
            {
                if(labelOneOne.getText().equals(" O ") && labelThreeOne.getText().equals(" O ") || labelTwoTwo.getText().equals(" O ") && labelTwoThree.getText().equals(" O "))
                    return true;
            }
        }
        if(threeOneState)
        {
            if(labelThreeOne.getText().equals(" X "))
            {
                if(labelThreeTwo.getText().equals(" X ") && labelThreeThree.getText().equals(" X ") || labelTwoOne.getText().equals(" X ") && labelOneOne.getText().equals(" X ") || labelTwoTwo.getText().equals(" X ") && labelOneThree.getText().equals(" X "))
                    return true;
            }
            else if(labelThreeTwo.getText().equals(" O "))
            {
                if(labelThreeTwo.getText().equals(" O ") && labelThreeThree.getText().equals(" O ") || labelTwoOne.getText().equals(" O ") && labelOneOne.getText().equals(" O ") || labelTwoTwo.getText().equals(" O ") && labelOneThree.getText().equals(" O "))
                    return true;
            }
        }
        if(oneTwoState)
        {
            if(labelOneTwo.getText().equals(" X "))
            {
                if(labelOneOne.getText().equals(" X ") && labelOneThree.getText().equals(" X ") || labelTwoTwo.getText().equals(" X ") && labelThreeTwo.getText().equals(" X "))
                    return true;
            }
            else if(labelOneTwo.getText().equals(" O "))
            {
                if(labelOneOne.getText().equals(" O ") && labelOneThree.getText().equals(" O ") || labelTwoTwo.getText().equals(" O ") && labelThreeTwo.getText().equals(" O "))
                    return true;
            }
        }
        if(twoTwoState)
        {
            if(labelTwoTwo.getText().equals(" X "))
            {
                if(labelOneTwo.getText().equals(" X ") && labelThreeTwo.getText().equals(" X ") || labelTwoOne.getText().equals(" X ") && labelTwoThree.getText().equals(" X ") || labelOneOne.getText().equals(" X ") && labelThreeThree.getText().equals(" X ") || labelThreeOne.getText().equals(" X ") && labelOneThree.getText().equals(" X "))
                    return true;
            }
            else if(labelTwoTwo.getText().equals(" O "))
            {
                if(labelOneTwo.getText().equals(" O ") && labelThreeTwo.getText().equals(" O ") || labelTwoOne.getText().equals(" O ") && labelTwoThree.getText().equals(" O ") || labelOneOne.getText().equals(" O ") && labelThreeThree.getText().equals(" O ") || labelThreeOne.getText().equals(" O ") && labelOneThree.getText().equals(" O "))
                    return true;
            }
        }
        if(threeTwoState)
        {
            if(labelThreeTwo.getText().equals(" X "))
            {
                if(labelThreeOne.getText().equals(" X ") && labelThreeThree.getText().equals(" X ") || labelTwoTwo.getText().equals(" X ") && labelOneTwo.getText().equals(" X "))
                    return true;
            }
            else if(labelThreeTwo.getText().equals(" O "))
            {
                if(labelThreeOne.getText().equals(" O ") && labelThreeThree.getText().equals(" O ") || labelTwoTwo.getText().equals(" O ") && labelOneTwo.getText().equals(" O "))
                    return true;
            }
        }
        System.out.println("WE Made it");
        if(oneThreeState)
        {
            System.out.println("ONETHREE");
            if(labelOneThree.getText().equals(" X "))
            {
                if(labelOneTwo.getText().equals(" X ") && labelOneOne.getText().equals(" X ") || labelTwoThree.getText().equals(" X ") && labelThreeThree.getText().equals(" X ") || labelTwoTwo.getText().equals(" X ") && labelThreeOne.getText().equals(" X "))
                    return true;
            }
            else if(labelOneThree.getText().equals(" O "))
            {
                if(labelOneTwo.getText().equals(" O ") && labelOneOne.getText().equals(" O ") || labelTwoThree.getText().equals(" O ") && labelThreeThree.getText().equals(" O ") || labelTwoTwo.getText().equals(" O ") && labelThreeOne.getText().equals(" O "))
                    return true;
            }
        }
        if(twoThreeState)
        {
            System.out.println("TWOTHREE");
            if(labelTwoThree.getText().equals(" X "))
            {
                if(labelTwoTwo.getText().equals(" X ") && labelTwoOne.getText().equals(" X ") || labelOneThree.getText().equals(" X ") && labelThreeThree.getText().equals(" X "))

                    return true;
            }
            else if(labelTwoThree.getText().equals(" O "))
            {
                if(labelTwoTwo.getText().equals(" O ") && labelTwoOne.getText().equals(" O ") || labelOneThree.getText().equals(" O ") && labelThreeThree.getText().equals(" O "))
                    return true;
            }
        }
        if(threeThreeState)
        {
            System.out.println("THREETHREE");
            if(labelThreeThree.getText().equals(" X "))
            {
                if(labelOneThree.getText().equals(" X ") && labelTwoThree.getText().equals(" X ") || labelThreeOne.getText().equals(" X ") && labelThreeTwo.getText().equals(" X ") || labelTwoTwo.getText().equals(" X ") && labelOneOne.getText().equals(" X "))

                    return true;
            }
            else if(labelThreeThree.getText().equals(" O "))
            {
                if(labelOneThree.getText().equals(" O ") && labelTwoThree.getText().equals(" O ") || labelThreeOne.getText().equals(" O ") && labelThreeTwo.getText().equals(" O ") || labelTwoTwo.getText().equals(" O ") && labelOneOne.getText().equals(" O "))
                    return true;
            }
        }
        return false;
    }

}
