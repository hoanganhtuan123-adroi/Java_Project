package main;

import dao.KhachHangDAO;
import modal.KhachHang;

public class Main {
	public static void main(String[] args) {
		KhachHang khachhang1 = new KhachHang(22);
		KhachHangDAO.getInstance().delete(khachhang1);
	}
}
