package ss19_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
    public ClassNameValidate(){};

    public boolean checkClassNameValidate(String className){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
    public static void main(String[] args) {
        ClassNameValidate classNameValidate = new ClassNameValidate();
        Scanner scanner = new Scanner(System.in);
        String[] className = {"C0318G", "M0318G", "P0323A"};

        for (String c : className) {
            boolean check = classNameValidate.checkClassNameValidate(c);
            System.out.println("Class : " + c + " is " + check);
        }

    }
}
