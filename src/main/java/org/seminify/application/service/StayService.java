package org.seminify.application.service;

import org.seminify.application.model.entity.StayEntity;
import org.seminify.application.repository.StayRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StayService {
    private final StayRepository stayRepository;

    public Page<StayEntity> findAll(Pageable pageable) {
        return stayRepository.findAll(pageable);
    }
}
