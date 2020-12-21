package wit.java.homework3;
import  java.util.Scanner;

public  class  fragment2{
    public  static  void  main(String  []  args){
        ExceptionDemo  ed  =  new  ExceptionDemo();
        ed.display();
    }
}
//输入的片段
class DividedException extends Exception{
    DividedException(){
        super("dividedException");
    }
    DividedException(String m){
        super(m);
    }
}
//
class  ExceptionDemo{
    public  void  display(){
        Scanner  sc  =  new  Scanner(System.in);
        int  i  =  sc.nextInt();
        int  j  =  sc.nextInt();
        int  k  =  0;
        try{
            k  =  divide(i,  j);
        }
        catch(DividedException  e){
            System.out.println("Exception  is:  "  +  e);
        }
        finally{
            System.out.println("k  =  "  +  k);
        }
    }
    public  int  divide(int  i,  int  j)throws  DividedException{
        if(j  ==  0){
            throw  new  DividedException("Divided  by  zero");
        }
        return  i/j;
    }
}
