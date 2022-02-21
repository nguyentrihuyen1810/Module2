package BaiTap.Candidate;

import java.util.List;
import java.util.Scanner;

public class TestCandidate {
    private static Scanner scanner = new Scanner(System.in);
    private static CandidateManager candidateManager = new CandidateManager();

    public static void main(String[] args) {
        System.out.println("1. Thêm học sinh");
        System.out.println("2. Hiển thị điểm số");

        int choose;
            System.out.println("Lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());

        switch(choose) {
            case 1:
                create();
                break;
            case 2:
                displayPoint();
                break;
        }
    }

    private static void create() {
        System.out.println("Nhập số lượng học sinh cần thêm: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày, tháng, năm sinh: ");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Nhập điểm Toán: ");
            double mathPoint = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập điểm Tiếng Anh: ");
            double englishPoint = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập điểm Văn: ");
            double literaturePoint = Double.parseDouble(scanner.nextLine());
            Candidate candidate = new Candidate(id, name, dateOfBirth, mathPoint, englishPoint, literaturePoint);
        }
    }

    private static void displayPoint() {
        List<Candidate> candidateList = candidateManager.getAll();
        int size = candidateList.size();
        int sumPoint = 0;
        for (int i = 0; i < size; i++) {
            if (sumPoint > 15) {
                System.out.println();
            }
        }
    }

}
