package com.deepak.captionyourimage.modal;

import android.net.Uri;

/**
 * Created by Deepak Kumar on 24-05-2018.
 * Modal class
 */

public class ImgCap {

    private int position;
    private String caption;
    private Uri imagePath;

    public ImgCap(int position, String caption, Uri imagePath) {
        this.position = position;
        this.caption = caption;
        this.imagePath = imagePath;
    }

    public int getPosition() {
        return position;
    }

    public String getCaption() {
        return caption;
    }

    public Uri getImagePath() {
        return imagePath;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setImagePath(Uri imagePath) {
        this.imagePath = imagePath;
    }
}
