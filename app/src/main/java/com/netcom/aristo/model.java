package com.netcom.aristo;

public class model
{
 int img;
 String imag_name;

    public model(int img, String imag_name) {
        this.img = img;
        this.imag_name = imag_name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getImag_name() {
        return imag_name;
    }

    public void setImag_name(String imag_name) {
        this.imag_name = imag_name;
    }
}
