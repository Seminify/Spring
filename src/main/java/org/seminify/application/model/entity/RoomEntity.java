package org.seminify.application.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "room")
@Data
@ToString(exclude = "stay")
public class RoomEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private String squareMeter;
    @JsonIgnore
    @JoinColumn(name = "stay_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private StayEntity stay;
}
