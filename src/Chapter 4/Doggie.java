public class Doggie {
    int size;

    @SuppressWarnings("SpellCheckingInspection")
    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

@SuppressWarnings("SpellCheckingInspection")
class DoggieTestDrive {
    public static void main (String[] args){
        Doggie one = new Doggie();
        one.size = 70;
        Doggie two = new Doggie();
        two.size = 8;
        Doggie three = new Doggie();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }

}
