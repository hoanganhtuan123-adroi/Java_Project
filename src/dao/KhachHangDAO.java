package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.Database;

import modal.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}
	@Override
	public int insert(KhachHang t) {
		int ketqua = 0 ;
		try {
			Connection conn = Database.getConnection();
			Statement st = conn.createStatement();
			
			String sql = String.format("INSERT INTO khachHang(hoTen, ngaySinh, diaChi) VALUES('%s', '%s', '%s')", 
			        t.getHoTen(), t.getNgaySinh(), t.getDiaChi());
			
			System.out.println(sql);
			ketqua = st.executeUpdate(sql);
			
			System.out.println("Bạn đã thêm thành công!");
			System.out.println("Số dòng bị thay đổi: " + ketqua );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	return ketqua;
	}

	@Override
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
