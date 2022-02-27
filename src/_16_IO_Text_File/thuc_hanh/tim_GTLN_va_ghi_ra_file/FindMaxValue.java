package _16_IO_Text_File.thuc_hanh.tim_GTLN_va_ghi_ra_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CODEGYMDN\\Module2\\numbers.txt.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CODEGYMDN\\Module2\\result.txt.txt", maxValue);
    }
}
