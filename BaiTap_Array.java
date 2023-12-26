import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner
		Scanner scanner = new Scanner(System.in);
		// Khai bao
		int l;
		int tongCacSoDuong = 0;
		int tongCacSoLe = 0;
		System.out.println("Vui lòng nhập chiều dài của mãng : ");
		l = scanner.nextInt();
		int mangSo[] = new int[l];
		// Nhập các phần tử của mảng từ người dùng
		for (int i = 0; i < l; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			mangSo[i] = scanner.nextInt();
		}
		// Tính tổng các số dương

		for (int i = 0; i < l; i++) {
			if (mangSo[i] >= 0) {
				tongCacSoDuong += mangSo[i];
			}
		}
		System.out.println(" Tổng các số dương trong mãng là : " + tongCacSoDuong);
		// Tính tổng các số lẽ
		for (int i = 0; i < l; i++) {
			if (mangSo[i] % 2 != 0) {
				tongCacSoLe += mangSo[i];
			}
		}
		System.out.println(" Tổng các số lẽ trong mãng : " + tongCacSoLe);
		int soNhoNhatTrongMang = mangSo[0];
		// tìm số nhỏ nhất trong mãng
		for (int i = 1; i < l; i++) {
			if (mangSo[i] < soNhoNhatTrongMang) {
				soNhoNhatTrongMang = mangSo[i];
			}
		}
		System.out.println(" Số nhỏ nhất trong mãng là :  " + soNhoNhatTrongMang);

		// Tìm số dương nhỏ nhất trong mảng
		ArrayList<Integer> mangSoDuong = new ArrayList<>();

		// bien mangSo thanh mangSoDuong
		for (int i = 1; i < l; i++) {
			if (mangSo[i] >= 0) {
				mangSoDuong.add(mangSo[i]);
			}
		}
		// tìm số nhỏ nhất trong mãng số dương
		int min = mangSoDuong.get(0);
		for (int i = 1; i < mangSoDuong.size(); i++) {
			if (mangSoDuong.get(i) < min) {
				min = mangSoDuong.get(i);
			}
		}
		System.out.println(" Số dương nhỏ nhất trong mãng là :  " + min);
		// tìm số chẵn cuối cùng của mãng => duyệt mãng từ đuôi lên đầu
		boolean khongCoSoChan = true;
		for (int i = l - 1; i >= 0; i--) {
			if (mangSo[i] % 2 == 0) {
				khongCoSoChan = false;
				System.out.println(" số chẵn cuối cùng của mãng là : " + mangSo[i]);
				break;
			}

		}
		if (khongCoSoChan == true) {
			System.out.println(" mãng không có giá trị chẵn : -1 ");
		}

		// Tìm số nguyên tố đầu tiên
		boolean khongCo = false;
		// duyệt mãng lấy ra giá trị
		for (int i = 0; i < l; i++) {
			int dem = 0;
			// lấy giá trị phần tử thứ i chia cho 1 đến chính nó
			for (int j = 1; j <= mangSo[i]; j++) {
				if (mangSo[i] % j == 0) {
					dem++;
				}
			}
			if (dem == 2) {
				khongCo = true;
				System.out.println(mangSo[i] + "Là số nguyên tố ");
				break;
			}

		}
		if (khongCo != true) {
			System.out.println("không có số nguyên tố -1");
		}
		// Tìm số dương cuối cùng trong mãng
		boolean khongCoSoDuong = true;
		for (int i = l - 1; i >= 0; i--) {
			if (mangSo[i] > 0) {
				khongCoSoDuong = false;
				System.out.println(" số dương cuối cùng của mãng là : " + mangSo[i]);
				break;
			}

		}
		if (khongCoSoDuong == true) {
			System.out.println(" mãng không có giá trị dương  : -1 ");
		}

		// Tìm số chẵn nhỏ nhất trong mãng
		ArrayList<Integer> mangSoChan = new ArrayList<>();

		// bien mangSo thanh mangSoDuong
		for (int i = 1; i < l; i++) {
			if (mangSo[i] % 2 == 0) {
				mangSoChan.add(mangSo[i]);
			}
		}
		// tìm số nhỏ nhất trong mãng số dương
		int minTrongMangSoChan = mangSoChan.get(0);
		for (int i = 1; i < mangSoChan.size(); i++) {
			if (mangSoChan.get(i) < minTrongMangSoChan) {
				minTrongMangSoChan = mangSoDuong.get(i);
			}
		}
		System.out.println(" Số chẵn nhỏ nhất trong mãng là :  " + minTrongMangSoChan);

	}
 
	// viết hàm Tìm số chẵn đầu tiên trong mãng
	public static int timSoChanDauTien(int[] mang) {
		for (int so : mang) {
			if (so % 2 == 0) {
				return so; // Trả về số chẵn đầu tiên
			}
		}
		return -1; // Nếu không có số chẵn nào trong mảng
	}

}
