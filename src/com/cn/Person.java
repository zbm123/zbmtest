package com.cn;

public abstract class Person {
    private String name;
    private int age;
    
	public Person() {
		super();
	
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
	public abstract void write();
	public void sleep(){
		System.out.println("�˶�Ҫ˯��");
	}
}
