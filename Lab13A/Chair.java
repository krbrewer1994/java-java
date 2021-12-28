package Lab13A;

public class Chair {

    //Class variables
    public int numOfLegs; //how many legs does the chair have?
    public boolean roll; //Does the chair roll?
    public String material;  //What is the chair made out of?

    //Constructor
    Chair(int numOfLegs, String material, boolean roll) {
        this.numOfLegs = numOfLegs;
        this.material = material;
        this.roll = roll;
    }
}



