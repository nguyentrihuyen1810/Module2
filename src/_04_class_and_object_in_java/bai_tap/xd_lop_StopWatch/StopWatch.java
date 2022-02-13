package _04_class_and_object_in_java.bai_tap.xd_lop_StopWatch;

import java.util.Arrays;
import java.util.Date;

import static java.lang.StrictMath.floor;
import static java.lang.StrictMath.random;

public class StopWatch {
    private Date startTime;
    private Date stopTime;

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        stopTime = new Date();
    }

    public long getElapsedTime() {
        return stopTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        double[] arr = new double[10000];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = floor(random() * 100 + 1);
        }

        System.out.println("Array before sort");
        System.out.println(Arrays.toString(arr));
        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();
        System.out.println("Array after sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("Elapsed Time: " + stopwatch.getElapsedTime());
    }

    private static void selectionSort(double[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min_pos = i;
            for (int j = 0; j < length; i++) {
                if (arr[min_pos] > arr[j]) min_pos = j;
            }

            if (min_pos != i) {
                double temp = arr[min_pos];
                arr[min_pos] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

