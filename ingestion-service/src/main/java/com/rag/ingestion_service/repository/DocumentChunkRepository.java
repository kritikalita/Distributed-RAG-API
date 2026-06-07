package com.rag.ingestion_service.repository;

import com.rag.ingestion_service.entity.DocumentChunk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentChunkRepository extends JpaRepository<DocumentChunk, Long> {
}