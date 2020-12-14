package wit.java.homework1;

public class problem2 {
    public static void main(String[] args) {
        int [] a = {100,200,300} ;
        System.out.println(a.length);//输出数组a的长度
        System.out.println(a);//输出数组a的引用
        int b[][]= {{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1} };
        System.out.println(b.length);//输出二维数组b的一维数组的个数
        System.out.println(b[4] [2]) ;
        for(int i=0;i<b.length;i++){
            System.out.print(b[i].length+"\t"+b[i]+"\t");
        }
        System.out.println();
        b[4]=a;//将数组a的引用赋给b[4]
        for(int i=0;i<b.length;i++){
            System.out.print(b[i].length+"\t"+b[i]+"\t");
        }
        System.out.println();
        System. out.println(b[4] [2]) ;
    }
}
