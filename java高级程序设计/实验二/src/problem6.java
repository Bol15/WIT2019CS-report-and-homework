package wit.java.experiment2;
abstract class Employee {
    public abstract double earnings();
}
class YearWorker extends Employee {
    @Override
    public double earnings() {
        return 12000;
    }
    //【代码1】重写earnings()方法
}
class MonthWorker extends Employee {
    @Override
    public double earnings() {
        return 12*2300;
    } //【代码2】重写earnings()方法
}
class WeekWorker extends Employee {
    @Override
    public double earnings() {
        return 52*780;
    } //【代码3】重写earnings()方法。
}
class DecadeWorker extends Employee{

    @Override
    public double earnings() {
        return 180000*0.1;
    }
}
class Company {
    Employee[] employee;
    double salaries=0;
    Company(Employee[] employee) {
        this.employee=employee;
    }
    public double salariesPay() {
        salaries=0;
        for(int i=0;i<employee.length;i++){
            salaries+=employee[i].earnings();
        }//【代码4】计算salaries。
        return salaries;
    }
}
public class problem6 {
    public static void main(String args[]) {
        Employee [] employee=new Employee[29]; //公司有29名雇员
        for(int i=0;i<employee.length;i++) {   //雇员简单地分成三类
            if(i%4==0)
                employee[i]=new WeekWorker();
            else if(i%4==1)
                employee[i]=new MonthWorker();
            else if(i%4==2)
                employee[i]=new YearWorker();
            else
                employee[i]=new DecadeWorker();
        }
        Company company=new Company(employee);
        System.out.println("公司薪水总额:"+company.salariesPay()+"元");
    }
}

