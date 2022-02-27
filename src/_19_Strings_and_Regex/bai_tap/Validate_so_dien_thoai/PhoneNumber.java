package _19_Strings_and_Regex.bai_tap.Validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String PHONE_NUMBER = "^(\\+84)[)_(][0][0-9]{9}[)]$";

    public PhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER);
    }

    public boolean vilidate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
