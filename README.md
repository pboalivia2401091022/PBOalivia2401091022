20-02-25 Mengerjakan materi dasar Java dari Modul 4, meliputi aritmatika, operator relasi, variabel tunggal dan variabel ganda. Kegiatan ini bertujuan untuk memahami bagaimana Java menangani operasi dasar, terutama bagi yang sebelumnya terbiasa menggunakan bahasa pemrograman lain seperti C. Dalam proses ini, saya tidak hanya menyalin kode dari modul, tapi juga mencoba menjalankannya secara langsung dan memahami hasil keluarannya untuk tiap baris perintah.

26-02-25 Melanjutkan latihan di Modul 4 dengan fokus pada penggunaan operator increment (++) dan operator relasi. Menyelesaikan tugas 4.11.1 yang menguji pemahaman tentang bagaimana nilai sebuah variabel berubah akibat operator j++ dan bagaimana hasil logika dari relasi seperti i > j ditampilkan dalam program. Latihan ini juga membantu memahami efek urutan eksekusi terhadap nilai yang dihasilkan.

04-03-25 Mempelajari dan mencoba langsung berbagai jenis operator logika dan kondisi, seperti AND (&&), OR (||), NOT (!), XOR (^), serta ternary operator. Saya memahami bagaimana setiap operator digunakan untuk pengambilan keputusan dalam program, misalnya menentukan hasil lulus/gagal dengan operator ternary: status = (grade >= 60) ? "Passed" : "Fail";. Latihan juga mencakup implementasi operator NOT dan XOR secara praktis. Bagian latihan yang dikerjakan adalah dari soal 4.11.2 hingga 4.11.4.

06-03-25 Fokus pada cara menerima input dari pengguna di Java. Dua metode yang dipelajari adalah menggunakan BufferedReader untuk input berbasis teks di konsol, dan JOptionPane untuk input berbasis GUI. Saya mencoba kedua cara tersebut untuk memahami perbedaan penggunaannya dalam aplikasi console dan desktop. Selain itu, latihan yang terdapat dalam Modul 5 juga diselesaikan untuk memperkuat pemahaman.

11-03-25 Mengulas dan mencoba struktur pengendali alur (control structure) dalam Java seperti if, switch, loop, break, dan do while. Latihan ini bertujuan untuk mengasah logika dalam menentukan kondisi dan pengulangan dalam pemrograman. Semua materi ini terdapat dalam Modul 6 dan diterapkan langsung melalui contoh-contoh kasus dalam latihan.

13-03-25 Melanjutkan latihan Modul 6 yang sebelumnya sudah dimulai. Fokusnya adalah pada soal-soal latihan di bagian akhir modul, yaitu 6.51.1 hingga 6.53.3. Latihan ini dirancang untuk menguji penguasaan terhadap semua struktur kendali program yang telah dipelajari sebelumnya.

18-03-25 Mulai mengerjakan materi dari Modul 7 yang membahas array. Saya membuat array satu dimensi dan mengaksesnya menggunakan perulangan. Latihan yang dikerjakan adalah 7.71.1, 7.71.2, 7.72.1, dan 7.72.2. Melalui latihan ini, saya belajar bagaimana menyimpan banyak data dalam satu variabel bertipe array dan cara memprosesnya menggunakan loop.

20-03-25 Mengerjakan latihan dari Modul 8, yang berisi pembuatan program berbasis command line. Beberapa latihan yang dikerjakan meliputi program menampilkan bilangan ganjil, deret Fibonacci, dan perintah command line lainnya. Latihan ini memperkenalkan interaksi program melalui argumen baris perintah.

10-04-25 Mengerjakan latihan pembuatan class Student, Person, dan StudentExample untuk memahami konsep inheritance atau pewarisan dalam Java. Saya belajar bagaimana sebuah class bisa mewarisi atribut dan method dari class lainnya, serta bagaimana overriding method bekerja dalam hierarki class.

15-04-25, 17-04-25, 24-04-25 Melanjutkan eksplorasi konsep inheritance dan mulai masuk ke topik abstract class. Latihan dari Modul 11 dikerjakan dan seluruh class disusun dalam satu package agar lebih rapi. Dalam tahap ini saya mulai memahami peran abstraksi dalam desain class Java dan bagaimana class abstrak tidak bisa diinstansiasi secara langsung.

22-04-25 Mengerjakan tugas yang diberikan sebelum UTS, yaitu membuat class Pegawai, Pelanggan, dan Warnet. Tugas ini menguji pemahaman tentang konsep pewarisan serta bagaimana menyusun relasi antar class yang saling terhubung dalam satu sistem.

14-05-25 Melanjutkan pembelajaran abstract class dengan membuat class Shape, Square, dan Triangle. Saya mempelajari hubungan antar class dan penerapan polymorphism untuk menangani objek-objek yang memiliki bentuk berbeda namun berada dalam satu struktur class yang sama.

Tugas Modul 10 Membuat aplikasi buku alamat sebagai proyek terpisah. Aplikasi ini terdiri dari dua bagian utama: class entry dan class buku alamat. Class dibagi dalam package terpisah agar lebih mudah dalam pengelolaan dan navigasi.

20-05-25 – sebelum UAS Mengembangkan aplikasi perpustakaan dengan membuat form berbasis Java Swing, meliputi form buku, form anggota, form peminjaman, dan form pengembalian. Semua form ini dikembangkan menggunakan pendekatan MVC (Model-View-Controller) agar struktur program lebih jelas dan modular.

Penjelasan Struktur Aplikasi:

AnggotaDb Aplikasi ini menggunakan pendekatan MVC untuk pengelolaan data anggota. Class Anggota (Model) menyimpan atribut kode, nama, jenis kelamin, dan alamat. Data dikelola oleh DAO menggunakan ArrayList sebagai penyimpanan sementara. Controller mengatur alur logika antara form dan data. Tampilan dibuat dengan Java Swing agar pengguna bisa mengisi data melalui antarmuka grafis yang user-friendly.

BukuDb Query SQL untuk mengelola data buku ditempatkan di dalam class BukuDb. Controller mengambil input dari form, kemudian memprosesnya dan mengirimkannya ke BukuDb. Getter berfungsi mengambil data input dari form, sementara setter digunakan untuk mempersiapkan data yang akan dikirim ke database.

PeminjamanDb Mengelola proses peminjaman buku. Model Peminjaman menyimpan data hubungan antara anggota dan buku, serta tanggal pinjam dan kembali. DAO mengelola penyimpanan data, sedangkan controller menangani logika pembuatan objek peminjaman berdasarkan input pengguna. Form memungkinkan pengguna memilih anggota dan buku lalu mengisi tanggal peminjaman.

PengembalianDb Fitur ini mencatat pengembalian buku menggunakan class Pengembalian yang menyimpan ID pengembalian, data peminjaman terkait, tanggal kembali, jumlah hari keterlambatan, dan denda. DAO bertugas mengelola perhitungan denda dan penyimpanan data. Controller mengatur pengolahan logika seperti menghitung denda otomatis berdasarkan input tanggal. Form berbasis Java Swing digunakan untuk input dan tampilan data pengembalian.
