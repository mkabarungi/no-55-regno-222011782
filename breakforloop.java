public class breakforloop {
    public static void main(String[] args) {
        int i=0;
        do{
            if(i==6){
                break;
            } else{
            System.out.println(i);
            }
            i = i+1;

        }
        while(i<=10);
    }
}
