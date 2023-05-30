public class Triangle extends Shape{

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw a triangle");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Erase the triangle");
    }
}
