// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3];
        shapes[0] = new Rectangle(2,3);
        shapes[1] = new Circle(4.5);
        shapes[2] = new Rectangle(4,5);
        for (int i = 0; i < shapes.length; i++){
            System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
            System.out.println();
        }

    }
}