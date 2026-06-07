package com.rag.ingestion_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "document_chunks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentChunk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentId;

    private Integer chunkIndex;

    @Column(columnDefinition = "TEXT")
    private String content;
}