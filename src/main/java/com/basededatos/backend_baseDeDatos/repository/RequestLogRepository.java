package com.basededatos.backend_baseDeDatos.repository;

import com.basededatos.backend_baseDeDatos.RequestLogRepository.RequestLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RequestLogRepository extends JpaRepository<RequestLog, Long> {

}
