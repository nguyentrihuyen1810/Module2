package _08_clean_code_and_refactoring.thuc_hanh.Refactoring_doi_ten_bien_va_tach_hang;

public class CalculatorTest {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOprand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOprand + secondOperand;
            case SUBTRACTION:
                return firstOprand - secondOperand;
            case MULTIPLICATION:
                return firstOprand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOprand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported opration");
        }
    }
}
