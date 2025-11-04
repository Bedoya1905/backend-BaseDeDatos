package com.basededatos.backend_baseDeDatos.RequestLogRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
public class RequestLog {
    @Id @GeneratedValue
    private Long id;
    private String method;
    private String path;
    private String ip;
    private LocalDateTime timestamp;
}
