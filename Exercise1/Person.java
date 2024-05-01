package Exercise1;

public class Person {
	private String name;
	private int age;
	private String country;
	
	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country){
		this.country = country;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Ean Craig", 11, "USA");
		Person person2 = new Person("Evan Ross", 12, "Germany");
		
		System.out.println("First Person's name: " + person1.getName() + "\nAge: " + person1.getAge() + "\nCountry: " + person1.getCountry());
		System.out.println("\nSecond Person's name: " + person2.getName() + "\nAge: " + person2.getAge() + "\nCountry: " + person2.getCountry());
		
		person1.setAge(15);
		person2.setCountry("Italy");
		System.out.println("\nFirst Person's new age: " + person1.getAge());
		System.out.println("\nSecond Person's new country: " + person2.getCountry());

	}

}
