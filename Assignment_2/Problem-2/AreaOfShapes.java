

public class AreaOfShapes {
    public void getAreaOfRectangle(float l,float w){
        float area=l*w;
        System.out.println("The Area Of Rectangle is:"+area);
    }

    public void getAreaOfSquare(float side){
        float area=side*side;
        System.out.println("The Area Of Square is:"+area);
    }

    public void getAreaOfTriangle(double b,double h){
        double area=0.5*b*h;
        System.out.println("The Area Of Rectangle is:"+area);
    }

    public void getAreaOfRhombus(double d1,double d2){
        double area=0.5*(d1*d2);
        System.out.println("The Area Of Rectangle is:"+area);
    }

    public void getAreaOfCircle(double PI,double r){
        double area=PI*r*r;
        System.out.println("The Area Of Circle is:"+area);
    }
}
