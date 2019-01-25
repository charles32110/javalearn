
/*
do while
while true
 */



public class learn7 {
    public static void main(String[] args){
        /*
        while (true){
            System.out.println("this is a still line");
        }
        for(;;){
            System.out.println("for a new still line");
        }

        for  line
        for (int i=0; i<=4;i++){
            System.out.println("*****");
        }
        for (int o=0;o<=5;o++){
            for (int l = 0;l<=o;l++){
                System.out.print("*");
            }
            System.out.println(' ');
        }*/

        for(int i= 1;i<=9;i++){//9*9 line
            for(int o=1;o<=i;o++){
                System.out.print(i+"*"+o+"="+(i*o)+' ');
            }
            System.out.print("\n");
        }
    }
}
