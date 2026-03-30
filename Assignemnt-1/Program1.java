import java.util.Scanner;
import java.util.Arrays;

class Operations {

    int arr[];

    Operations(int a[]) {
        arr = a;
    }

    // Reverse Array
    void reverse() {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sort Array
    void sort() {
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Search Element
    void search(int key) {
        boolean found = false;
        for (int i : arr) {
            if (i == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }

    // Average
    void average() {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }

    // Maximum
    void maximum() {
        int max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println("Maximum = " + max);
    }

    // Reverse String
    void reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String = " + rev);
    }
}

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Operations obj = new Operations(a);

        obj.reverse();
        obj.sort();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.search(key);

        obj.average();
        obj.maximum();

        sc.nextLine(); // clear buffer
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        obj.reverseString(str);

        sc.close();
    }
}