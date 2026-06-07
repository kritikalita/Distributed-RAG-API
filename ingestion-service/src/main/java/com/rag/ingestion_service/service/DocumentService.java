package com.rag.ingestion_service.service;

import com.rag.ingestion_service.dto.CreateDocumentRequest;
import com.rag.ingestion_service.entity.Document;
import com.rag.ingestion_service.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository documentRepository;

    public Document createDocument(CreateDocumentRequest request) {

        Document document = Document.builder()
                .documentId(request.getDocumentId())
                .filename(request.getFilename())
                .department(request.getDepartment())
                .uploadDate(LocalDateTime.now())
                .status("PROCESSING")
                .build();

        return documentRepository.save(document);
    }
}