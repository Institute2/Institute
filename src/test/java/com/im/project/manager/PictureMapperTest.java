package com.im.project.manager;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-myBatis.xml" })
public class PictureMapperTest {
	@Resource
	PictureMapper pd;
	
/*	@Test
	public void testListPic() {

		Picture pic = new Picture();

		fail("Not yet implemented");
	}

	@Test
	public void testSelectByType() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testSelectByPrimaryKey() {
		/*icture pic=new Picture();
		pic.setDate("123");
		pic.setId(1);
		pic.setLink("wqwqe");
		pic.setType(1);*/
		pd.selectByPrimaryKey(1);
		fail("Not yet implemented");
		
	}

/*	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}*/

}
