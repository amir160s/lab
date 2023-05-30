public class Men_Women extends Animal implements Man {

    public Men_Women(int legs, int tooth, String name, String country) {
        super(legs, tooth, name, country);
        super.walk();
        super.eat();
    }

    @Override
    public void work() {
        System.out.println("They Working");
    }
}
