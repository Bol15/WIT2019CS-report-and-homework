package wit.java.homework4;

import java.util.Stack;

public class problem1 {
    public static void main(String args[]) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(3);
        s.push(8);
        int temp=0;
        for(int i=0;i<10;i++){
            temp=2*(s.get(s.size()-1)+s.get(s.size()-2));
            s.push(temp);
            System.out.println(temp);
        }
    }
}
