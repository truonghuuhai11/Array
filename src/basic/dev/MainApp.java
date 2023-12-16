package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mang = new int[10];

		// Nhập mảng từ người dùng
		System.out.println("Nhap mang 10 so nguyen:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			mang[i] = sc.nextInt();
		}

		// Tổng của các phần tử trong mảng
		int tong = 0;
		for (int i = 0; i < 10; i++) {
			tong += mang[i];
		}
		System.out.println("Tong cac phan tu cua mang: " + tong);

		// Kiểm tra tổng có chẵn hay lẻ và in kết quả
		if (tong % 2 == 0) {
			System.out.println("Tong la so chan.");
		} else {
			System.out.println("Tong la so le.");
		}

		// Đếm số lượng số chẵn và số lẻ trong mảng và in kết quả
		int demChan = 0;
		int demLe = 0;
		for (int i = 0; i < 10; i++) {
			if (mang[i] % 2 == 0) {
				demChan++;
			} else {
				demLe++;
			}
		}
		System.out.println("So luong so chan trong mang: " + demChan);
		System.out.println("So luong so le trong mang: " + demLe);

		// Sắp xếp mảng theo thứ tự tăng dần và in mảng ra màn hình
		for (int i = 0; i < 10 - 1; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {
				if (mang[j] > mang[j + 1]) {
					int temp = mang[j];
					mang[j] = mang[j + 1];
					mang[j + 1] = temp;
				}
			}
		}
		System.out.println("Mang sau khi sap xep tang dan:");
		for (int i = 0; i < 10; i++) {
			System.out.print(mang[i] + " ");
		}
		System.out.println();

		// Kiểm tra phần tử xuất hiện nhiều nhất trong mảng
		int maxCount = 0;
		int phanTuXuatHienNhieuNhat = mang[0];
		for (int i = 0; i < 10; i++) {
			int count = 1;
			for (int j = i + 1; j < 10; j++) {
				if (mang[i] == mang[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				phanTuXuatHienNhieuNhat = mang[i];
			}
		}
		System.out.println("Phan tu xuat hien nhieu nhat trong mang: " + phanTuXuatHienNhieuNhat);

		// Kiểm tra số nguyên tố trong mảng và đếm số lượng
		int demSoNguyenTo = 0;
		for (int i = 0; i < 10; i++) {
			if (isSoNguyenTo(mang[i])) {
				demSoNguyenTo++;
			}
		}
		System.out.println("So luong so nguyen to trong mang: " + demSoNguyenTo);
	}

	// Phương thức kiểm tra số nguyên tố
	public static boolean isSoNguyenTo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}