/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springmicroserviceblog.article.controller;

import com.springmicroserviceblog.article.dto.ArticlesDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author x000704
 */
@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    
    public ArticleController() {}
    
    @GetMapping
    public ArticlesDTO findAll() {
        return null;
    }
    
}
