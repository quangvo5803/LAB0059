package Common;

import java.util.Scanner;

public class Validation {
    static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        
        while (true) {
            String s = sc.nextLine();
            if(s.isEmpty()){
                System.out.println("Not empty");
                System.out.print("Enter again: ");
            }else{
                return s;
            }
        }
    }

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(prompt);
            if (i < min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (i > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            } else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(String prompt){
        double d =0;
        boolean isValid = false;
        while (isValid==false){
            System.out.print(prompt);
            if(sc.hasNextDouble()){
                d = sc.nextDouble();
                isValid = true;
            }
            else{
                System.out.println("Error! Invalid decimal value.Try again");
            }
            sc.nextLine();
        }
        return d;
     }
    
    public static double getDouble(String prompt,double min,double max){
        double d = 0;
        boolean isValid = false;
        while (isValid == false){
            d= getDouble(prompt);
            if (d<min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if(d> max){
                System.out.println("Error! Number must be less than " + max + ".");
            }
            else 
                isValid = true;
        }
           return d;
     }
    
}
