

import java.util.Scanner;
import java.util.regex.Pattern;

public class TH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        ;
        System.out.println("Nhập email: ");

        do {
            String email = scanner.nextLine();
            boolean validateEmail = Pattern.matches(regexEmail, email);
            // so sánh chuỗi email vùa nhập voới mẫu regeEmail (trẻ về true/false
            if (validateEmail) {
            }
        }
    }