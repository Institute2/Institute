package com.im.project.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.im.project.model.Article;
import com.im.project.service.ArticleService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class ArticleServiceImplTest {
	@Resource
	private ArticleService articleService;
	@Test
	public final void testModifyArticle() {
		//fail("Not yet implemented"); // TODO
		
	}

	@Test
	public final void testFindArticleIndex() {
		//fail("Not yet implemented"); // TODO
		List<Article> artList =articleService.findArticleIndex();
		System.out.println(artList.size());
		for(Article art:artList){
			System.out.println(art.getTitle());
		}
	}

	
}
