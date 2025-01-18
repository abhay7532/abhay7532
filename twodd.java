import java.util.Scanner;

class Jojo {
    public static void main(String[] args) {
        System.out.print("m = ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        System.out.print("n = ");
        int n = input.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter search element = ");
        int s = input.nextInt();

        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int ans = search(arr, m, n, s);
        if (ans == 1) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }

    static int search(int[][] arr, int m, int n, int s) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == s) {
                    count++;
                }
            }
        }

        if (count > 0) {
            return 1; // Element found
        } else {
            return 0; // Element not found
        }
    }
}




