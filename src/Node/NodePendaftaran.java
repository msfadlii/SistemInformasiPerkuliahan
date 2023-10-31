package Node;

import java.time.LocalDate;

public class NodePendaftaran {
    LocalDate tgl;
    NodeMahasiswa nMhs;
    NodeWaliMhs nWaliMhs;
    NodeJurusan nJurusan;
    NodePembayaranHer nPembHer;

    public NodePendaftaran(LocalDate tgl, NodeMahasiswa nMhs, NodeWaliMhs nWaliMhs, NodeJurusan nJurusan, NodePembayaranHer nPembHer) {
        this.tgl = tgl;
        this.nMhs = nMhs;
        this.nWaliMhs = nWaliMhs;
        this.nJurusan = nJurusan;
        this.nPembHer = nPembHer;
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

    public NodePembayaranHer getnPembHer() {
        return nPembHer;
    }
}