package inheritance4;
// java program to show Big five teams in english premier league

class A extends B implements E{
	void printa() {// method decralation
		System.out.println("Chelsea");
	}
	public void printe() { // method decralation
		 System.out.println("Manchester United");
	}
}
class B extends C{
	void printb() {// method decralation
		System.out.println("Arsenal");
	}
}
class C extends D{
	void printc() {// method decralation
		System.out.println("Manchester City");
	}
}
class D{
	void printd() { // method decralation
		System.out.println("Liverpool"); // output
	}
}
interface E{ // interface decralation
	void printe(); // method decralation
}


public class inheritanceq2 {
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
BIG FOUR TEAMS IN EPL

Chelsea
Arsenal
Manchester City
Liverpool
Manchester United
 */