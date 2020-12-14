package wit.java.experiment2;

class TV {
    int channel;   //电视频道
    void setChannel(int m) {
        if(m>=1){
            channel=m;
        }
    }
    int getChannel(){
        return channel;
    }
    void showProgram(){
        switch(channel) {
            case 1 : System.out.println("综合频道");
                break;
            case 2 : System.out.println("经济频道");
                break;
            case 3 : System.out.println("文艺频道");
                break;
            case 4 : System.out.println("国际频道");
                break;
            case 5 : System.out.println("体育频道");
                break;
            default : System.out.println("不能收看"+channel+"频道");
        }
    }
}
class Family {
    TV homeTV;
    void buyTV(TV tv) {
        homeTV=tv;//【代码1】将参数tv赋值给homeTV
    }
    void remoteControl(int m) {
        homeTV.setChannel(m);
    }
    void seeTV() {
        homeTV.showProgram();  //homeTV调用showProgram()方法
    }
}
public class problem2 {
    public static void main(String args[]) {
        TV haierTV = new TV();
//        haierTV.setChannel(5);//【代码2】haierTV调用setChannel(int m),并向参数m传递5
        System.out.println("haierTV的频道是"+haierTV.getChannel());
        Family zhangSanFamily = new Family();
        zhangSanFamily.buyTV(haierTV);//【代码3】zhangSanFamily调用void buyTV(TV tv)方法,并将haierTV传递给参数TV
        System.out.println("zhangSanFamily开始看电视节目");
        zhangSanFamily.seeTV();
        int m=2;
        System.out.println("hangSanFamily将电视更换到"+m+"频道");
        zhangSanFamily.remoteControl(m);
        System.out.println("haierTV的频道是"+haierTV.getChannel());
        System.out.println("hangSanFamily再看电视节目");
        zhangSanFamily.seeTV();
    }
}
