package Week10;

public class Student {
    public String name;
    private int test1;
    private int test2;
    private int test3;
    
    //constructor
    Student(String name, int test1, int test2, int test3){
	this.name = name;
	this.test1 = test1;
	this.test2 = test2;
	this.test3 = test3;
	
    }
    
    public void printGrade() {
	
	System.out.println("Hello " + name + " your average is:" );
        int sum = this.test1 + this.test2 + this.test3;
        int avg = sum / 3;

        if (avg > 90)
            System.out.println("A");
        else if (avg > 80)
            System.out.println("B");
        else if (avg > 70)
            System.out.println("C");
        else if (avg > 60)
            System.out.println("D");
        else
            System.out.println("E");
    }
    
    public void main() {
	Student Jessica = new Student("Jessica", 90, 90, 90);
	Student Jane = new Student("Jane", 99, 95, 98);
	Student student1 = new Student("joe", 100, 100, 100) ;

	//Jessica.printGrade();

	Jane.printGrade();
	student1.printGrade();
	Jessica.printGrade();
    }
}

