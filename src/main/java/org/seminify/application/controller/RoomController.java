package org.seminify.application.controller;

import org.seminify.application.model.dto.RoomDTO;
import org.seminify.application.model.vo.RoomVO;
import org.seminify.application.service.RoomService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequestMapping("stay/{stayId}/room")
@RestController
@RequiredArgsConstructor
@Log4j2
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    public Page<RoomVO> findAll(RoomDTO roomDTO, Pageable pageable) {
        return roomService.findAll(roomDTO, pageable);
    }
}
