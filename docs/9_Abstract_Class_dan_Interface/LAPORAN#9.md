# Laporan Praktikum #9 - Abstract Class dan Interface

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu:
1.  Menjelaskan maksud dan tujuan penggunaan Abstract Class;
2.  Menjelaskan maksud dan tujuan penggunaan Interface;
3.  Menerapkan Abstract Class dan Interface di dalam pembuatan program.

## Ringkasan Materi

Abstract Class adalah class  yang tidak dapat diinstansiasi namun dapat di-extend.  Abstract class  baru dapat dimanfaatkan ketika ia di-extend. Interface  adalah struktur data yang hanya berisi  abstract methods. Tidak ada apa-apa selain method abstract pada interface, termasuk atribut getter dan setter.
##  Praktikum

### Percobaan 1: Abstract Class

1. ![percobaan](img/1.PNG)
2. ![percobaan](img/2.PNG)
3. ![percobaan](img/3.PNG)
4. ![percobaan](img/4.PNG)
5. ![percobaan](img/5.PNG)

link kode program : 

[ini link ke kode program Hewan](../../src/9_Abstract_Class_dan_Interface/src/pbominggu9/abstractclass1841720049Nurus/Hewan_1841720049Nurus.java)

[ini link ke kode program Kucing](../../src/9_Abstract_Class_dan_Interface/src/pbominggu9/abstractclass1841720049Nurus/Kucing_1841720049Nurus.java)

[ini link ke kode program Ikan](../../src/9_Abstract_Class_dan_Interface/src/pbominggu9/abstractclass1841720049Nurus/Ikan_1841720049Nurus.java)

[ini link ke kode program Orang](../../src/9_Abstract_Class_dan_Interface/src/pbominggu9/abstractclass1841720049Nurus/Orang_1841720049Nurus.java)

[ini link ke kode program main](../../src/9_Abstract_Class_dan_Interface/src/pbominggu9/abstractclass1841720049Nurus/Program_1841720049Nurus.java)

Pertanyaan diskusi:
Bolehkah apabila sebuah  class  yang meng-extend  suatu abstract  class  tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!

Jawab : Tidak boleh , karena saat kita sudah meng-extends suatu method berarti kita sudah mengimplementasikan method abstract yang ada di class induknya. Buktinya sudah terdapat pada praktikum diatas.

### Percobaan 2: Interface

1. ![percobaan](img/6.PNG)
2. ![percobaan](img/7.PNG)
3. ![percobaan](img/8.PNG)
4. ![percobaan](img/9.PNG)
5. ![percobaan](img/10.PNG)
5. ![percobaan](img/11.PNG)

link kode program : 

[ini link ke kode program ICumlaude](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/ICumlaude_1841720049Nurus.java)

[ini link ke kode program Mahasiswa](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Mahasiswa_1841720049Nurus.java)

[ini link ke kode program Sarjana](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Sarjana_1841720049Nurus.java)

[ini link ke kode program Pasca Sarjana](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/PascaSarjana_1841720049Nurus.java)

[ini link ke kode program Rektor](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Rektor_1841720049Nurus.java)

[ini link ke kode program main](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Program_1841720049Nurus.java)

Pertanyaan diskusi: 
a.  Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

Jawab : dikarenakan pada class mahasiswa perlu kita implements pula

b.  Dapatkah method  kuliahDiKampus()  dipanggil dari objek  sarjanaCumlaude  di  class Program? Mengapa demikian? 

Jawab : Dapat, karena pada class Sarjana sudah di instansiasi menjadi object sajanaCumlaude di class Program. Dan class Sarjana sudah ter-extends dengan class Mahasiswa

c.  Dapatkah  method  kuliahDiKampus()  dipanggil dari parameter  mahasiswa  di method beriSertifikatCumlaude( pada class Rektor? Mengapa demikian?

Jawab : tidak dapat dikarenakan pada class rektor belum kita beri extends maupun instansiasi, meskipun menggunakan parameter mahasiswa tetapi parameter tersebut hanya menghubungkan untuk class interface ICumlaude

d.  Modifikasilah method  beriSertifikatCumlaude() pada  class  Rektor  agar hasil eksekusi class Program menjadi seperti berikut ini: 

![percobaan](img/18.PNG)

Jawab : ![percobaan](img/19.PNG)

### Percobaan 3: Multiple Interfaces Implementation

1. ![percobaan](img/12.PNG)
2. ![percobaan](img/13.PNG)
3. ![percobaan](img/14.PNG)
4. ![percobaan](img/15.PNG)
5. ![percobaan](img/16.PNG)
5. ![percobaan](img/17.PNG)

link kode program : 

[ini link ke kode program IBerprestasi](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/IBerprestasi_1841720049Nurus.java)

[ini link ke kode program Mahasiswa](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Mahasiswa_1841720049Nurus.java)

[ini link ke kode program Sarjana](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Sarjana_1841720049Nurus.java)

[ini link ke kode program Pasca Sarjana](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/PascaSarjana_1841720049Nurus.java)

[ini link ke kode program Rektor](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Rektor_1841720049Nurus.java)

[ini link ke kode program main](../../src/9_Abstract_Class_dan_Interface/src/interfacelatihan/Program_1841720049Nurus.java)

Pertanyaan diskusi:
Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah  class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude

Jawab :
![percobaan](img/20.PNG)
![percobaan](img/21.PNG)
![percobaan](img/22.PNG)

## Kesimpulan

Abstract Class adalah class  yang tidak dapat diinstansiasi namun dapat di-extend sedangkan Interface adalah struktur data yang hanya berisi  abstract methods.
Saya sebenarnya kurang sedikit paham pada abstrac class dan interface ini.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***Nurus Laily Aprillia***