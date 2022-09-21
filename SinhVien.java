
package tuan2;
public class SinhVien {
	private int MaSv;
	private String HoTen ;
	private float DiemTH ,DiemLT ;
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(int maSv, String hoTen, float diemTH, float diemLT) {
		super();
		MaSv = maSv;
		HoTen = hoTen;
		DiemTH = diemTH;
		DiemLT = diemLT;
	}
	public int getMaSv() {
		return MaSv;
	}
	public void setMaSv(int maSv) {
		MaSv = maSv;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public float getDiemTH() {
		return DiemTH;
	}
	public void setDiemTH(float diemTH) {
		DiemTH = diemTH;
	}
	public float getDiemLT() {
		return DiemLT;
	}
	public void setDiemLT(float diemLT) {
		DiemLT = diemLT;
	}
	public float DiemTB() {
	return (DiemTH + DiemLT)/2;
	}
	@Override
	public String toString() {
		return  MaSv  + HoTen +  DiemTH +  DiemLT
				 + DiemTB() ;
	}
	 public void inSV() {
	        System.out.printf("%6d %17s %24.2f %17.2f %18.2f \n", MaSv, HoTen, DiemTH, DiemLT, DiemTB());
	    }
	}



