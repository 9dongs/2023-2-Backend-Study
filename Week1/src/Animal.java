public abstract class Animal{
    public static void main(String[] args) {
        // Animal a = new Animal(); // 추상 클래스는 인스턴스를 생성할 수 없음.
        Cat c = new Cat();
        Dog d = new Dog();

        c.speak();
        d.speak();
    }
    public abstract void speak();
}
class Cat extends Animal { public void speak() {
    System.out.println("cat says Meow!");
} }
class Dog extends Animal { public void speak() {
    System.out.println("dog says Woof!");
} }

