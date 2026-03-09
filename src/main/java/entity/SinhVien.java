package entity;

public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private float diemTrungBinh;
    private int kyHoc;
    private String chuyenNganh;

    public SinhVien(String maSV, String ten, int tuoi, float diemTrungBinh, int kyHoc, String chuyenNganh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTrungBinh = diemTrungBinh;
        this.kyHoc = kyHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public SinhVien() {
    }

    public String getTen() {
        return ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
