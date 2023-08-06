package com.scaler.academy.Service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.scaler.academy.Entities.BatchEntity;
import com.scaler.academy.Models.Batch;
import com.scaler.academy.Models.Student;
import com.scaler.academy.Repository.BatchRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@NoArgsConstructor(force = true)

@Service
public class BatchService {

    private final BatchRepo batchRepo ;


    private final ObjectMapper objectMapper;


    public void addBatch(Batch batch) {



        BatchEntity batchEntity = objectMapper.convertValue(batch, BatchEntity.class) ;
        batchRepo.save(batchEntity) ;
    }

    public void updateBatch(Batch batch) {



    }

    public Student getBatch(int id) {
        return null;
    }

    public void deleteBatch(int id) {
    }
}
