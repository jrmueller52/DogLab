// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());
	
	Labrador lab = new Labrador("Max", "yellow");
    System.out.println(lab.getName()+" "+lab.bark());//methods in parent class

        Yorkshire york = new Yorkshire("Bella", 5);
        System.out.println(york.getName()+" "+york.bark());//methods in parent class

        york.waddle();
        lab.waddle();//method not in lab class, siblings do not inherit methods from each// other

        Dog[] dogs = new Dog[3];
        dogs[0]= new Dog("Max");
        dogs[1]= new Labrador("Rudy", "black");
        dogs[2]= new Yorkshire("Rusty", 4);

        for(int i = 0; i< dogs.length;i++) {
            System.out.println(dogs[i].bark());
        }
            for(Dog hi : dogs){
                System.out.println(hi.bark());
            }
        }
        ((Labrador)dogs[1]).waddle();


    }


