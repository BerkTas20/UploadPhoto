package com.example.UploadPhoto.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponsePhotoUpload {
    private String name;
    private String url;
    private String type;
    private long size;
}
