package Node;

import java.time.LocalDate;
import java.util.ArrayList;

public class NodePendaftaran {
    LocalDate tgl;
    NodeMahasiswa nMhs;
    NodeWaliMhs nWaliMhs;
    NodeJurusan nJurusan;
    String nPembHer;
    public ArrayList<NodePendaftaran> arrPendaft;

    public NodePendaftaran(LocalDate tgl, NodeMahasiswa nMhs, NodeWaliMhs nWaliMhs, NodeJurusan nJurusan) {
        this.tgl = tgl;
        this.nMhs = nMhs;
        this.nWaliMhs = nWaliMhs;
        this.nJurusan = nJurusan;
    }  
    
    public NodePendaftaran(){
        this.arrPendaft = new ArrayList<>();
    }

    public LocalDate getTgl() {
        return tgl;
    }

    public NodeMahasiswa getnMhs() {
        return nMhs;
    }

    public NodeWaliMhs getnWaliMhs() {
        return nWaliMhs;
    }

    public NodeJurusan getnJurusan() {
        return nJurusan;
    }

    public String getnPembHer() {
        return nPembHer;
    }

    public void setnPembHer(String nPembHer) {
        this.nPembHer = nPembHer;
    }

    public void setTgl(LocalDate tgl) {
        this.tgl = tgl;
    }

    public void setnMhs(NodeMahasiswa nMhs) {
        this.nMhs = nMhs;
    }

    public void setnWaliMhs(NodeWaliMhs nWaliMhs) {
        this.nWaliMhs = nWaliMhs;
    }

    public void setnJurusan(NodeJurusan nJurusan) {
        this.nJurusan = nJurusan;
    }
}