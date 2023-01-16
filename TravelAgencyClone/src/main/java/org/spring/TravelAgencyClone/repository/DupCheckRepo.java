package org.spring.TravelAgencyClone.repository;

import org.spring.TravelAgencyClone.entity.DupCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DupCheckRepo extends JpaRepository<DupCheckEntity, Long> {

}
