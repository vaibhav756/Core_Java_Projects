package com;

public class ToString {

	public static void main(String[] args) {

		Student s=new Student();
		s.id=101;
		s.name="Vaibhav";
		
		Student s1=new Student();
		s1.id=101;
		s1.name="Vaibhav";
		
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.equals(s1));
	}

}
class Student implements Cloneable
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Student()
	{
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/*public String toString()
	{
		return id+"--"+name;
	}*/
	
}
