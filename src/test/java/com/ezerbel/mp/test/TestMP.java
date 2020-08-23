package com.ezerbel.mp.test;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMP {
	
	private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void testDataSource() throws Exception {
		DataSource ds = ioc.getBean("dataSource",DataSource.class);
		Connection conn = ds.getConnection();
		System.out.println(conn);
		System.out.println("Finished!!!");
	}

}
