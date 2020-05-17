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
		System.out.println(person1.sayHello());;
		
		System.out.println(person2.toString());
		System.out.println(person2.sayHello());;
		System.out.println();

		Person boy1 = new Boy("Staœ", "Tarkowski", 14);
		System.out.println(boy1.sayHello());;
		System.out.println(boy1.toString());
		
		Person girl1 = new Girl("Nela", "Rawlison", 8);
		System.out.println(girl1.sayHello());;
		System.out.println(girl1.toString());
		
		ArrayList<Person> list = new ArrayList<>();

				
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        //sortowanie rosn¹ce

        Collections.sort(list);
        System.out.println(list);
        
        //sortowanie malej¹ce
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Comparable newPerson = new Boy("Michal", "Kolo", 9);
        Person person5 = new Girl("Aga", "Bies", 12);
        Person andOneMorePerson = new Student("Gosia", "Pikawa-S³oñska", 52, 2, "Politologia", false);

/* tworz¹c obiekty klas dziedzicz¹cych i zapisuj¹c ich w zmiennej klasy bazowej, zawsze zostanie wywo³ana metoda toString
z klasy dziedzicz¹cej
*/

        System.out.println(newPerson.toString());
        System.out.println(andAnotherPerson.toString());
        System.out.println(andOneMorePerson.toString());

    }


		

	}
}

class Person {
	private int age;
	private String personName;
	private String personSurname;

	Person(String name, String surname, int age) {
		personName = name;
		personSurname = surname;
		this.age = age;
		System.out.println("Konstruktor klasy bazowej");
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
	
	public int compareTo(Person o) 
    {
        return this.getAge().compareTo( o.getAge() );
    }

}

class Girl extends Person {

	Girl(String name, String surname, int age) {
		super(name, surname, age);
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
	}
	
	public String toString() {
		return "Objekt klasy: " + this.getClass().getSimpleName();
	}
	
	String sayHello() {
		super.sayHello();
		return "Hi, my name is " + this.getName() + " " + this.getSurname() + " and I'm " + this.getAge() + ".";
	}
	
}
