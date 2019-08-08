import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by lenovo on 8/7/2019.
 */
public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter positive or negative number:  ");
        int num = Integer.parseInt(bufferedReader.readLine());


        if (num == 0)
            System.out.println("It is zero");
        else if (num > 0)
            System.out.println(num + " is positive.");
        else
            System.out.println(num + " is negative");
    }
}
