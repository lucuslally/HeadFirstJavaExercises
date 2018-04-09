class TapeDeck {
    boolean canRecord = false;

     void playTape() {
        System.out.println("tape playing");
    }//method

    void recordTape(){
        System.out.println("tape recording");
    }//method
}//class

public class TapeDeckTestDrive {
    public static void main (String[] args) {
        TapeDeck t = new TapeDeck();

        t.canRecord=true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }//if
    }//method
}//class
