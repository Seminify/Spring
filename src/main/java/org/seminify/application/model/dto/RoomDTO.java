package org.seminify.application.model.dto;

import org.seminify.application.model.Room;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class RoomDTO extends Room {
}
