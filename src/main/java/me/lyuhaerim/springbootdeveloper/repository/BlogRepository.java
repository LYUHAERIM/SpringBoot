package me.lyuhaerim.springbootdeveloper.repository;

import me.lyuhaerim.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

