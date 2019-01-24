/*
if conditions & else
 */

import java.util.Scanner;


public class learn4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>18){//behind if, (if )you have only one sentence, you could eliminate it. if multi sentences. it must be
            System.out.println("you are an adult");
        }
        else{
            System.out.println("you are a child");
        }
    }
}
