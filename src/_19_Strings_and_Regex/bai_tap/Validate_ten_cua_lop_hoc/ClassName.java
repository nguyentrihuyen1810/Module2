package _19_Strings_and_Regex.bai_tap.Validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String CLASS_NAME = "^[ACP]{1}[0-9]{4}[G-M]$";

    public ClassName() {
        pattern = Pattern.compile(CLASS_NAME);
    }

    public boolean vilidate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
