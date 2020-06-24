package com.nth.springeurekagallery.entities;

import lombok.Data;

import java.util.List;

@Data
public class Gallery {
    private int id;
    private List<Object> images;
}
