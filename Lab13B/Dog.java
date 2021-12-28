package Lab13B;

public class Dog {

    //Variables
    public int age; //What is the dog's age?
    public double weight;//How much does the dog weigh?
    public String name;//What is is the dog's name?
    public String furColor;//What is the dog's fur color?
    public String breed; //What breed of dog is it?


    //Methods
    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public String getName()
    {
        return this.name;
    }

    public String getFurColor()
    {
        return this.furColor;
    }

    public String getBreed()
    {
        return this.breed;
    }

    //Behavior Methods
    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void rename(String newName){
        name = newName;
    }

    public void eat(double addWeight){
        weight = weight + addWeight;
    }
}
