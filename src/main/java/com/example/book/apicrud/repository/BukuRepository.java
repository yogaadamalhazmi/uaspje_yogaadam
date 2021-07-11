package com.example.book.apicrud.repository;

import com.example.book.apicrud.entities.BukuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BukuRepository extends JpaRepository<BukuEntity, Integer> {
}
