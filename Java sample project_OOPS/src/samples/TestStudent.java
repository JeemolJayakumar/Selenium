package samples;

class Student{  
	 int id;  
	 String name;  
	void insertRecord(int r, String n){  
	   int rollnum=r;
	   String fname=n;
	   n=name;
	   System.out.println(rollnum+" "+fname);
	 } 
	} 

	class TestStudent{  
	 public static void main(String args[]){  
	  Student s1=new Student();  
	  s1.id=101;  //Initialization through reference
	  s1.name="Sonoo";  //Initialization through reference

	  s1.insertRecord(111,"Karan");  // Initialization through method
	  s1.insertRecord(222,"Aryan"); // Initialization through method

	  System.out.println(s1.id+" "+s1.name);//printing members with a white space
	 }  
	}  
