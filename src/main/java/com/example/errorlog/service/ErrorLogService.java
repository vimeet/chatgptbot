package com.example.errorlog.service;

import com.example.errorlog.model.ErrorLog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ErrorLogService {

    private static List<ErrorLog> errorLogRepository = new ArrayList<>();

    public ErrorLogService() {

    }

    public ErrorLog saveErrorLog(ErrorLog errorLog) {
        errorLogRepository.add(errorLog);
        return errorLog;
    }

    public List<ErrorLog> getAllLogsBetweenTimestamps(Long start, Long end) {
        List<ErrorLog> foundErrorLogs = new ArrayList<>();
        for (ErrorLog errorLog : errorLogRepository) {
            if(errorLog.getTimestamp() >= start && errorLog.getTimestamp() <= end) {
                foundErrorLogs.add(errorLog);
            }
        }
        return foundErrorLogs;
    }

    public List<ErrorLog> getLogsByExceptionMessage(String message) {
        List<ErrorLog> foundErrorLogs = new ArrayList<>();
        for (ErrorLog errorLog : errorLogRepository) {
            if(errorLog.getException().contains(message)) {
                foundErrorLogs.add(errorLog);
            }
        }
        return foundErrorLogs;
    }

    // Additional methods if needed
}
