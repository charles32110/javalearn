/*
compare
 */
import java.util.Scanner;

public class learn3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int a  = scanner.nextInt() ;
        int b  = scanner.nextInt() ;
        int c  = scanner.nextInt() ;
        int max = a > b ? a:b;
        max =  max > c ? max: c;
        System.out.println(max);
    }
}
