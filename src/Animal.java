public class Animal {
    public void run() {
        System.out.println("Can Run");
    }
}
class Dog extends Animal{
    public void jump() {
        System.out.println("Can Jump");
    }
}
class Horse extends Dog {
    public void climb() {
        System.out.println("Can't Climb");
    }
}
class Test{
    public static void main(String[] args) {
        Horse hs = new Horse();
        hs.run();
        hs.jump();
        hs.climb();
    }
}
