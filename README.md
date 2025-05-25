Nama: Sylvasisca Andini Faradyan
NIM: 235150707111040
Kelas: Pengembangan Aplikasi Mobile, TI-C

DESKRIPSI TUGAS:
Membuat aplikasi menggunakan retrofit untuk menampilkan data dari 

https://jsonplaceholder.typicode.com/posts

Halaman 1 :  tampilkan list dalam recyclerview (https://jsonplaceholder.typicode.com/posts) ;
Halaman 2 :  tampilkan 1 post yang di click dari recyclerview (https://jsonplaceholder.typicode.com/posts/{id} )

Tampilkan nim dan nama di bagian atas halaman

Kumpulkan url project gitlab/github


PENJELASAN:
Aplikasi terdiri dari dua halaman utama. Halaman pertama (MainActivity) menampilkan daftar postingan dalam bentuk RecyclerView, di mana data diambil menggunakan Retrofit dari endpoint /posts. Setiap item pada daftar dapat diklik dan akan menampilkan halaman kedua (DetailActivity) yang menampilkan detail lengkap dari postingan tersebut, menggunakan endpoint /posts/{id}. Data ditampilkan secara dinamis berdasarkan item yang dipilih

Struktur programnya sendiri terdiri dari beberapa file utama, yaitu:
- MainActivity.kt dan DetailActivity.kt sebagai halaman utama dan detail
- ApiService.kt sebagai interface untuk Retrofit
- Post.kt sebagai data class model
- PostAdapter.kt sebagai adapter untuk RecyclerView. 

Semua file Kotlin berada di dalam package com.example.tugas4. 
Untuk tampilan antarmuka, terdapat tiga file layout XML yaitu activity_main.xml, activity_detail.xml, dan item_post.xml, masing-masing digunakan untuk tampilan halaman utama, halaman detail, dan item pada daftar RecyclerView