package com.example.errorlog.service;

import com.example.errorlog.model.ErrorLog;
import com.example.errorlog.repository.ErrorLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErrorLogService {

    private final ErrorLogRepository errorLogRepository;

    public ErrorLogService(ErrorLogRepository errorLogRepository) {
        this.errorLogRepository = errorLogRepository;
    }

    public ErrorLog saveErrorLog(ErrorLog errorLog) {
        return errorLogRepository.save(errorLog);
    }

    public List<ErrorLog> getAllLogsBetweenTimestamps(Long start, Long end) {
        return errorLogRepository.findByTimestampBetween(start, end);
    }

    public List<ErrorLog> getLogsByExceptionMessage(String message) {
        return errorLogRepository.findByExceptionContainingIgnoreCase(message);
    }

    // Additional methods if needed
}
