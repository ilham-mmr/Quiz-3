public class Lab1Stage2{
public static void main(String[] args){

    Animal kurre = new Cat("Kurre");
    Animal vilma = new Dog("Vilma");
    
    //kurre.age = 6;
    //vilma.age = 3;
    
    Animal.age = 6;
    Animal.age = 3;
    
    kurre.introduceYourself();
    vilma.introduceYourself();
}
}
