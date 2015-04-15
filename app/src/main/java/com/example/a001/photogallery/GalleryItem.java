package com.example.a001.photogallery;

/**
 * Created by a001 on 2015/4/15.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;

    public String toString() {

        return mCaption;
    }

    public String getCaption() {
        return mCaption;
    }

    public String getId() {
        return mId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public void setId(String id) {
        mId = id;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}