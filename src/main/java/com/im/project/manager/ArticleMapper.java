package com.im.project.manager;
import org.springframework.stereotype.Repository;
import com.im.project.model.Article;
@Repository("articleDao")
public interface ArticleMapper  extends BaseDao<Article, Integer>{
	
}
