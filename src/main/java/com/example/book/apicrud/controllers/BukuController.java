package com.example.book.apicrud.controllers;

import com.example.book.apicrud.entities.BukuEntity;
import com.example.book.apicrud.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Buku")

public class BukuController {

    @Autowired
    BukuRepository bukuRepository;

    @GetMapping(value = "checkAPI")
    public String checkApi(){
        return "Hello World";
    }

    @PostMapping(value = "addNewBuku")
    public BukuEntity addNewBuku(@RequestBody BukuEntity param){

        bukuRepository.save(param);
        return param;
    }

    @GetMapping(value = "getAllBuku")
    public List<BukuEntity> getAllBuku(){
        return bukuRepository.findAll();
    }

    @GetMapping(value = "getById")
    public BukuEntity getById(@RequestParam int id){
        return bukuRepository.findById(id).get();
    }

    @PostMapping(value = "updateBuku")
    public BukuEntity updateBuku(@RequestBody BukuEntity param){
        return bukuRepository.save(param);
    }

    @GetMapping(value = "deleteBuku")
    public String deleteBuku(@RequestParam int id){
        bukuRepository.deleteById(id);
        return "Success Delete Buku id: "+id;
    }

}
