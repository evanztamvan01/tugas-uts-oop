package entity;

public class StokLaptop {
    private String id;
    private String nama;
    private String merk;
    private String tipe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public StokLaptop(String id, String nama, String merk, String tipe) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.tipe = tipe;
    }


    public boolean equals(Object object) {
        StokLaptop temp = (StokLaptop) object;
        return id.equals(temp.getId());
    }
}