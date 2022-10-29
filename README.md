# Tugas Pertemuan 5
## Pemrograman Orientasi Objek

```sh
Nama   : Raihan Tantowi
Nim    : 312110229
Matkul : Pemrograman Orientasi Objek
```

### 1. File Person.java
program File person.java ini adalah membuat class Person lalu membuat 2 buah objek yang bernama Antor dan Riko dan pastinya membuat 2 file dengan codingan yang berbeda, file 1 untuk pendeklarasian class dan file 2 untuk membuat objek nya, masing - masing objek tersebut memiliki atribut seperti nama, Jeniskelamin, dan umur, lalu atribut ini akan dijadikan sebuah *"inputan"* yang nantinya akan menghasilkan sebuah *"output"*.

* **CODINGAN FILE 1 (Person.java):**
```java
public class Person {
    private String nama;
    private String jeniskelamin;
    private int umur;
    // setter
    public void setNama(String nama) {
    this.nama = nama;
    }
    public void setJenisKelamin(String jeniskelamin) {
    this.jeniskelamin = jeniskelamin;
    }
    public void setUmur(int umur) {
    this.umur = umur;
    }
    // getter
    public String getNama() {
    return this.nama;
    }
    public String getJenisKelamin() {
    return this.jeniskelamin;
    }
    public int getUmur() {
    return this.umur;
    }
    }
```


### 2. Folder Latihan 2
Program latihan 2 ini adalah membuat *"class"* yang bernama AkunBank dan kemudian membuat sebuah *"objek"* yang bernama AkunBankk dengan menetapkan nilai saldo awal Rp. 100000, program ini dibuat dengan mengaplikasikan penggunaan *"instance method"* yang kemudian method tersebut akan di panggil dan akan menampilkan sebuah ouput dari method tersebut, berikut adalah 3 instance method dari sebuah program : 
```md
* Method **simpanUang()** 
* Method **ambilUang()** 
* Method **cekSaldo()** 
```


* **Hasil output program:**

![Gambar 1](Screenshoot/ss1.png)
