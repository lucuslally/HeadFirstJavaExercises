class Doggo {
    String name;

    public static void main(String[] args) {
        // make a Doggie object and access it
        Doggo doggo1 = new Doggo();
        doggo1.bark();
        doggo1.name = "Bart";

        // now make a Doggie array
        Doggo[] myDoggos = new Doggo[3];

        // and put some dogs in it
        myDoggos[0] = new Doggo();
        myDoggos[1] = new Doggo();
        myDoggos[2] = doggo1;

        // now access the Dogs using the array
        // references
        myDoggos[0].name = "Fred";
        myDoggos[1].name = "Marge;";

        // Hmmmmm... what is myDogs[2] name?
        System.out.print("last dog's name is ");
        System.out.println(myDoggos[2].name);

        // now loop through the array
        // and tell all the dogs to bark
        int x = 0;
        while (x < myDoggos.length) {
            myDoggos[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public void eat() {

    }

    public void chaseCat() {

    }
}

