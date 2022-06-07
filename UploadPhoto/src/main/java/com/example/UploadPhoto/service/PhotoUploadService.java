package com.example.UploadPhoto.service;

import com.example.UploadPhoto.model.PhotoUpload;
import com.example.UploadPhoto.repository.PhotoUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class PhotoUploadService {
    @Autowired
    private  PhotoUploadRepository photoUploadRepository;

    public PhotoUpload store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        PhotoUpload FileDB = new PhotoUpload(fileName, file.getContentType(), file.getBytes());

        return photoUploadRepository.save(FileDB);
    }

    public PhotoUpload getFile(String id) {
        return photoUploadRepository.findById(id).get();
    }

    public Stream<PhotoUpload> getAllFiles() {
        return photoUploadRepository.findAll().stream();
    }
}
