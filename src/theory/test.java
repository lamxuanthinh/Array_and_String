package theory;

import java.util.Scanner;

public class test {
    private static Scanner sc = new Scanner(System.in);
    public static void inputArr(){
        System.out.println("enter the number n is : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x :arr) {
            System.out.println(x + " ");
        }
    }
    public static void main(String[] args) {
        inputArr();
    }
}
