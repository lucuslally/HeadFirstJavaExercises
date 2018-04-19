public class WeekCounter2 {
    public static void main(String[] args){

        // declare and create new Day object array with 7 objects
        Week[] w = new Week[7];

        // instantiate seven objects in array
        w[0] = new Week();
        w[1] = new Week();
        w[2] = new Week();
        w[3] = new Week();
        w[4] = new Week();
        w[5] = new Week();
        w[6] = new Week();

        int x = 0;
        // iterate 7 times
        while (x < 7){

            // new variable for current Name as the loop cycles
            String currentDayName = w[x].dayName[x];

            // new variable for current Number as the loop cycles
            int currentDayNum = w[x].dayNum + 1;

            // determine suffix
            w[x].determineSuffix(currentDayNum);

            // printout results and cycle through Name String Array
            System.out.println("It's " + currentDayName + ", The " + currentDayNum + w[x].suffix + " day of the week");

            x = x +1;
        }
    }
}

class Week {
    String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
    int dayNum;
    String suffix;

    void determineSuffix(int currentDayNum) {
        if (currentDayNum == 1) {
            suffix = "st";
        }
        else if (currentDayNum == 2){
            suffix = "nd";
        }
        else if (currentDayNum == 3){
            suffix = "rd";
        }
        else suffix = "th";
    }
}


