package com.example.book.apicrud.entities;

import javax.persistence.*;

@Entity
@Table(name = "buku")
public class BukuEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String bukuid;
    private String judul;
    private String kategori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBukuid() {
        return bukuid;
    }

    public void setBukuid(String bukuid) {
        this.bukuid = bukuid;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "BukuEntity{" +
                "id=" + id +
                ", bukuid='" + bukuid + '\'' +
                ", judul='" + judul + '\'' +
                ", kategori='" + kategori + '\'' +
                '}';
    }
}
