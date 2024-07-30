public class Square implements Shape {
    double legLength;


    public Square() {}

    public Square(double legLength) {
        this.legLength = legLength;
    }
    public double getLength() {
        return legLength;
    }
    public void setLength(double legLength) {
        this.legLength = legLength;
    }

    public void draw() {
        System.out.println("Drawing Square");
    }
}