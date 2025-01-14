package org.seminify.application.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.seminify.application.model.dto.RoomDTO;
import org.seminify.application.model.vo.RoomVO;
import org.springframework.data.domain.Pageable;

@Mapper
public interface RoomMapper {
    List<RoomVO> findAll(@Param("roomDTO") RoomDTO roomDTO, @Param("pageable") Pageable pageable);

    long count(RoomDTO roomDTO);
}
