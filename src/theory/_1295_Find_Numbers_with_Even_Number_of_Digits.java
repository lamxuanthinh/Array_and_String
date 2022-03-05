package theory;
//  Bài 11: Duyệt mảng
public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int nums[]) {
        int count = 0;
        for (int x : nums) {
            int a = soluonchuso(x);
            if (a % 2 == 0) count++;
        }
        return count;
    }
    // hàm đếm số lượng chữ số
    private static int soluonchuso(int x) {
        int kq = x, count1 = 0;
        while (x != 0) {
            kq = x / 10;
            x = kq;
            count1++;
        }
        return count1;
    }

    public static void main(String[] args) {
        int nums[] = {123, 23, 3, 4222, 123456};
//        findNumbers(arr);
//      System.out.println(soluonchuso(123));
        System.out.println(" so la chan la : " + findNumbers(nums));
    }
}
