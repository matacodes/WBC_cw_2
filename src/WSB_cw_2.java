import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class WSB_cw_2 {
	public static void main(String[] args) {
		Person person1 = new Person("Adam", "Kowalski", 10);
		Person person2 = new Person("Basia", "Nowak", 9);
		Person person3 = new Person("Zosia", "Ptak", 12);
		Person person4 = new Person("Piotr", "Kot", 3);
		
		
		
		person1.setAge(8);
		person1.setName("Krzys");
		person1.setSurname("Krzak");
		
		person2.setAge(4);
		person2.setName("Ola");
		person2.setSurname("Niebo");
				
		System.out.println(person1.toString());
		System.out.println(person1.sayHello());
		
		System.out.println(person2.toString());
		System.out.println(person2.sayHello());
		System.out.println();

		
		//Wywo³any jest konstruktor klasy bazowej, a pó¿niej dziedzicz¹cej
		Boy boy1 = new Boy("Staœ", "Tarkowski", 14);
		System.out.println(boy1.sayHello());
		System.out.println(boy1.toString());
		
		Girl girl1 = new Girl("Nela", "Rawlison", 8);
		System.out.println(girl1.sayHello());
		System.out.println(girl1.toString());

		
		System.out.println("---- Sortowanie ----");
		ArrayList<Person> list = new ArrayList<>();

				
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        
        System.out.println("-- Sortowanie rosn¹ce");

        Collections.sort(list);
        for (Object person : list) {
            System.out.println(person);
        }

        
        System.out.println("-- Sortowanie malej¹ce");
        Collections.sort(list, Collections.reverseOrder());
        Collections.sort(list);
        for (Object person : list) {
            System.out.println(person);
        }

        Person newPerson = new Person("Michal", "Kolo", 9);
        Person girl2 = new Girl("Aga", "Bies", 12);
        Person boy2 = new Boy("Mateusz", "S³onik", 5);


        System.out.println(newPerson.toString());
        
        System.out.println(girl2.sayHello());
        System.out.println(girl2.toString());
        
        System.out.println(boy2.sayHello());
        System.out.println(boy2.toString());
        
        

    }


		

	}


class Person implements Comparable<Person> {
	private int age;
	private String personName;
	private String personSurname;

	Person(String name, String surname, int age) {
		personName = name;
		personSurname = surname;
		this.age = age;
		System.out.println("Konstruktor klasy bazowej Person");
	}

	public void setName(String newName) {
		personName = newName;
	}

	public void setSurname(String newSurname) {
		personSurname = newSurname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return personName;
	}

	public String getSurname() {
		return personSurname;
	}

	public int getAge() {
		return age;
	}

	String sayHello() {
		return "Hi, my name is " + personName + " " + personSurname + " and I'm " + age + ".";
	}


	public String toString() {
		return "Objekt klasy: " + this.getClass().getSimpleName();
	}

	@Override
	public int compareTo(Person p) {
		//return (this.getAge()).compareTo( p.getAge());
	if (this.age >= p.age) {
		return 1;
	}else if(this.age < p.age) {
		return -1;
	}else {
		return 0;
	}
	
	
	}
	


}

class Girl extends Person {

	Girl(String name, String surname, int age) {
		super(name, surname, age);
		System.out.println("Klasa dziedzicz¹ca Girl");
	}
	

	public String toString() {
		return "Objekt klasy: " + this.getClass().getSimpleName();
	}
	
	String sayHello() {
		super.sayHello();
		return "Hi, my name is " + this.getName() + " " + this.getSurname() + " and I'm " + this.getAge() + ".";
	}
	
}

class Boy extends Person {

	Boy(String name, String surname, int age) {
		super(name, surname, age);
		System.out.println("Klasa dziedzicz¹ca Boy");
	}
	
	public String toString() {
		return "Objekt klasy: " + this.getClass().getSimpleName();
	}
	
	String sayHello() {
		super.sayHello();
		return "Hi, my name is " + this.getName() + " " + this.getSurname() + " and I'm " + this.getAge() + ".";
	}
	
}
