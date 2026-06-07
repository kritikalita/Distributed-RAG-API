package com.rag.ingestion_service.dto;

import lombok.Data;

@Data
public class CreateDocumentRequest {

    private String documentId;
    private String filename;
    private String department;

}