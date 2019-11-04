# Laporan Praktikum #10 - Polimorfisme

## Kompetensi

Setelah melakukan percobaan pada jobsheet ini, diharapkan mahasiswa 
mampu:
1.  Memahami konsep dan bentuk dasar polimorfisme
2.  Memahami konsep virtual method invication
3.  Menerapkan polimorfisme pada pembuatan heterogeneous collection
4.  Menerapkan polimorfisme pada parameter/argument method
5.  Menerapkan object casting untuk meng-ubah bentuk objek

## Ringkasan Materi

Polimorfisme merupakan kemampuan suatu objek untuk memiliki banyak bentuk. Penggunaan polimorfisme yang paling umum dalam  OOP terjadi ketika ada referensi super class yang digunakan untuk merujuk ke objek dari sub class. Dengan kata lain, ketika ada suatu objek yang dideklarasikan dari super class, maka objek tersebut bisa diinstansiasi sebagai objek dari sub class. Dari uraian tersebut bisa dilihat bahwa konsep polimorfisme bisa diterapkan pada class-class yang memiliki relasi inheritance  (relasi generalisasi atau IS-A).

##  Praktikum

### Percobaan 1 - Bentuk Dasar Polimorfisme

1. ![percobaan](img/1.PNG)
2. ![percobaan](img/2.PNG)
3. ![percobaan](img/3.PNG)
4. ![percobaan](img/4.PNG)
5. ![percobaan](img/5.1.PNG)
6. ![percobaan](img/5.2.PNG)
7. ![percobaan](img/6.PNG)

link kode program : 

[ini link ke kode program Employee](../../src/10_Polimorfisme/Employee1841720049Nurus.java)

[ini link ke kode program interface payable](../../src/10_Polimorfisme/IPayable1841720049Nurus.java)

[ini link ke kode program internship payable](../../src/10_Polimorfisme/InternshipEmployee1841720049Nurus.java)

[ini link ke kode program permanent employee](../../src/10_Polimorfisme/PermanentEmployee1841720049Nurus.java)

[ini link ke kode program electricity bill](../../src/10_Polimorfisme/ElectricityBill1841720049Nurus.java)

[ini link ke kode program main](../../src/10_Polimorfisme/Tester1_1841720049Nurus.java)

## Pertanyaan :
1.  Class apa sajakah yang merupakan turunan dari class Employee?

Jawab : 

2.  Class apa sajakah yang implements ke interface Payable?

Jawab :

3.  Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp  (merupakan objek dari class PermanentEmployee) dan objek iEmp(merupakan objek dari class InternshipEmploye) ? 

Jawab :

4.  Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objek pEmp  (merupakan objek dari class PermanentEmployee) dan objek eBill(merupakan objek dari class ElectricityBill) ?

Jawab :

5.  Coba tambahkan sintaks:
p = iEmp;
e = eBill;
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?

Jawab :

6.  Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!

Jawab :

### Percobaan 2 - Virtual Method Invocation

1. ![percobaan](img/7.PNG)

link kode program : 

[ini link ke kode program main](../../src/10_Polimorfisme/Tester2_1841720049Nurus.java)

## Pertanyaan 
1.  Perhatikan class  Tester2  di atas,  mengapa pemanggilan e.getEmployeeInfo()  pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10  menghasilkan hasil sama? 

Jawab :

2.  Mengapa pemanggilan method e.getEmployeeInfo()  disebut sebagai pemanggilan  method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?

Jawab :

3.  Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?

Jawab :

### Percobaan 3 - Heterogenous Collection

1. ![percobaan](img/8.PNG)

link kode program : 

![ini link ke kode program main](../../src/10_Polimorfisme/Tester3_1841720049Nurus.java)

## Pertanyaan 

1.  Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp(objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ?

Jawab :

2.  Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ?

Jawab :

3.  Perhatikan baris ke-10, mengapa terjadi error?

Jawab : Dikarenakan objek eBill tidak terdapat pada Employee, maka harusnya diubah menjadi ![percobaan](img/8.1.PNG)

### Percobaan 4 - Argumen Polimorfisme, Instanceod dan Casting Object

1. ![percobaan](img/8.PNG)

link kode program : 

![ini link ke kode program main](../../src/10_Polimorfisme/Tester3_1841720049Nurus.java)

## Pertanyaan
1. Perhatikan class Tester4  baris ke-7  dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable? Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill  dan pEmp merupakan objek dari PermanentEmployee?

Jawab : 

2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?

Jawab :

3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp);

Jawab : ![percobaan](img/19.PNG)
Mengapa terjadi error? 

4.  Perhatikan class  Owner,  diperlukan  untuk apakah sintaks  p instanceof ElectricityBill pada baris ke-6 ?

Jawab :

5.  Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?

Jawab :

### Tugas
1. ![percobaan](img/9.PNG)
2. ![percobaan](img/10.1.PNG)
3. ![percobaan](img/10.2.PNG)
4. ![percobaan](img/11.PNG)
5. ![percobaan](img/12.PNG)
6. ![percobaan](img/13.PNG)
7. ![percobaan](img/14.PNG)
8. ![percobaan](img/15.PNG)
9. ![percobaan](img/16.PNG)
10. ![percobaan](img/17.PNG)
11. ![percobaan](img/18.PNG)

link kode program : 

![ini link ke kode program zombie](../../src/10_Polimorfisme/Zombie1841720049Nurus.java)

![ini link ke kode program interface destroyable](../../src/10_Polimorfisme/IDestroyable1841720049Nurus.java)

![ini link ke kode program barrier](../../src/10_Polimorfisme/Barrier1841720049Nurus.java)

![ini link ke kode program walking zombie](../../src/10_Polimorfisme/WalkingZombie1841720049Nurus.java)

![ini link ke kode program jumping zombie](../../src/10_Polimorfisme/JumpingZombie1841720049Nurus.java)

![ini link ke kode program main](../../src/10_Polimorfisme/Plant1841720049Nurus.java)

## Kesimpulan

Abstract Class adalah class  yang tidak dapat diinstansiasi namun dapat di-extend sedangkan Interface adalah struktur data yang hanya berisi  abstract methods.
Saya sebenarnya kurang sedikit paham pada abstrac class dan interface ini.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***Nurus Laily Aprillia***