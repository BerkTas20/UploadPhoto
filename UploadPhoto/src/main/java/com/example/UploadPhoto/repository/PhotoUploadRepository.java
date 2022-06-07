package com.example.UploadPhoto.repository;

import com.example.UploadPhoto.model.PhotoUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoUploadRepository extends JpaRepository<PhotoUpload,String> {
}
