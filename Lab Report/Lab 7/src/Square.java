public class Square extends Shape{

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw a square");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Erase the square");
    }
}
