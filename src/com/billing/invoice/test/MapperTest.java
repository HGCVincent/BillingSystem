package com.billing.invoice.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.billing.invoice.dao.EmployeeMapper;
import com.billing.invoice.po.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	EmployeeMapper employeemapper;
	
    @Test
    public void testone(){
    	System.out.println(employeemapper);
    	System.out.println(employeemapper.insertSelective(new Employee(null, "vincent", "ÄÐ", null)));
    }
    
    @Test
    public void aa(){
    	int a = -5;
    	int b = a>>2;
    	System.out.println(b);
    }
}
