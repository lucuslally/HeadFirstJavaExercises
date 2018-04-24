public class SimpleDotComGame {
    public static void main(String[] args){

        // DECLARE an int variable to hold the number of user guesses, named numOfGuesses, set it to 0
        int numOfGuesses = 0;

        GameHelper1 helper = new GameHelper1();

        // MAKE a new SimpleDotCom Class
        SimpleDotCom theDotCom = new SimpleDotCom();

        // COMPUTE a random number between 0 and 4 that will be the starting location cell position
        int randomNum = (int) (Math.random() * 5);

        // MAKE an int array with 3 ints using the randomly-generated number; that number incremented by 1, and that number incremented by 2 (example: 3,4,5)
        int[] locations = {randomNum, randomNum+1, randomNum+2};

        // INVOKE the setLocationCells() method on the SimpleDotCom instance
        theDotCom.setLocationCells(locations);

        // DECLARE a boolean variable representing the state of the game, named is Alive. SET it to true
        boolean isAlive = true;

        /// WHILE the dot com is still alive (isAlive == true)
        while (isAlive){

            // GET user input from the command line
            String guess = helper.getUserInput("enter a number");

            // CHECK the user guess
            // INVOKE the checkYourself() method on the SimpleDotCom instance
            String result = theDotCom.checkYourself(guess);

            // INCREMENT numOfGuesses variable
            numOfGuesses++;

            // CHECK for DotCom death
            // IF result is "kill"
            if (result.equals("kill")){

                // SET isAlive to false (which means we won't enter the loop again)
                isAlive = false;

                // PRINT the number of guesses
                System.out.println("you took " + numOfGuesses + " guesses");
            }  // END IF

        }// END WHILE

    }// END METHOD
}
