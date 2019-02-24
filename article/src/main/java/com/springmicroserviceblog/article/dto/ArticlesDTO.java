/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springmicroserviceblog.article.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author x000704
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticlesDTO {
    
    private List<ArticleDTO> articles;
    private int offset;
    private int limit;
    private long total;
    
}
