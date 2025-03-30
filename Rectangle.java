public class Rectangle {

    private double width;
    private double length;

    // == Constructor ==
    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // == Getters ==
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    // == Equals and HashCode ==
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rect = (Rectangle) obj;
        return Double.compare(rect.width, width) == 0 &&
               Double.compare(rect.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(width, length);
    }

    // == ToString Method ==
    @Override
    public String toString() {
        return String.format("Rectangle [Width: %.2f, Length: %.2f, Area: %.2f]",
                width, length, getArea());
    }
}
