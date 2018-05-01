package com.mediaanda.southsumatera.Fragment;

import java.util.List;

public class Destination {
    private String name, description;
    int photoId;

    public Destination(String name, String description, int photoId){
        this.name = name;
        this.description = description;
        this.photoId = photoId;
    }

    private List<Destination> destinationList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }


}
