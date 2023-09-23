package com.kdom.backend.domain;

import com.kdom.backend.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "ARTICLE")
@Entity
public class Article extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long id;

    @Column(nullable = true)
    private String title;

    @Column(nullable = true)
    private String content;

    @Column(nullable = true)
    private String imgUrl;

    @Column(nullable = true)
    private String linkUrl;

    @Column(nullable = true)
    private String target;
    @Builder
    public Article(String title, String content, String imgUrl, String linkUrl,String target) {
        this.title = title;
        this.content = content;
        this.imgUrl = imgUrl;
        this.linkUrl = linkUrl;
        this.target = target;
    }
}
