package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import ss19_string_regex.bai_tap.validate_ten_lop_hoc.ClassNameValidate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER_REGEX = "^[(](\\d{2})[)][-][(][0](\\d{9})[)]$";
    public PhoneNumberValidate(){};
    public boolean checkPhoneNumberValidate(String phoneNumber){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static void main(String[] args) {
      PhoneNumberValidate phoneNumberValidate = new PhoneNumberValidate();
        Scanner scanner = new Scanner(System.in);
        String[] phoneNumber = {"(84)-(0978489648)", "(a8)-(22222222)"};

        for (String p : phoneNumber) {
            boolean check = phoneNumberValidate.checkPhoneNumberValidate(p);
            System.out.println("Phone number : " + p + " is " + check);
        }

    }

}
