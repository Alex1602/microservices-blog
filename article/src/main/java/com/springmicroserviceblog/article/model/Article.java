/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springmicroserviceblog.article.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author x000704
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "articles")
public class Article extends AuditModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    
    private String title;
    
    private String text;
    
    private int userID;
    
    private String slug;
    
    public Article(String title, String text, int userID, String slug) {
        this(null, title, text, userID, slug);
    }
}
