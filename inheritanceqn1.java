package inheritance3;
// java program to show first five names of month of the year

class A extends B implements E{
	void printa() {// method decralation
		System.out.println("January");
	}
	public void printe() { // method decralation
		 System.out.println("May");
	}
}
class B extends C{
	void printb() {// method decralation
		System.out.println("February");
	}
}
class C extends D{
	void printc() {// method decralation
		System.out.println("March");
	}
}
class D{
	void printd() { // method decralation
		System.out.println("April"); // output
	}
}
interface E{ // interface decralation
	void printe(); // method decralation
}


public class inheritanceqn1 {
	public static void main(String[] args) {
        A Obj = new A(); // object creation
        System.out.println("BIG FOUR TEAMS IN EPL\n"); // output
        Obj.printa(); // method calling
        Obj.printb();// method calling
        Obj.printc(); // method calling
        Obj.printd();// method calling
        Obj.printe();// method calling
	}

}
/*
 * 
output

january
february
march
April
May
 */