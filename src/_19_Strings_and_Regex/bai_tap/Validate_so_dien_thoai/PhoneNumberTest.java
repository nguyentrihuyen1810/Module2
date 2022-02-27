package _19_Strings_and_Regex.bai_tap.Validate_so_dien_thoai;

public class PhoneNumberTest {
    public static PhoneNumber phoneNumber;
    public static final String[] vaildNumber = new String[] {"(84)-(0978489648)"};
    public static final String[] invaildNumber = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number : vaildNumber) {
            boolean isvaild = phoneNumber.vilidate(number);
            System.out.println("Phone number is " + number + " is vaild: " + isvaild);
        }
        for (String number : invaildNumber) {
            boolean isvaild = phoneNumber.vilidate(number);
            System.out.println("Phone number is " + number + " is vaild: " + isvaild);
        }
    }
}
