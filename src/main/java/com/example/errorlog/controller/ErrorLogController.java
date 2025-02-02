package com.example.errorlog.controller;

import com.example.errorlog.model.ErrorLog;
import com.example.errorlog.service.ErrorLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/error-logs")
@Tag(name = "ErrorLog API", description = "Endpoints for managing error logs")
public class ErrorLogController {

    private final ErrorLogService errorLogService;

    public ErrorLogController(ErrorLogService errorLogService) {
        this.errorLogService = errorLogService;
    }

    /**
     * 1) A POST endpoint to dump errors/exceptions
     */
    @Operation(summary = "Dump an error/exception",
            description = "Save an error or exception log in the system.")
    @PostMapping
    public ResponseEntity<ErrorLog> createErrorLog(@RequestBody ErrorLog errorLog) {
        ErrorLog savedLog = errorLogService.saveErrorLog(errorLog);
        return new ResponseEntity<>(savedLog, HttpStatus.CREATED);
    }

    /**
     * 2) A GET endpoint to retrieve all the errors/exceptions between two timestamps
     */
    @Operation(summary = "Get logs between timestamps",
            description = "Retrieve all error logs between two given timestamps (inclusive).")
    @GetMapping("/between")
    public ResponseEntity<List<ErrorLog>> getLogsBetweenTimestamps(
            @RequestParam("start") Long start,
            @RequestParam("end") Long end) {
        List<ErrorLog> logs = errorLogService.getAllLogsBetweenTimestamps(start, end);
        return new ResponseEntity<>(logs, HttpStatus.OK);
    }

    /**
     * 3) A GET endpoint to retrieve logs for a given message
     */
    @Operation(summary = "Get logs by message",
            description = "Retrieve all error logs that contain a given message in the exception field.")
    @GetMapping("/search")
    public ResponseEntity<List<ErrorLog>> getLogsByMessage(
            @RequestParam("message") String message) {
        List<ErrorLog> logs = errorLogService.getLogsByExceptionMessage(message);
        return new ResponseEntity<>(logs, HttpStatus.OK);
    }
}
