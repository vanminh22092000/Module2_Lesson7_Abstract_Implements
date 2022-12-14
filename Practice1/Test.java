package Practice1;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            animal.makeSound();
            System.out.println(animal.makeSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
