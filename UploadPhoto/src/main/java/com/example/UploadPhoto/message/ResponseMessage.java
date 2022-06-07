package com.example.UploadPhoto.message;

public class ResponseMessage {
    String message;

    public ResponseMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
