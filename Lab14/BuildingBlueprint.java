package Lab14;
public class BuildingBlueprint {

    //Variables
    private int floors;
    private int numApartments;
    private float occupancy;
    private boolean full;

    //Constructor
    public BuildingBlueprint() {
        floors = 10;
        numApartments = 20;
        occupancy = 1.0f;
        full = true;
    }

    //Overloaded constructor
    public BuildingBlueprint(int floors, int numApartments, float occupancy)
    {
        this.floors = floors;
        this.numApartments = numApartments;
        this.occupancy = occupancy;
        if (occupancy ==1.0) {
            this.full =  true;
        } else {
            this.full = false;
        }
    }

    //Methods
    public int getFloors(){
        return this.floors;
    }

    public int getNumApartments(){
        return this.numApartments;
    }

    public boolean full() {
        return this.full;
    }

    public float getOccupancy(){
        return this.occupancy;
    }

    public void setOccupancy(float occupancy) {
        this.occupancy = occupancy;
        if (occupancy ==1.0) {
            this.full =  true;}
        else {
            this.full = false;
        }
    }
}
