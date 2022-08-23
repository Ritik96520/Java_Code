interface Animal {
     void animalSound(); // interface method (does not have a body)
     void walk(); // interface method (does not have a body)
}

class Cat implements Animal {
    public void animalSound() {
        System.out.println("The cat says meow");
    }
    public void walk() {
        System.out.println("THe cat walk slowly");
    }
}

class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.walk();
    }
}