package com.rag.ingestion_service.entity;

import jakarta.persistence.*;
        import lombok.*;

        import java.time.LocalDateTime;

@Entity
@Table(name = "documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String documentId;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private LocalDateTime uploadDate;

    @Column(nullable = false)
    private String status;
}