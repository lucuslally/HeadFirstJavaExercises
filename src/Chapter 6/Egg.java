import java.util.ArrayList;

public class Egg {
    public static void main(String[] args){
        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg s = new Egg();
        myList.add(s);

        Egg b = new Egg();
        myList.add(b);

        int theSize = myList.size();
        System.out.println(theSize);

        boolean isIn = myList.contains(s);
        System.out.println(isIn);

        int idx = myList.indexOf(b);
        System.out.println(idx);

        myList.remove(b);
        myList.remove(s);

        boolean empty = myList.isEmpty();

        System.out.println(empty);
    }
}
