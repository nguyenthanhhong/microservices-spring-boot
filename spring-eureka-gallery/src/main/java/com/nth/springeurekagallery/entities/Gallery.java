package com.nth.springeurekagallery.entities;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Gallery {
    private int id;
    private List<Object> images;

    public Gallery(int galleryId) {
        this.id = galleryId;
    }
}
