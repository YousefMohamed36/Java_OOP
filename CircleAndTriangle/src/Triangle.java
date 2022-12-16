public class Triangle {
     double x,y,z;
     double h,b;
    public void setH_B(double h,double b)
    {
        this.h = h;
        this.b = b;
    }
    public void setX_Y_Z(double x, double y ,double z)
    {
      this.x = x;
      this.y = y;
      this.z = z;
    }
    public double getAreaTriangle(){
        return 0.5*h*b;
    }
    public double getCircumTriangle(){
        return x+y+z;
    }
}
