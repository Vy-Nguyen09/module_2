package ss3_Mang_Va_Phuong_Thuc_Trong_Java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập kích thước của mảng: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            int minValue = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
            System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
        }
    }


