package wit.java.experiment2;

import javax.swing.plaf.SplitPaneUI;

class Vehicle {
    double speed;//【代码1】声明double型变量speed,刻画速度
    int power;        //【代码2】声明int型变量power,刻画功率

    void speedUp(int s) {
        speed = speed + s;  //【代码3】将参数s的值与成员变量speed的和赋值给成员变量speed
        if (speed >= 200) {
            speed = 200;
        }
    }

    void speedDown(int d) {
        speed = speed - d;     //【代码4】将成员变量speed与参数d的差赋值给成员变量speed
        if (speed < 0) {
            speed = 0;
        }
    }

    void brake() {
        speed = 0;
    }

    void setPower(int p) {
        power = p;          //【代码5】将参数p的值赋值给成员变量power
    }

    int getPower() {
        return power;     //【代码6】返回成员变量power的值
    }

    double getSpeed() {
        return speed;
    }
}
public class problem1{
    public static void main(String[] args) {
        Vehicle car1,car2;
       car1=new Vehicle();//【代码7】使用new 运算符和默认的构造方法创建对象car1
       car2=new Vehicle();//【代码8】使用new 运算符和默认的构造方法创建对象car2
       car1.speedUp(80);//【代码9】 car1调用speedUp方法将自己的speed的值增加80
       car2.speedUp(250);//【代码10】car2调用speedUp方法将自己的speed的值增加80
        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
        car1.speedDown(70);
        car2.speedDown(280);
        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
    }
}