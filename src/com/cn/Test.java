package com.cn;

public class Test {
    public static void main(String[] args) {
	Person p=new Programor();
	  p.setName("zbm");
	  p.setAge(18);
	  System.out.println(p.getName()+"  "+p.getAge());
	  p.write();
	  p.sleep();
	  System.out.println("==================");
	  
	  Person p2=new Manager();
	  p2.setName("zbm2");
	  p2.setAge(20);
	  System.out.println(p2.getName()+"  "+p2.getAge());
	  p2.write();
	  p2.sleep();
	  
	  Manager m=new Manager();
	  m.study();
	}
}
