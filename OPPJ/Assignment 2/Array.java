class Student {

	int id;

	String name;

//set value for name instance variable

//Constructor: parameterized construction Student (int id, String name) {
	Student(int id,String name){
		this.id = id;
		this.name = name;//instance variable parameter
	}
}


class Array {

	public static void main(String args[]){
		Student[] s1 = new Student [3]; //Array of object
		s1 [0] = new Student (2, "Nisha");
		s1[1] = new Student (23, "Vaibhav");
		s1[2]= new Student (9, "Shiv");
		
		for(Student s : s1){
			System.out.println(s.id+ " "+s.name);
		}
	}
}
