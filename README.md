Saya Ihsan Ghozi Zulfikar NIM 2103303 mengerjakan soal Latihan Praktikum 7 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

## Deskripsi
Modiﬁkasi kode yang sudah diberikan, dengan ketentuan sebagai berikut:
● Pemain mengendalikan bola. Setiap kali bola bergerak, skor pemain
bertambah +1.
● Skor hanya bertambah jika pemain berbelok, bukan bergerak berurutan.
Detail:
- Saat pertama kali membuka program, pemain bergerak ke arah
manapun, skor +1.
- Setelah pemain bergerak, dia harus bergerak ke arah lain agar
skornya +1. Jika menekan tombol yang sama, skor tetap (+0).
- Contoh, pemain membuka program, lalu bergerak ke kanan dan
berhenti, maka skor bertambah +1. Jika pemain bergerak ke arah
atas, bawah, atau kiri, maka skor bertambah +1. Namun, jika
pemain bergerak ke kanan lagi, maka skor +0.
- Bagaimana jika urutannya, kanan - atas - kiri - kanan? Kanan yang
kedua tetap +1, karena pergerakan pemain sebelumnya adalah kiri,
sehingga tidak dianggap berurutan.
- [BONUS] Buatlah sistem game yang menambahkan satu kotak atau objek
apapun secara acak. Jika pemain menyentuh objek tersebut, skor
bertambah +5 atau +10, lalu objek akan berpindah lagi ke posisi lain secara
acak.
- Belajar untuk meng-compile secara manual, bukan di-run via IDE. Hal ini
bertujuan untuk membantu saat presentasi TMD nanti.

## Desain
Program terdiri darai 9 kelas yaitu:
1. Synchronization
- program main, memanggil Game
- memiliki Game
2. Game
- render dan loop program
- memiliki Display, Handler, Controller, Player, Food, Thread
3. Controller
- mengontrol key inputan
- memiliki Game, Handler
4. Handler
- render, loop, tambah, dan hapus objek


## Dokumentasi
![ss2](https://user-images.githubusercontent.com/100748074/233686228-31a2d9d1-a191-42e1-9132-d397b332c631.PNG)
