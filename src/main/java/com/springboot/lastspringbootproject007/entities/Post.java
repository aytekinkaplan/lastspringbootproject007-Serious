package com.springboot.lastspringbootproject007.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    Long id;
    Long userId;
    String title;
    @Lob
    @Column(columnDefinition = "text")
    String text;
}
