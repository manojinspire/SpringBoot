package com.scaler.academy.Repository;

import com.scaler.academy.Entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<StudentEntity , Integer> {

}
