package DesignPatterns;

class TheSingleton{

    //create instance field of the class
    static TheSingleton instance = new TheSingleton();

    // have a private constructor for the class
    private TheSingleton(){
    }

    // create a getInstance method which takes the class as a type
    // and returns the instance of that class type
    public static TheSingleton getInstancee(){
        return instance;
    }

    // some void method returning "Hello World..."

    void someText(){
        System.out.println("Hello World...");
    }
}

public class SingletonPattern {

    public static void main(String[] args) {
        TheSingleton singleton = TheSingleton.getInstancee();
        singleton.someText();
    }
}

