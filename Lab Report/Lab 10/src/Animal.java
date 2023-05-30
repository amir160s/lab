public class Animal {
    public int lagsandhands,tooth;
    public String name,country;

    public Animal(int legs,int tooth,String name,String country)
    {
        this.lagsandhands=legs;
        this.tooth=tooth;
        this.name=name;
        this.country=country;
    }
    public void walk()
    {
        System.out.println("Walking");
    }
    public void eat()
    {
        System.out.println("Eating");
    }
}
