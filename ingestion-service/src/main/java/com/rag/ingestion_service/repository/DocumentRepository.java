package com.rag.ingestion_service.repository;

import com.rag.ingestion_service.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    Optional<Document> findByDocumentId(String documentId);

}