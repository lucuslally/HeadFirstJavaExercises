class MultiFor { // #4
    public static void main(String[] args) { // #7
        for (int x = 0; x < 4; x++) { // #6
            for (int y = 4; y > 2; y--) { // #5
                System.out.println(x + " " + y); // #3
            }
                if (x == 1) { // #2
                    x++; // #1

            }
        }
    }
}

/*
0 4
0 3
1 4
1 3
3 4
3 3
*/