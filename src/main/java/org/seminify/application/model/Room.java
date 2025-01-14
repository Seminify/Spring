package org.seminify.application.model;

import lombok.Data;

@Data
public class Room {
    private int id;
    private String name;
    private String squareMeter;
    private String stayId;
}
