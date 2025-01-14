package org.seminify.application.service;

import org.seminify.application.mapper.RoomMapper;
import org.seminify.application.model.dto.RoomDTO;
import org.seminify.application.model.vo.RoomVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomMapper roomMapper;

    public Page<RoomVO> findAll(RoomDTO roomDTO, Pageable pageable) {
        return new PageImpl<>(roomMapper.findAll(roomDTO, pageable), pageable, roomMapper.count(roomDTO));
    }
}
