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
			
			String sql = String.format("INSERT INTO KhachHang(KhachhangName, Thongtinlienhe, Diachi) VALUES('%s', '%s', '%s')", 
			        t.getKhachhangName(), t.getThongtinlienhe(), t.getDiachi());
			
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
		int ketqua = 0;
		try {
		    Connection conn = Database.getConnection();
		    Statement st = conn.createStatement();

		    // Tạo câu lệnh UPDATE SQL với điều kiện WHERE
		    String sql = String.format("UPDATE KhachHang SET KhachhangName = '%s', Thongtinlienhe = '%s', Diachi = '%s' WHERE KhachhangID = %d",
		            t.getKhachhangName(), t.getThongtinlienhe(), t.getDiachi(), t.getKhachhangID());

		    // Hiển thị câu lệnh SQL ra màn hình
		    System.out.println(sql);

		    // Thực thi câu lệnh SQL và lấy kết quả
		    ketqua = st.executeUpdate(sql);

		    // Thông báo kết quả
		    if (ketqua > 0) {
		        System.out.println("Bạn đã cập nhật thành công!");
		        System.out.println("Số dòng bị thay đổi: " + ketqua);
		    } else {
		        System.out.println("Không tìm thấy bản ghi nào để cập nhật.");
		    }

		} catch (SQLException e) {
		    e.printStackTrace();
		}
		
		return ketqua;
	}

	@Override
	public int delete(KhachHang t) {
		int ketqua = 0;
		try {
		    Connection conn = Database.getConnection();
		    Statement st = conn.createStatement();

		    // Tạo câu lệnh DELETE SQL với điều kiện WHERE
		    String sql = String.format("DELETE FROM KhachHang WHERE KhachhangID = %d", t.getKhachhangID());

		    // Hiển thị câu lệnh SQL ra màn hình
		    System.out.println(sql);

		    // Thực thi câu lệnh SQL và lấy kết quả
		    ketqua = st.executeUpdate(sql);

		    // Thông báo kết quả
		    if (ketqua > 0) {
		        System.out.println("Bạn đã xóa thành công!");
		        System.out.println("Số dòng bị thay đổi: " + ketqua);
		    } else {
		        System.out.println("Không tìm thấy bản ghi nào để xóa.");
		    }

		} catch (SQLException e) {
		    e.printStackTrace();
		}

		return ketqua;
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
