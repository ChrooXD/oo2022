package isikukood;
<<<<<<< HEAD
// parem klõps -> "Generate" -> "constructor"
=======
// parem klõps -> generate -> constructor

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9

public class IsikukoodEE implements IsikukoodObject {
    String isikukood;
    String[] kuud = {"Jaanuar", "Veebruar", "Märts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September", "Oktoober", "November", "Detsember"};
<<<<<<< HEAD
    // 39402431256;
=======
    // 39412431256
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9

    public IsikukoodEE(String isikukood) {
        this.isikukood = isikukood;
    }

    @Override
    public boolean isMale() {
        return isikukood.startsWith("1") ||
                isikukood.startsWith("3") ||
<<<<<<< HEAD
                    isikukood.startsWith("5");
=======
                isikukood.startsWith("5");
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }

    @Override
    public int getBirthYear() {
        return 1900 + Integer.parseInt(isikukood.substring(1,3));
    }

    @Override
    public String getBirthMonth() {
        return kuud[Integer.parseInt(this.isikukood.substring(3,5))-1];
    }
}
