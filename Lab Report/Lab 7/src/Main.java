public class Main {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();
        c.erase();
        System.out.println("\n");
        Triangle t= new Triangle();
        t.draw();
        t.erase();
        System.out.println("\n");
        Square s= new Square();
        s.draw();
        s.erase();
    }
}