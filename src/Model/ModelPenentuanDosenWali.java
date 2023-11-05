package Model;

import Node.NodeDosenWali;
import Node.NodeMahasiswa;
import View.Menu.MainClass;

public class ModelPenentuanDosenWali {
    public void hubungkanMhsDosWal(String npm, String nip){
        NodeDosenWali doswal= null;
        for (int i = 0; i < MainClass.mDosWal.nDosenWali.arrDosenWali.size(); i++) {
            if(nip.equals(MainClass.mDosWal.nDosenWali.arrDosenWali.get(i).getNip())){
                doswal = MainClass.mDosWal.nDosenWali.arrDosenWali.get(i);
            }
        }
        for (int i = 0; i < MainClass.mMhs.nMhs.arrMahasiswa.size(); i++) {
            if(npm.equals(MainClass.mMhs.nMhs.arrMahasiswa.get(i).getNpm())){
                //mhs = MainClass.mMhs.nMhs.arrMahasiswa.get(i);
                MainClass.mMhs.nMhs.arrMahasiswa.get(i).setDosWal(doswal);
            }
        }
    }
}
