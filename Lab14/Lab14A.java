package Lab14;//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 14A
//The Architect

public class Lab14A {
    public static void main(String[] args) {

        BuildingBlueprint building1 = new BuildingBlueprint();
        BuildingBlueprint building2 = new BuildingBlueprint(30,30,0.75f);

        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + building1.getFloors() + " floors, " + building1.getNumApartments() + " apartments, and is " + (int)(building1.getOccupancy()*100) + "% occupied. Full? " + building1.full());
        System.out.println("Building 2 has " + building2.getFloors() + " floors, " + building2.getNumApartments() + " apartments, and is " + (int)(building2.getOccupancy() *100) + "% occupied. Full? " + building2.full());

        building1.setOccupancy(0.0f);
        building2.setOccupancy(1.0f);

        System.out.println("\nMany years pass.\n");

        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + building1.getFloors() + " floors, " + building1.getNumApartments() + " apartments, and is " + (int)(building1.getOccupancy() * 100) + "% occupied. Full? " + building1.full());
        System.out.println("Building 2 has " + building1.getFloors() + " floors, " + building2.getNumApartments() + " apartments, and is " + (int)(building2.getOccupancy() * 100) + "% occupied. Full? " + building2.full());

        System.out.println("\nLooks like people prefer taller buildings.");
    }
}
