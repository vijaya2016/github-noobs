package com.jsonpractice.com.com.jsonpractice.com;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestEmployeeBusinessLogic {
Employee em = new Employee();
EmployeeBusinessLogic EBL = new EmployeeBusinessLogic();
@Test
public void TestCalculateAppraisal()
{
	em.setAge(27);
	em.setMonthlySalary(2000.00);
	em.setName("vijaya");
	double aaappraaisal = EBL.calculateAppraisal(em);
	Assert.assertEquals(500,aaappraaisal, 10.00);
	
}
@Test
public void TestcalculateYearlySalary()
{
	em.setAge(37);
	em.setMonthlySalary(3000.00);
	em.setName("vijayanew");
	double sal = EBL.calculateYearlySalary(em);
	Assert.assertEquals(36000, sal, 100.00);
}
}
