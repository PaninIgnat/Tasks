import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task_4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число в бинарном формате:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bin = reader.readLine();
        
        int binNum = Integer.parseInt(bin, 2);
        System.out.println(binNum);

    }
}