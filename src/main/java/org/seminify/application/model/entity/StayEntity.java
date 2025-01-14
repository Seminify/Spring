package org.seminify.application.model.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "stay")
@Data
@ToString(exclude = "rooms")
public class StayEntity {
    @Id
    private String id;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "stay")
    private List<RoomEntity> rooms;
}
