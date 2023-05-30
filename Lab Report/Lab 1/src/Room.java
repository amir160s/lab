public class Room {
    public int roomno;
    public String roomtype;
    public double roomarea;
    public int ACmachine;
    public Room(int rn,String rt, double ra,int AC)
    {
        this.roomno=rn;
        this.roomtype = rt;
        this.roomarea=ra;
        this.ACmachine=AC;
    }
    public void display()
    {
        System.out.println("Room No : "+roomno+"\n"+"Room type : "+roomtype+"\n"+"Room Area : "+ roomarea+ "Square fit"+"\n"+"AC machines  : "+ACmachine);
    }
}
