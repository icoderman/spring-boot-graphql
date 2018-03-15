package pac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pac.models.Article;
import pac.repositories.ArticleRepository;
import pac.services.ArticleService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    public List<Article> findAllUserArticles(List<String> ids) {
        return articleRepository.findByIdIn(ids);
    }
}
