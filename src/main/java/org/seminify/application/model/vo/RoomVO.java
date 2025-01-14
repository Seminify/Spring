package org.seminify.application.model.vo;

import org.seminify.application.model.Room;
import org.seminify.application.model.Stay;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RoomVO extends Room {
    private Stay stay;
}
