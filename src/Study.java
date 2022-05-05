import java.util.Scanner;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you email:  ");
        String email = sc.nextLine();
        Pattern pattern =  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(email);

        boolean matchFound = matcher.find();

        if (matchFound){
            System.out.println("Valid email!");
        }else {
            System.out.println("Invalid email!");
        }


        sc.close();
    }
}

