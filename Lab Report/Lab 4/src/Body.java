public class Body extends Super {
        public int a;
        public Body(int a, int b)
        {
            super(b);
            this.a=a;
        }
        public void display()
        {
            System.out.println("A = "+a+"\n"+"B = "+super.b);
        }

}
