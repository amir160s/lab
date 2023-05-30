public class Circle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw a circle");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Erase the circle");
    }
}
