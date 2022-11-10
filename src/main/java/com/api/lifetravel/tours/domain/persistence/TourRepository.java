package com.api.lifetravel.tours.domain.persistence;
import com.api.lifetravel.tours.domain.model.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {
}
