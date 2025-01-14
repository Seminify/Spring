package org.seminify.application.controller;

import org.seminify.application.model.entity.StayEntity;
import org.seminify.application.service.StayService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequestMapping("stay")
@RestController
@RequiredArgsConstructor
@Log4j2
public class StayController {
    private final StayService stayService;

    @GetMapping
    public Page<StayEntity> findAll(Pageable pageable) {
        return stayService.findAll(pageable);
    }
}
