// right clock -> new java class -> main
// main --> enter

public class Main {
    public static void main(String[] args) {
        Human one = new Human("Mihkel", 99, 1.90, true);
        Human two = new Human("oifgdg", 79, 1.30, false);

        System.out.println(one);
        System.out.println(two);

        one.sayHello();
        two.sayHello();


        // main meetod 1 class
        // uus klass, kus on vähemalt 2 muutujat
        // 1 funktsioons
        // toString() funktsioon
        // main meetodis on seda vähemalt 2 korda välja toodud
    }
}
