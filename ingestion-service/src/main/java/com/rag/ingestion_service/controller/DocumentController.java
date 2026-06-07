package com.rag.ingestion_service.controller;

import com.rag.ingestion_service.dto.CreateDocumentRequest;
import com.rag.ingestion_service.entity.Document;
import com.rag.ingestion_service.service.ChunkingService;
import com.rag.ingestion_service.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.rag.ingestion_service.service.PdfExtractionService;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;
    private final PdfExtractionService pdfExtractionService;
    private final ChunkingService chunkingService;

    @PostMapping
    public Document createDocument(
            @RequestBody CreateDocumentRequest request
    ) {
        return documentService.createDocument(request);
    }

    @PostMapping("/upload")
    public String uploadPdf(
            @RequestParam("file") MultipartFile file
    ) {

        return pdfExtractionService.extractText(file);
    }

    @GetMapping("/chunk-test")
    public Object chunkTest() {

        String text = """
            Employees receive 20 annual leaves.
            Probation period is 6 months.
            Remote work allowed twice a week.
            """.repeat(50);

        return chunkingService.chunkText(text);
    }
}