public class PersonBeraksi{
    public static void main(String[] args){
    // Membuat object
    Person Anto = new Person();
    Person Riko = new Person();
    /* memanggil atribut dan memberi nilai */
    Anto.setNama("Anto");
    Anto.setJenisKelamin("Laki-laki");
    Anto.setUmur(18);

    Riko.setNama("Riko");
    Riko.setJenisKelamin("Laki-laki");
    Riko.setUmur(19);
    System.out.println("Nama: " + Anto.getNama());
    System.out.println("Jenis Kelamin: " + Anto.getJenisKelamin());
    System.out.println("Umur: " + Anto.getUmur());
    System.out.println("======================================");
    System.out.println("Nama: " + Riko.getNama());
    System.out.println("Jenis Kelamin: " + Riko.getJenisKelamin());
    System.out.println("Umur: " + Riko.getUmur());
    }
    }