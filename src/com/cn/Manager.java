package com.cn;

public class Manager extends Person  implements Study{

	
	public void write() {
		System.out.println("项目经理写的是复杂的代码");
		
	}

	
	public void study() {
		System.out.println("项目经理要学习日语");
		
	}
   
}
