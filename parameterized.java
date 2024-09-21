class para{
    double frist;
    double second;
    para(int a , int b ){
        // System.out.println("addition is "+(a+b));
        this.frist=a;
        this.second=b;
    }
    public void show (){
        System.out.println("addition is "+(frist+second));
    }
}


public class parameterized {
    public static void main(String[] args) {
        para add = new para(10,20);
        add.show();
    }
}


