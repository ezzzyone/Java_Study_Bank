package com.jw.start;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration  //(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class DBTest {
	@Autowired
	private SqlSession sqlSession;

	@Test
	public void test() {
		
		assertNotNull(sqlSession);
		
		fail("Not yet implemented");
	}

}
