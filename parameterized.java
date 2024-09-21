class Para {
    double first;
    double second;

    // Constructor for Para class
    Para(int a, int b) {
        this.first = a;
        this.second = b;
    }

    // A method to display the numbers
    public void show() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

// Addition subclass extending Para
class Addition extends Para {
    Addition(int a, int b) {
        super(a, b); // Call the constructor of the superclass (Para)
    }

    public double add() {
        return first + second;
    }
}

// Subtract subclass extending Para
class Subtract extends Para {
    Subtract(int a, int b) {
        super(a, b);
    }

    public double subtract() {
        return first - second;
    }
}

// Multiply subclass extending Para
class Multiply extends Para {
    Multiply(int a, int b) {
        super(a, b);
    }

    public double multiply() {
        return first * second;
    }
}

// Division subclass extending Para
class Division extends Para {
    Division(int a, int b) {
        super(a, b);
    }

    public double divide() {
        return first / second;
    }
}

public class parameterized {
    public static void main(String[] args) {
        // Creating an object of the Addition class
        Addition add = new Addition(10, 20);
        add.show();  // Display values
        System.out.println("Sum: " + add.add());

        // Creating an object of the Subtract class
        Subtract sub = new Subtract(20, 10);
        sub.show();  // Display values
        System.out.println("Difference: " + sub.subtract());
    }
}
