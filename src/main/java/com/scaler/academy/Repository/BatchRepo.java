package com.scaler.academy.Repository;

import com.scaler.academy.Entities.BatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BatchRepo extends JpaRepository<BatchEntity,Integer> {
}
