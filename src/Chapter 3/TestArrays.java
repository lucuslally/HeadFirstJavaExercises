/*
output
island = Fiji
island = Cozumel
island = Bermuda
island = Azores
 */

class TestArrays {
    public static void main (String[] args){ // #1

        // declare array of Strings named islands
        String[] islands = new String[4]; // #8

        // declare array of integers named index
        int[] index = new int[4]; // #10

        // declare primitive variable int named y
        int y = 0; // #2

        // give islands array values
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel"; // #4

        // give index array values
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2; // #7

        // declare primitive variable int named ref
        int ref;
        while (y < 4){ // #5
            ref = index[y]; // #3
            System.out.print("island = "); // #9
            System.out.println(islands[ref]); // #6

            y = y + 1; // #11
        }

    }
}












