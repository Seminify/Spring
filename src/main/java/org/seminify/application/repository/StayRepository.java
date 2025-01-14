package org.seminify.application.repository;

import org.seminify.application.model.entity.StayEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StayRepository extends JpaRepository<StayEntity, String> {
}
