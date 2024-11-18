package day3;

import java.util.regex.*;
import java.util.Scanner;

public class ImageFileValidator {

    private static final String regex_pattern = "^(.*)\\.(jpg|jpeg|png|gif|bmp)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	  System.out.println("Enter the number of file names you want to validate:");
          int numFiles = scanner.nextInt(); 
          scanner.nextLine(); 
          String[] fileNames = new String[numFiles];
          System.out.println("Enter the file names:");
          for (int i = 0; i < numFiles; i++) {
              fileNames[i] = scanner.nextLine();  
          }
        for (String fileName : fileNames) {
            if (isValidImageFile(fileName)) {
                System.out.println(fileName + " is a valid image file.");
            } else {
                System.out.println(fileName + " is not a valid image file.");
            }
        }
    }
    public static boolean isValidImageFile(String fileName) {
        Pattern pattern = Pattern.compile(regex_pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fileName);
        return matcher.matches();
    }
}
