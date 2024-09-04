package modal;

public class KhachHang {
	private int KhachhangID;
	private String KhachhangName;
	private String Thongtinlienhe;
	private String Diachi;
	
	public KhachHang() {
		super();
	}
		
	public int getKhachhangID() {
		return KhachhangID;
	}

	public void setKhachhangID(int khachhangID) {
		KhachhangID = khachhangID;
	}

	public String getKhachhangName() {
		return KhachhangName;
	}

	public void setKhachhangName(String khachhangName) {
		KhachhangName = khachhangName;
	}

	public String getThongtinlienhe() {
		return Thongtinlienhe;
	}

	public void setThongtinlienhe(String thongtinlienhe) {
		Thongtinlienhe = thongtinlienhe;
	}

	public String getDiachi() {
		return Diachi;
	}

	public void setDiachi(String diachi) {
		Diachi = diachi;
	}

	public KhachHang(int KhachhangID, String KhachhangName, String Thongtinlienhe, String Diachi) {
		super();
		this.KhachhangID = KhachhangID;
		this.KhachhangName = KhachhangName;
		this.Thongtinlienhe = Thongtinlienhe;
		this.Diachi = Diachi;
	}
}
