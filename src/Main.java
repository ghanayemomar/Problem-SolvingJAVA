abstract class Animal {
  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public abstract String getSound();

  public String toString() {
    return getName() + "is " + getAge() + "years old";
  }
}

class Cat extends Animal {
  private String breed;

  public Cat(String name, int age, String breed) {
    super(name, age);
    this.breed = breed;
  }

  public String getBreed() {
    return breed;
  }

  public String getSound() {
    return "Meow";
  }
}

class Dog extends Animal {
  private String breed;

  public Dog(String name, int age, String breed) {
    super(name, age);
    this.breed = breed;
  }

  public String getBreed() {
    return breed;
  }

  public String getSound() {
    return "Woof";
  }
}

interface Pettable {
  public void pet();
}

class PettableCat extends Cat implements Pettable {
  public PettableCat(String name, int age, String breed) {
    super(name, age, breed);
  }

  public void pet() {
    System.out.println("Petting " + getName() + " the " + getBreed() + "dog");
  }
}

public class Main {
  public static void main(String[] args) {
    Cat cat = new Cat("Sara", 1, "Siamese");
    Dog dog = new Dog("Owen", 2, "Huskey");
    System.out.println("The Cat Name Is: " + cat.getName() + " The Cat Age Is " + cat.getAge());
    System.out.println(cat.getSound());
  }
}