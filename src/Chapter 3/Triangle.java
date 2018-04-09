/*
output
triangle 0, area = 4.0
triangle 1, area = 10.0
triangle 2, area = 18.0
triangle 3, area = BONUS
y = BONUS

 */


class Triangle {
    // declare primitive variables
    double area;
    int height;
    int length;
    public static void main(String[] args){
        // declare & create array of Triangles named ta
        Triangle[] ta = new Triangle[4];  // #1

        // declare primitive variable
        int x = 0; // #2

        // iterate 5 times
        while (x < 4){ // #3

            // create new Triangle object for every iteration (three in total)
            ta[x] = new Triangle();// #4

            // assign values to each Triangle object for height and length
            ta[x].height = (x + 1) * 2; // #5
            ta[x].length = x + 4; // #6

            // call the method with the formula to setArea for every Triangle object
            ta[x].setArea(); // #7

            // printout results
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area); // #8

            // iterate through the loop
            x = x + 1;// #9
        }

        // y needs a value
        int y = x;// #10
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
        }

        void setArea(){
        // assign a primitiive double
        area = (height * length) / 2; //#11
        }
}
