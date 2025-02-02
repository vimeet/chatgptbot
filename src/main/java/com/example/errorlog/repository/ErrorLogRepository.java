package com.example.errorlog.repository;

import com.example.errorlog.model.ErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ErrorLogRepository extends JpaRepository<ErrorLog, Long> {

    // Find logs between two timestamps
    List<ErrorLog> findByTimestampBetween(Long start, Long end);

    // Find logs where exception message contains some text
    List<ErrorLog> findByExceptionContainingIgnoreCase(String search);
}
