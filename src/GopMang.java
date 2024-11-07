import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[] arr1;
        int[] arr2;
        Scanner sc = new Scanner(System.in);
        //Nhap size mang 1
        do {
            System.out.print("Nhap size mang 1: ");
            size1 = sc.nextInt();
            if (size1 <= 0) {
                System.out.println("Size mang it nhat la 1! Nhap lai!");
            }
        } while (size1 <= 0);
        //Nhap cac phan tu mang 1
        arr1 = new int[size1];
        int i = 0;
        while (i < size1) {
            System.out.print("Mang 1: Nhap phan tu thu " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
            i++;
        }
        //Nhap size mang 2
        do {
            System.out.print("Nhap size mang 2: ");
            size2 = sc.nextInt();
            if (size2 <= 0) {
                System.out.println("Size mang it nhat la 1! Nhap lai!");
            }
        } while (size2 <= 0);
        //Nhap cac phan tu mang 2
        arr2 = new int[size2];
        int j = 0;
        while (j < size2) {
            System.out.print("Mang 2: Nhap phan tu thu " + (j + 1) + ": ");
            arr2[j] = sc.nextInt();
            j++;
        }
        //In ra mang 1
        System.out.println("Cac phan tu mang 1: ");
        for (int m1 = 0; m1 < size1; m1++) {
            System.out.print(arr1[m1] + " ");
        }
        System.out.println();
        //In ra mang 2
        System.out.println("Cac phan tu mang 2: ");
        for (int m2 = 0; m2 < size2; m2++) {
            System.out.print(arr2[m2] + " ");
        }
        System.out.println();
        //
        //Tao mang thu 3 de gop mang 1 va mang 2
        int[] arr3 = new int[size1 + size2];
        //Duyet mang 1 va gan vao mang 3
        for(int k = 0; k < size1; k++) {
            arr3[k] = arr1[k];
        }
        //Duyet mang 2 va gan vao mang 3
        for(int k = 0; k < size2; k++) {
            arr3[size1 + k] = arr2[k];
        }

        //In ra mang 3
        System.out.println("Mang 3 sau khi gop");
        for(int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k]+" ");
        }
        System.out.println();
    }
}
