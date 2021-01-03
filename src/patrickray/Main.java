package patrickray;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    private static final String CHAR_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CHAR = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("PASSWORD GENERATOR");
        System.out.println("--------------------");
        System.out.println("1.UpperCase + LowerCase Character\n2.UpperCase + LowerCase Character + Numeric\n3.UpperCase + LowerCase Character + Numeric + Special Character");
        System.out.print("Choice:");
        int choice = scanner.nextInt();

        int len;
        switch (choice)
        {
            case 1:
                System.out.print("Length of Password:");
                len = scanner.nextInt();
                System.out.println(generatePassword(len,CHAR+CHAR_CAPS));
                break;
            case 2:
                System.out.print("Length of Password:");
                len = scanner.nextInt();
                System.out.println(generatePassword(len,CHAR+CHAR_CAPS+NUMERIC));
                break;
            case 3:
                System.out.print("Length of Password:");
                len = scanner.nextInt();
                System.out.println(generatePassword(len,CHAR+CHAR_CAPS+NUMERIC+SPECIAL_CHARS));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    public static String generatePassword(int len, String combi)
    {
        String password = "";
        for(int i = 0; i<len; i++)
        {
            int index = random.nextInt(combi.length());
            password += combi.charAt(index);
        }
        return password;
    }
}