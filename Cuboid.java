public class Cuboid extends Rectangle {

    private double height;

    // == Constructor ==
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    // == Getters ==
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    // == Equals and HashCode ==
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Cuboid cuboid = (Cuboid) obj;
        return Double.compare(cuboid.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), height);
    }

    // == ToString Method ==
    @Override
    public String toString() {
        return String.format("Cuboid [Width: %.2f, Length: %.2f, Height: %.2f, Volume: %.2f]",
                getWidth(), getLength(), height, getVolume());
    }

    // == Main Method for Testing ==
    public static void main(String[] args) {

        // ✅ Valid inputs
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        Cuboid cuboid = new Cuboid(5.0, 10.0, 15.0);

        System.out.println("Valid Inputs:");
        System.out.println(rectangle);
        System.out.println(cuboid);

        // ❌ Invalid inputs
        Rectangle invalidRectangle = new Rectangle(-3.0, 7.0);
        Cuboid invalidCuboid = new Cuboid(5.0, 10.0, -8.0);

        System.out.println("\nInvalid Inputs:");
        System.out.println(invalidRectangle);
        System.out.println(invalidCuboid);

        // 🔥 Equality check
        System.out.println("\nEquality Check:");
        System.out.println("rectangle equals invalidRectangle: " + rectangle.equals(invalidRectangle));
        System.out.println("cuboid equals invalidCuboid: " + cuboid.equals(invalidCuboid));

        // 🔥 Hash codes
        System.out.println("\nHash Codes:");
        System.out.println("rectangle hashCode: " + rectangle.hashCode());
        System.out.println("cuboid hashCode: " + cuboid.hashCode());
    }
}
