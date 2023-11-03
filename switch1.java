public class switch1{ // this program will display the number of workers 
    public static void main(String[] args){ // main method which will display the program
        int numberworkers = 4;//declare and initialize one varriable int numberworkers=4
    switch(numberworkers){ //condition
        case 1: //case 1
          System.out.println("Serve 10 clients");//output if case one is equal to variable
          break; //stop to execute the condition 
        case 2://case 2 to execute the condition
          System.out.println("Serve 20 clients")    //output 
          break;//stop to execute the condition
        case 3:  //case 3 to execute the condition
          System.out.println("Serve 30 clients");    //output 
          break;  //stop to execute the condition
        case 4: //case 4 to execute the condition
          System.out.println("Serve 40 clients");    //output 
          break;  //stop to execute the condition
        default://if no cases matches with the condition
          System.out.println("No client to serve");// print disable if all conditions does not match
                
    }
    }
}
