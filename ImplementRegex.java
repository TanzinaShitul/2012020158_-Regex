package Nahid;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementRegex {
    public static void main(String[] args) {
        String address;
        Scanner input = new Scanner(System.in);

        Pattern patternType = Pattern.compile("http[s]?:\\/\\/w{3}.*\\.[a-z]{2,3}");

        System.out.print("Enter address: ");
        address = input.nextLine();
        Matcher matcher = patternType.matcher(address);

        boolean chaeck = matcher.matches();
        if (chaeck)
            System.out.println("Matched: " + chaeck);
        else
            System.out.println("Not matched: " + chaeck);



        address = matcher.replaceAll("");
        System.out.println("New Address: " + address);
    }
}
