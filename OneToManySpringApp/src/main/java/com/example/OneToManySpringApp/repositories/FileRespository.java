package com.example.OneToManySpringApp.repositories;

import com.example.OneToManySpringApp.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRespository extends JpaRepository<File, Long> {
}
