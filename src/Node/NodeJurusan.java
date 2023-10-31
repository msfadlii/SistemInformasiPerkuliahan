package Node;

public class NodeJurusan {
    int kode_jurusan;
    String nama_jurusan;
    String nama_fakultas;

    public NodeJurusan(int kode_jurusan, String nama_jurusan, String nama_fakultas) {
        this.kode_jurusan = kode_jurusan;
        this.nama_jurusan = nama_jurusan;
        this.nama_fakultas = nama_fakultas;
    }
    
    public void viewJurusan(){
        System.out.println("Kode Jurusan  : "+this.kode_jurusan);
        System.out.println("Nama Jurusan  : "+this.nama_jurusan);
        System.out.println("Nama Fakultas : "+this.nama_fakultas);
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_fakultas(String nama_fakultas) {
        this.nama_fakultas = nama_fakultas;
    }
}
