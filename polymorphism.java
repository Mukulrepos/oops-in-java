class a {
//got some error when we use it the final keyword can give the error in overridding method
    public int add(int a, int b) {
        return (a + b);

    }

    public String add(String a, String b) {
        // System.out.println("add of string is " +(a + b));
        return (a + b);

    }

}

class b extends a {
    public double add(double a, double b) {
        return (a + b);

    }
///method overriding method is used to over rride the suppercalss method 
    @Override
    public int add(int a, int b) {
        return (a + b + 10);

    }
}

public class polymorphism {
    public static void main(String[] args) {
        a cals = new a();
        System.out.println("add frist method =>" + cals.add(10, 10));
        b cal = new b();
        System.out.println("overrided method is used =>" + (cal.add(10, 10)));
        System.out.println("Double data type is used " + (cal.add(99.98, 0.02)));
        System.out.println("addion used for string" + (cal.add("mukul", "vats")));

    }

}
