package theory;

//  Bài 12: Thêm/Chèn phần tử vào mảng
public class _88_Merge_Sorted_Array {
    public static void merger(int a[], int n, int b[], int m) {
        for (int x : b) {
            n++;
            chendulieu(x, a, n);
        }
    }

    private static void chendulieu(int x, int[] a, int n) {
        boolean chen = false;
        for (int i = 0; i < n; i++) {
            if(a[i] > x){
                chen = true;
                for (int j = n - 1; j >= i ; j--) {
                    a[j + 1] = a[j];
                }
                a[i] = x;
                break;
            }
            if(chen = false){
                a[n] = x;
            }
        }
    }

    public static void main(String[] args) {
            int a[] = {1,2,3,0,0,0  };
            int b[] = {2,5,6};
            merger(a, 3, b, 3);
        for (int x :a) {
            System.out.print(x + " ");
        }
    }
}
