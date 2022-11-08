package com.api.lifetravel.review.domain.persistence;

import com.api.lifetravel.review.domain.model.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{
    Review findByName(String Name);
}
