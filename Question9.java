class Animal
{
    String colour = "Blue";
 
    public void animalSound()
    {
       System.out.print("\nAnimal is calling\n");
    }
}

class Dog extends Animal
{
    String colour = "Blue";

    public void animalSound()
    {
       super.animalSound();      //here i call Animal parent class method animalSound() by using super keyword
       System.out.print("\nDog is Barking\n\n");
    }

    public void showDogColour()
    {
       System.out.print("\nAnimal Colour : "+super.colour+"\n");
       System.out.print("\nDog Colour : "+this.colour+"\n\n");  //here i call Animal parent class member colour by using super keyword
    }
}


public class Question9
{
   public static void main(String[] args)
   {
      Dog peter = new Dog();
      peter.animalSound();
      peter.showDogColour();
   }
}