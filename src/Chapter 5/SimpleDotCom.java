class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    void setLocationCells(int[] locs) {
        // ASSIGN the cell locations parameter to the cell locations instance variable
        locationCells = locs;

    }

    public String checkYourself(String stringGuess) {
        // CONVERT users guess to an int
        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        // REPEAT with each of the location cells in the int array
        for (int cell : locationCells) {
            // COMPARE the user guess to the location cell
            if (guess == cell) { // IF the user guesses the matches
                result = "hit";
                numOfHits++; // INCREMENT the number of hits
                break;
            }

        }

        // find out if it was the last location cell
        if (numOfHits == locationCells.length) {  // IF number of hits are 3, return "kill" as the results
            result = "kill";
        }

        System.out.println(result);
        return result;

    }
}
