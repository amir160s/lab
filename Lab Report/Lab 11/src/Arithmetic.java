public class Arithmetic implements Test{
    int a,area;
    public Arithmetic(int a)
    {
        this.a=a;
    }
    @Override
    public void square() {
        area=a*a;
        System.out.println("Area : "+area);
    }
}
