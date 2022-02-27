package _19_Strings_and_Regex.bai_tap.Validate_ten_cua_lop_hoc;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] vaildName = new String[] {"C0318G"};
    public static final String[] invalidName = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : vaildName) {
            boolean isvaild = className.vilidate(name);
            System.out.println("Class name is " + name + " is vaild: " + isvaild);
        } for (String name : invalidName) {
            boolean isvaild = className.vilidate(name);
            System.out.println("Class name is " + name + " is vaild: " + isvaild);
        }
    }
}
