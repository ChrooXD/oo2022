package main;

public class Main {
    public static void main(String[] args) {
        Info info = new Info("Usbekistan", 32656700, "Taškent", 447400, 4.14);
        Riik riik = new Riik(info,1685);

        String riigiInfo = riik.getInfo();
        System.out.println(riigiInfo);
    }
}