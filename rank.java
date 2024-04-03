import java.util.Scanner;

public class rank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double point1;
        double point2;
        double point3;

        System.out.print("Nhập điểm chuyên cần: ");
        point1 = scanner.nextDouble();

        System.out.print("Nhập điểm kiểm tra: ");
        point2 = scanner.nextDouble();

        System.out.print("Điểm thi cuối kì: ");
        point3 = scanner.nextDouble();

        double diemTrungBinh = (point1 + point2 + point3) / 3;
        System.out.print("Điểm Trung Bình là: " + diemTrungBinh);

        if (diemTrungBinh > 10) {
            System.out.print("Lỗi");
        } else if (diemTrungBinh >= 8.5) {
            System.out.print("Xếp loại A");
        } else if (7 <= diemTrungBinh) {
            System.out.print("Xếp loại B");
        } else if (5.5 <= diemTrungBinh) {
            System.out.print("Xếp loại C");
        } else if (4 <= diemTrungBinh) {
            System.out.print("Xếp loại D");
        } else if (diemTrungBinh < 4) {
            System.out.print("Xếp loại F");
        } else {
            System.out.print("Lỗi");
        }
    }
}
