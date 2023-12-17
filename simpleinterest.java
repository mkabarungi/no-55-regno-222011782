//this program will calculate the simple interest 
class Simple {
    static int simplein(int p,int r, int t){//  method
        return(p*r*t)/100;//return//
    }
}

public class simpleinterest {//main class
    public static void main(String[] args) {//main function
        Simple SS= new Simple();//classname and object name
        System.out.println("the simple interest is " + SS.simplein(100000,5,5));// output
    }
}
   

