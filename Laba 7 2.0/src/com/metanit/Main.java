package com.metanit;

class Cat extends Main.Animal {
    private String plus = "Можно поиграть и успокоиться ";
    private String minus = "Оставляет после себя шерсь, портит мебель";
    Cat(String Name,String food,String location) {
        super(Name, food, location);
    }

    @Override
    public void eat() {
        System.out.println("Кот кушает: " + setFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }

    @Override
    public void displayInfo() {
        eat();
        makeNoise();
        sleep();
        System.out.println("Плюсы " + plus);
        System.out.println("Минусы: " + minus);
    }
}

class Hourse extends Main.Animal {
    private String plus = "Можно быстро перемещаться по местности ";
    private String minus = "Много ест, может убить";
    Hourse(String Name,String food,String location) {
        super(Name, food, location);
    }
    @Override
    public void eat() {
        System.out.println("Лошадь естя: " + setFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь делатет (Иго-го)");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }

    @Override
    public void displayInfo() {
        eat();
        makeNoise();
        sleep();
        System.out.println("Плюсы: " + plus);
        System.out.println("Минусы: " + minus);
    }
}

class Dog extends Main.Animal {
    private String plus = "В беде не бросит, может помогать в различных сферах";
private String minus = "Портит мебель";
    Dog(String Name,String food,String location) {
        super(Name, food, location);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест: " + setFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит ");
    }

    @Override
    public void displayInfo() {
        eat();
        makeNoise();
        sleep();
        System.out.println("Плюс: " + plus);
        System.out.println("Минусы: " + minus);
    }
}

public class Main {
    public static class Animal{
        Animal animal;
        public String Name;
        private String food;
        public String location;
        public String setFood(){
            return food;
        }

        Animal(String Name,String food,String location){
            this.Name = Name;
            this.food=food;
            this.location=location;
        }
        public void eat(){
            System.out.println("Ест");
        }
        public void makeNoise(){
            System.out.println("Издаёт звуки");
        }
        public void sleep(){
            System.out.println("Спит");
        }
        public void displayInfo(){
            System.out.println("location: " + location);
            System.out.println("food: " + food);
        }
    }


    static class Veterenar{

        void treatAnimal(Animal animal) {
            System.out.println( animal.Name + " на приеме у Ветеринара");
            System.out.println("Еда: " + animal.food);
            System.out.println("Находиться: " + animal.location);
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        Veterenar vet = new Veterenar();
        Animal dog = new Dog("Бобик", "Мясо, корм, консервы", "Улица");
        Animal cat = new Cat("Винидикт","Колбасу, корм", "Дом");
        Animal hourse = new Hourse ("Маруся","Яблоки", "Загон");
        dog.displayInfo();
        vet.treatAnimal(dog);
        cat.displayInfo();
        vet.treatAnimal(cat);
        hourse.displayInfo();
        vet.treatAnimal(hourse);

    }
}