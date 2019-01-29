


/*
questions
 */

public class learn14 {
    public static void main(String[] args){
        int a = 154;
        int b = 82;
        int hour = 1;
        while(true){
            a -=2;
            b -=2;

            if (a ==4*b){
                System.out.println(hour);
            }
            hour +=1;
            if(b<=0){
                break;
            }
        }





    }
}
