package wit.java.experiment2;
class Bank {
    int savedMoney;
    int year;
    double interest;
    double interestRate = 0.29;
    public double computerInterest() {
        interest=year*interestRate*savedMoney;
        return interest;
    }
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
}
class ConstructionBank extends Bank {
    double year;
    public double computerInterest() {
        super.year=(int)year;
        double r = year-(int)year;
        int day=(int)(r*1000);
        double yearInterest =super.computerInterest();  //【代码1】super调用隐藏的computerInterest()方法
        double dayInterest = day*0.0001*savedMoney;
        interest= yearInterest+dayInterest;
        System.out.printf("%d元存在建设银行%d年零%d天的利息:%f元\n",
                savedMoney,super.year,day,interest);
        return interest;
    }
}
class BankOfDalian extends Bank {
    double year;
    public double computerInterest() {
        super.year=(int)year;
        double r = year-(int)year;
        int day=(int)(r*1000);
        double yearInterest =super.computerInterest(); //【代码2】 super调用隐藏的computerInterest()方法
        double dayInterest = day*0.00012*savedMoney;
        interest= yearInterest+dayInterest;
        System.out.printf("%d元存在大连银行%d年零%d天的利息:%f元\n",
                savedMoney,super.year,day,interest);
        return interest;
    }
}

public class problem5 {

}
