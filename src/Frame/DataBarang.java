package inventory;

public class DataBarang {
    private String IdBarang;
    private String NamaBarang;
    private String Kategori;
    private int Total;
    private int Stok;
    
    public void Databarang(String IdBarang, String NamaBarang, String Kategori, int Total, int Stok){
        this.IdBarang = IdBarang;
        this.NamaBarang = NamaBarang;
        this.Kategori = Kategori;
        this.Total = Total;
        this.Stok = Stok;
    }
    
    public void setIdBarang(String IdBarang){
        this.IdBarang = IdBarang;
    }
    
    public String getIdBarang(){
        return IdBarang;
    }
    
    public void setNamaBarang(String NamaBarang){
        this.NamaBarang = NamaBarang;
    }
    
    public String getNamaBarang(){
        return NamaBarang;
    }
    
    public void setKategori(String Kategori){
        this.Kategori = Kategori;
    }
    
    public String getKategori(){
        return Kategori;
    }
    
    public void setTotal(int Total){
        this.Total = Total;
    }
    
    public int getTotal(){
        return Total;
    }
    
    public void setStok(int Stok){
        this.Stok = Stok;
    }
    
    public int getStok(){
        return Stok;
    }
}
