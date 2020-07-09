public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is "+super.getName());
        System.out.println("and I am " + this.age + " years old.");
    }

}
