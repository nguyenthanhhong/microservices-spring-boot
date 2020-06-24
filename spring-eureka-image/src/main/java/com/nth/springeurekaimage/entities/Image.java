package com.nth.springeurekaimage.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image {
    private int id;
    private String name;
    private String url;
}
