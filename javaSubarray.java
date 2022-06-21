import java.util.Arrays;
import java.util.Scanner;


public class javaSubarray {




        static Scanner sc1 = new Scanner(System.in);

        public static void main(String[] args) {

            int negativeCounter = 0;

            int arrLen = sc1.nextInt();

            int[] arr = new int[arrLen];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc1.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    int[] subArr = Arrays.copyOfRange(arr, i, j + 1);
                    if (sumArrElements(subArr) < 0) {
                        negativeCounter++;
                    }
                }
            }
            System.out.println(negativeCounter);
        }

        public static int sumArrElements(int[] arr) {
            int total = 0;
            for (int j : arr) {
                total += j;
            }
            return total;
        }

    }

