public class S3B {
    public static void main(String[] args) {
        Cone c = new Cone();
        System.out.println("Area of Cone = "+c.area());
        System.out.println("Volume of Cone = "+c.volume());
        Cylinder cyl = new Cylinder();
        System.out.println("Area of Cylinder = "+cyl.area());
        System.out.println("Volume of Cylinder = "+cyl.volume());
    }
}
abstract class Shape {
    float pi = 22/7;
    abstract float area();
    abstract float volume();
}
class Cone extends Shape {
    int r = 7;
    int l = 10;
    float area(){
        return ((super.pi)*r*(r+l));
    }
    float volume(){
        return ((1/3)*(super.pi)*r*r*l);
    }
}
class Cylinder extends Shape {
    int r = 8;
    int h = 11;
    float area(){
        return (2*(super.pi)*r*(r+h));
    }
    float volume(){
        return ((super.pi)*r*r*h);
    }
}
