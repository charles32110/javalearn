/*
break
continue
 */


public class learn8 {
    public static void main(String[] args){
        for(int i = 1;i < 10;i++){
            /*
            if (i % 3 == 0){
                System.out.println("I still like python");
                break;
            }*/
            if (i % 3 == 0) {
                System.out.println("I still like python");
                continue;//jump out of the circulation and continue to the next terminal
            }
            System.out.println("hello java");

        }

    }
}
