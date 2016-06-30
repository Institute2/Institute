package com.im.project.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.im.project.model.Picture;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class PictureServiceTest {
	@Resource
	PictureService pictureService;
	
	/*@Test
	public void testAddPicture() throws Exception {
		Picture pic=new Picture();
		pic.setLink("123ggggg添加");
		pic.setDate("2012-7-12");
		pic.setType(5);
		boolean boo=pictureService.addPicture(pic);
		assertEquals(boo, true);
		//fail("Not yet implemented");
	}
*/
	/*@Test
	public void testFindPicture() throws Exception {
		//fail("Not yet implemented");
		Picture pic=pictureService.findPicture(11);
		
		System.out.println(pic.getId());
		int i=pic.getId();
		assertEquals(i,11);
	}
*/
	@Test
	public void testDelPicture() throws Exception {
		//fail("Not yet implemented");
		boolean boo=pictureService.delPicture(6);
		assertEquals(boo,true);
	}

	@Test
	public void testModifyPicture() throws Exception {
		//fail("Not yet implemented");
		Picture pic=new Picture();
		pic.setLink("123ggggg");
		pic.setDate("2012-7-12");
		pic.setType("2");
		pic.setId("3");
		boolean boo=pictureService.modifyPicture(pic);
		assertEquals(boo, true);
	}

	@Test
	public void testLoadBigPic() throws Exception {
		//fail("Not yet implemented");
		List<String> picList=pictureService.loadBigPic();
		//picList.size();
		assertEquals(picList.size(), 3);
		
	}

	@Test
	public void testFindPicByPage() throws Exception {
		
		//fail("Not yet implemented");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("pageNow", 2);
		map.put("pageSize",3 );
		
		List<Picture> list=pictureService.findPicByPage(map);
		System.out.println(list.size());
		for(Picture pic:list){
			System.out.println(pic.getId());
		}
		//assertEquals(list.size(), 3);
	}
}
