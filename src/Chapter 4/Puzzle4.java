public class Puzzle4 {

    public static void main(String[] args) {
        // #1
        Puzzle4b[] obs = new Puzzle4b[6];


        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            // #2
            obs[x] = new Puzzle4b();

            // #3
            obs[x].ivar = y;

            y = y * 10;
            x = x + 1;  // #4

        }
        x = 6;
        while (x > 0) {
            x = x -1; // #5
            result = result + obs[x].doStuff(x); // #6
        }
        System.out.println("result " + result);
    }
}
class Puzzle4b { // #7
    int ivar;

    public int doStuff(int factor) { // #8 // #9 //#10
        if (ivar > 100) {
            return ivar * factor; // #11
        } else {
            return ivar * (5 - factor); // #12
        }
    }
}


// result 543345

