/* output =
helloooo...
helloooo...
helloooo...
helloooo...
10
 */


public class EchoTestDrive {
    public static void main (String[] args){
        Echo e1 = new Echo();
        Echo e2 = e1; //#1

        int x = 0;
        while (x < 4) { //#2
            e1.hello();
            e1.count = e1.count + 1; //#3
            if (x > 0) {//#4
                e2.count = e2.count + 1;

            }
            if (x > 1) {//#5
                e2.count = e2.count + e1.count;

            }
            x = x + 1;
        }
        System.out.println(e2.count);
        }
    }

class Echo {//#6
    int count = 0; //#7
        void hello(){ //#8
            System.out.println("helloooo...");
        }
}
