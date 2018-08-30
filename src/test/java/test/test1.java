package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import entity.type;
import service.type_service;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/webapp")
@ContextConfiguration(locations = {"classpath:springmvc-servlet111.xml"})
@Transactional(transactionManager="transactionManager")
@Rollback(false)
public class test1 {
	
	@Autowired
	type_service service;

	@Test
	public void ee() {
		type info=service.getById(11);
		System.out.println(info.getName());
//		Assert.assertEquals(0, 0);
	}

}
