package wit.java.homework3;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='9'&&s.charAt(i)>='0')
                System.out.print(s.charAt(i));
        }
    }
}
