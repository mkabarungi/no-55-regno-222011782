// this program will guide the people that use the road
public class grade {//this is main class

    public static void main(String[] args){
        String color = "yellow";//declaretion

        if(color == "red"){ //condition
            System.out.println("STOP"); //print stop if condition is true
        }
        else if(color == "yellow"){ //condition
            System.out.println("PLEASE WAIT");  //print please wait if condition is true
        }
        else if(color == "green"){ //condition
            System.out.println("CONTINUE");  //print continue if condition is true
        }
        else{
            System.out.println("UNKWON COLOR");  //print unkwon color if  all condition is not true
        }
        
    }
}
