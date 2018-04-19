public class WeekCounter {
    public static void main(String[] args){
        Day one = new Day();
        one.dayName = "Monday";
        one.dayNum = 1;
        one.determineSuffix();
        System.out.println("It's " + one.dayName + ", The " + one.dayNum + one.suffix + " day of the week");

        Day two = new Day();
        two.dayName = "Tuesday";
        two.dayNum = 2;
        two.determineSuffix();
        System.out.println("It's " + two.dayName + ", The " + two.dayNum + two.suffix + " day of the week");

        Day three = new Day();
        three.dayName = "Wednesday";
        three.dayNum = 3;
        three.determineSuffix();
        System.out.println("It's " + three.dayName + ", The " + three.dayNum + three.suffix + " day of the week");

        Day four = new Day();
        four.dayName = "Thursday";
        four.dayNum = 4;
        four.determineSuffix();
        System.out.println("It's " + four.dayName + ", The " + four.dayNum + four.suffix + " day of the week");

        Day five = new Day();
        five.dayName = "Friday";
        five.dayNum = 5;
        five.determineSuffix();
        System.out.println("It's " + five.dayName + ", The " + five.dayNum + five.suffix + " day of the week");

        Day six = new Day();
        six.dayName = "Saturday";
        six.dayNum = 6;
        six.determineSuffix();
        System.out.println("It's " + six.dayName + ", The " + six.dayNum + six.suffix + " day of the week");

        Day seven = new Day();
        seven.dayName = "Sunday";
        seven.dayNum = 7;
        seven.determineSuffix();
        System.out.println("It's " + seven.dayName + ", The " + seven.dayNum + seven.suffix + " day of the week");

    }


}

class Day {
    String dayName;
    int dayNum;
    String suffix;

    void determineSuffix() {
        if (dayNum == 1) {
            suffix = "st";
        }
        else if (dayNum == 2){
            suffix = "nd";
        }
        else if (dayNum == 3){
            suffix = "rd";
        }
        else suffix = "th";
    }

    }


