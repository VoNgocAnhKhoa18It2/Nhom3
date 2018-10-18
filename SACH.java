package test;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class SACH {
	int MSach;
	String Tensach;
	String Tentacgia;
	String Namxuatban;
	int Soluong;
	double gia;
	public SACH() {
		Tensach = new String("");
		Tentacgia = new String("");
		Namxuatban = new String("");
		Soluong=0;
		gia=0;
	}
	public int getMSach() {
		return MSach;
	}
	public String getTensach() {
		return Tensach;
	}
	public String getTentacgia() {
		return Tentacgia;
	}
	public String getNamxuatban() {
		return Namxuatban;
	}
	public int getSoluong() {
		return Soluong;
	}
	
	public double getGia() {
		return gia;
	}
	public SACH(int mSach, String tensach, String tentacgia, String namxuatban, int soluong, double gia1) {
		MSach = mSach;
		Tensach = tensach;
		Tentacgia = tentacgia;
		Namxuatban = namxuatban;
		Soluong = soluong;
		gia = gia1;
	}
}	
class Quanlisach{	
	Vector list=new Vector();
	public void Nhapthongtin() {
		int n;
		System.out.println("Nhap so luong sach");
		Scanner key=new Scanner(System.in);
		n=key.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("Nhap thong tin cho loai sach thu: "+i);
			System.out.println("Ma Sach: ");
			int id=Integer.parseInt(key.next());
			key.nextLine();
			System.out.println("Ten Sach: ");
			String name = key.nextLine();
			System.out.println("Ten Tac Gia: ");
			String tacgia = key.nextLine();
			System.out.println("Nha Xuan Ban: ");
			String nam = key.nextLine();
			System.out.println("So luong: ");
			int sl=key.nextInt();
			System.out.println("Gia: ");
			double gia=key.nextDouble();
			SACH s=new SACH(id,name,tacgia,nam,sl,gia);
			list.add(s);
		}
		System.out.println("\n---------------------\n");
	}
	public void Insach() {
		System.out.println("Thong tin sach");
		Enumeration vEnum = list.elements();
		int i=1;
		while(vEnum.hasMoreElements()) {
			SACH st=(SACH)vEnum.nextElement();
			System.out.println("    "+i+"ID: "+st.getMSach()+",Ten Sach: "+st.getTensach()
			+",Ten Tac Gia: "+st.getTentacgia()+",So Luong: "+st.getSoluong()+",Gia: "+st.getGia());
		}
		System.out.println("\n----------------------\n");
		}	
}