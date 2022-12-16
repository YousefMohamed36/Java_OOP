public class Circle
{
    public double radius;
    public void  setRadius(double radius)
    {
     this.radius = radius;
    }
    public double getArea(){
        return Math.PI* radius * radius;
    }
    public double getCircum(){
        return 2*Math.PI*radius;
    }

}
