public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        c1.setRadius(5);
        System.out.println("the area of circle = "+  c1.getArea());
        System.out.println("the circum of circle = "+ c1.getCircum());
        t1.setH_B(2,4);
        t1.setX_Y_Z(2.5,3,4);
        System.out.println("the area of triangle = "+ t1.getAreaTriangle());
        System.out.println("the circum of triangle  = "+t1.getCircumTriangle());

    }
}