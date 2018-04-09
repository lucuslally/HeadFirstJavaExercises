/* output = DrumKitTestDrive
bang bang ba-bang
ding ding da ding
*/

class DrumKit { //#10
    boolean topHat = true; // #3
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang ba-bang"); // #4
    }
    void playTopHat() {
        System.out.println("ding ding da-ding"); //#11
    }

}

class DrumKitTestDrive {  // #8
    public static void main (String[] args){ // #5
        DrumKit d = new DrumKit(); // #2
        d.playSnare(); // #1
        d.snare = false; // #7
        if (d.snare == true) { // #6
            d.playSnare();
        }
        d.playTopHat(); // #9

    }


}



















