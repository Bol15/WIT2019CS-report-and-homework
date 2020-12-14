package wit.java.homework1;

import javax.swing.*;

public class problem4 {
    public static void main(String args[])
    {
        int number=0,d5,d4,d3,d2,d1;
        String str= JOptionPane.showInputDialog("输入一个1至99999之间的数");
        number=Integer.parseInt(str);
        if(number<=99999&&number>=1) //【代码1】判断number在1至99999之间的条件
        {
            d5=number/10000;      //【代码2】计算number的最高位（万位）d5
            d4=number%10000/1000;      //【代码3】计算number的千位d4
            d3=number%1000/100;      //【代码4】计算number的百位d3
            d2=number%100/10;
            d1=number%10;
            if(d5!=0)  //【代码5】判断number是5位数的条件
            {
                System.out.println(number+"is 5 bit");
                if(d1==d5&&d2==d4) //【代码6】判断number是回文数的条件
                {
                    System.out.println(number+"is huiwen number");
                }
                  else
                {
                    System.out.println(number+"不是回文数");
                }
            }
              else if(d4!=0)  //【代码7】判断number是4位数的条件
            {
                System.out.println(number+"is 4 bit");
                if(d1==d4&&d2==d3) //【代码8】判断number是回文数的条件码
                {
                    System.out.println(number+"is huiwen number");
                }
                  else
                {
                    System.out.println(number+"不是回文数");
                }
            }
                else if(d3!=0)  //【代码9】判断number是3位数的条件
            {
                System.out.println(number+"is 3 bit");
                if(d1==d3) //【代码10】判断number是回文数的条件
                {
                    System.out.println(number+"is huiwen number");
                }
                  else
                {
                    System.out.println(number+"不是回文数");
                }
            }
             else if(d2!=0)
        {
            System.out.println(number+"is 2 bit");
            if(d1==d2)
            {
                System.out.println(number+"is huiwen number");
            }
            else
            {
                System.out.println(number+"不是回文数");
            }
        }
        else if(d1!=0)
        {
            System.out.println(number+"is 1 bit");
            System.out.println(number+"is huiwen number");
        }
        }
         else
        {
            System.out.printf("\n%d不在1至99999之间",number);
        }
    }
}
