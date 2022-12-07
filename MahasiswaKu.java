
package genericp9;

class Mahasiswa<I,N,C>{
    private I nim;
    private N name;
    private C clas;
    
    public void setMahasiswa(I nim, N name, C clas){
        this.nim = nim;
        this.name = name;
        this.clas = clas;
    }
    
    public I getNim(){
        return nim;
    }
    public N getName(){
        return name;
    }
    public C getClas(){
        return clas;
    }
}

public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa <String,String,Integer> m = new Mahasiswa<>();
        m.setMahasiswa("201011", "Ario", 12);
        
        System.out.println(m.getName());
        System.out.println(m.getNim());
        System.out.println(m.getClas());
    }
}
