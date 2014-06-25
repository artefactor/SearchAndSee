public class PersonTestAppl {
	
	public static void main(String[] args) {
      new Person("vas", 15);
      new Person("lelik", 1);
      new Person("vas", 15);
	}
}
class Person{
	int age;
	String name;
	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
}