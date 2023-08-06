package com.scaler.academy.Repository;

import com.scaler.academy.Entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity , Integer> {

}
