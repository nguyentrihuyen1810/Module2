package _19_Strings_and_Regex.thuc_hanh.Validate_account;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] vaildAccount = new String[] {"123abc_", "_abc123", "_______", "123456", "abcdefgh"};
    private static final String[] invaildAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : vaildAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Accoutn is " + account + " is valid: " + isvalid);
        }
        for (String account : invaildAccount) {
            boolean isvaild = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvaild);
        }
    }
}
