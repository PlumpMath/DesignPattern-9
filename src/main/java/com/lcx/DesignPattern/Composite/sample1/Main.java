package com.lcx.DesignPattern.Composite.sample1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			ConcreteCompany root = new ConcreteCompany("金软瑞彩北京总公司");
			root.add(new HRDepartment("总公司人力资源部"));
			root.add(new FinanceDepartment("总公司财务部"));
			
			ConcreteCompany comp = new ConcreteCompany("金软瑞彩内蒙古分公司");
			comp.add(new HRDepartment("内蒙古分公司人力资源部"));
			comp.add(new FinanceDepartment("内蒙古分公司财务部"));
			root.add(comp);
			
			ConcreteCompany comp1 = new ConcreteCompany("金软瑞彩哈尔滨分公司");
			comp1.add(new HRDepartment("哈尔滨分公司人力资源部"));
			comp1.add(new FinanceDepartment("哈尔滨分公司财务部"));
			root.add(comp1);
			
			System.out.println("结构图");
			root.display(1);
			
			System.out.println("\n职责");
			root.lineOfDuty();
	}

}
