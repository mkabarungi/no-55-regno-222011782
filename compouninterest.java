// this program will calculate the compound inerest
import java.lang.Math;//import math library
class Compound { //class declaretion
    static double compoundi(double p, double r, double t){ //method declaretion
        return p*(Math.pow((1+((r/100)/12)),t*12)); //return
    }
}

public class compouninterest { //main class declaretion 
    public static void main(String[] args) {//main class
        Compound CC = new Compound();//object creation
        System.out.println(CC.compoundi(500000,18,3));//method calling
    }
}
