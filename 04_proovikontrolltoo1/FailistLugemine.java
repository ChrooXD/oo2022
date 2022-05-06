<<<<<<< HEAD
import java.io.*;
import java.util.Arrays;
=======
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
import java.util.List;

public class FailistLugemine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("kirjeldus.txt")
        );
        String rida = br.readLine();
        System.out.println(rida);
<<<<<<< HEAD
//        String[]
        List<String> tykeldus = Arrays.asList(rida.split("es"));
=======
        List<String> tykeldus = List.of(rida.split("es"));
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
        System.out.println(tykeldus);
        System.out.println(tykeldus.size());
        System.out.println(Math.sqrt(tykeldus.size()));
        System.out.println(Math.pow(tykeldus.size(),3));

<<<<<<< HEAD
        //absoluutväärtus Math.abs --- if (number < 0) -- number *= -1
=======
        // absoluutväärtus Math.abs --- if (number < 0) -- number *= -1
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }
}
