package tuan2;
import java.util.Scanner;
public class KiemThuSinhVien {
public static void main(String[] args) {
	System.out.printf("%6s %10s %30s %19s %19s \n","ma sinh vien","ho ten","diem ly thuyet","diem thuc hanh","diem trung binh");
	SinhVien sv1 = new SinhVien(111, "chung", 8.0f, 9.0f);
	sv1.inSV();
    SinhVien sv2 =  new SinhVien(222, "tien", 4.0f, 5.0f);
    sv2.inSV();
    
    SinhVien sv3 = new SinhVien();
    sv3.setMaSv(0);
    sv3.setHoTen(null);
    sv3.setDiemLT(0);
    sv3.setDiemTH(0);
    Scanner sc= new Scanner(System.in);
    System.out.println("nhap vao ma sv");
    sv3.setMaSv(sc.nextInt());
    System.out.println("nhapvao ho ten");
    sv3.setHoTen(sc.next());
    System.out.println("nhap vao diem ly thuyet");
    sv3.setDiemLT(sc.nextFloat());
    System.out.println("nhap vao diem thuc hanh");
    sv3.setDiemTH(sc.nextFloat());
	System.out.printf("%6s %10s %30s %19s %19s \n","ma sinh vien","ho ten","diem ly thuyet","diem thuc hanh","diem trung binh");
	sv1.inSV();
	sv2.inSV();
	sv3.inSV();
	
}
}
