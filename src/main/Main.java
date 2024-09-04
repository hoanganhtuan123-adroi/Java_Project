package main;

import dao.KhachHangDAO;
import modal.KhachHang;

public class Main {
	public static void main(String[] args) {
		KhachHang khachhang1 = new KhachHang(' ',"Tuan", "tuanhoan@gmail.com", "To 14");
		KhachHangDAO.getInstance().insert(khachhang1);
	}
}
