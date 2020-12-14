package wit.java.experiment2;
class Village {
    static int waterAmount;   //模拟水井的水量
    int peopleNumber;        //村庄的人数
    String name;            //村庄的名字
    Village(String s) {
        name = s;
    }
    static void setWaterAmount(int m) {
        if(m>0)
            waterAmount = m;
    }
    void drinkWater(int n){
        if( waterAmount-n>=0) {
            waterAmount = waterAmount-n;
            System.out.println(name+"喝了"+n+"升水");
        }
        else
            waterAmount = 0;
    }
    static int lookWaterAmount() {
        return waterAmount;
    }
    void setPeopleNumber(int n) {
        peopleNumber = n;
    }
    int getPeopleNumber() {
        return peopleNumber;
    }
}
public class problem3 {
    public static void main(String args[]) {
        Village.setWaterAmount(200);//【代码1】用类名调用setWaterAmount(int m),并向参数传值200
        int leftWater = Village.waterAmount;//【代码2】用Village类的类名访问waterAmount
        System.out.println("水井中有 "+leftWater+" 升水");
        Village zhaoZhuang,maJiaHeZhi;
        zhaoZhuang = new Village("赵庄");
        maJiaHeZhi = new Village("马家河子");
        zhaoZhuang.setPeopleNumber(80);
        maJiaHeZhi.setPeopleNumber(120);
        zhaoZhuang.drinkWater(50);//【代码3】zhaoZhuang调用drinkWater(int n),并向参数传值50
        leftWater = maJiaHeZhi.lookWaterAmount();//【代码4】maJiaHeZhi调用lookWaterAmount()方法
        String name=maJiaHeZhi.name;
        System.out.println(name+"发现水井中有 "+leftWater+" 升水");
        maJiaHeZhi.drinkWater(100);
        leftWater =zhaoZhuang.lookWaterAmount(); //【代码5】zhaoZhuang调用lookWaterAmount()方法
        name=zhaoZhuang.name;
        System.out.println(name+"发现水井中有 "+leftWater+" 升水");
        int peopleNumber = zhaoZhuang.getPeopleNumber();
        System.out.println("赵庄的人口:"+peopleNumber);
        peopleNumber = maJiaHeZhi.getPeopleNumber();
        System.out.println("马家河子的人口:"+peopleNumber);
    }
}
