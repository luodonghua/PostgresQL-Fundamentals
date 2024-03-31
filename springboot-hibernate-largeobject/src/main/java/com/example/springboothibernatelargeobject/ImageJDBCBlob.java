package com.example.springboothibernatelargeobject;


public class ImageJDBCBlob {
   private String imageName;
   private byte[] imageData;
   
    public ImageJDBCBlob() {
    }

    public ImageJDBCBlob(String imageName, byte[] imageData) {
        this.imageName = imageName;
        this.imageData = imageData;
    }

   public String getImageName() {
        return imageName;
    }

    public byte[] getImageData() {
        return imageData;
    }
   
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

}