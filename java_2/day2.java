import java.util.*;

public class Person {
	String name;
	Integer age;
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+" "+age;
	}
	public static void main(String[] args) {
		Person p1 = new Person("Alice", 25);
		System.out.println(p1);
		Person p2 = new Person("Bob", 30);
		System.out.println(p2);
	}
}