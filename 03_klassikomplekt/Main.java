public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
//        Arvuti arvuti = new Arvuti(new Info("asd","ads","da",1,1),1999);

        Info info = new Info("asd","ads","da",1,1);
=======
        Info info = new Info("sdaa", "dsfdf", "fdsfs", 1, 1);
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
        Arvuti arvuti = new Arvuti(info,1999);

        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);
    }
}
