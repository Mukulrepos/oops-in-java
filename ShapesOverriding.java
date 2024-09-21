class Shapes {
    // double result = 0;

    // Method to calculate surface area
    public void cuboidSurfaceArea(double length, double breadth, double height) {
        double surfaceArea = 2 * ((length * breadth) + (breadth * height) + (height * length));
        System.out.println("Surface area is: " + surfaceArea);
    }

    // Method to calculate volume
    public void cuboidVolume(double length, double breadth, double height) {
        double volume = length * breadth * height;
        System.out.println("Volume is: " + volume);
    }
}

public class ShapesOverriding {
    public static void main(String[] args) {
        Shapes cuboid = new Shapes();

        // Calculate surface area
        cuboid.cuboidSurfaceArea(5, 3, 4);

        // Calculate volume
        cuboid.cuboidVolume(5, 3, 4);
    }
}
