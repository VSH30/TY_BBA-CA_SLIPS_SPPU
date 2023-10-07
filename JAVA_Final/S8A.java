public class S8A{
    public static void main(String[] args) {
        Circle circ = new Circle();
        System.out.println("Area of Circle = "+circ.area());
        Square sq = new Square();
        System.out.println("Area of Square = "+sq.area());
    }
}
interface Shape{
    float area();
}
class Circle implements Shape{
    final float PI = 3.14f;
    int r = 10;
    public float area(){
        return PI*r*r;
    }
}
class Square implements Shape{
    int s = 5;
    public float area(){
        return s*s;
    }
}