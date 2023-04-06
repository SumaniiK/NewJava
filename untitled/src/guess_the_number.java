import java.util.*;

public class guess_the_number {
    public static <random> void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("guess a no. between 1 to 100");
        //int guessed_no=sc.nextInt();
        Random rd=new Random();
        int random=rd.nextInt(100);
        int m=0;
        for(int i=0;i<11;i++){
            int guessed_no=sc.nextInt();
            if(guessed_no==random){
                System.out.println("Right Guess..!!");
                m++;
                break;
            }if(guessed_no>random){
                System.out.println("guessed no. is greater than original no. "+'\n' + "better luck next time, TRY AGAIN");
                m++;
            }if(guessed_no<random){
                System.out.println("guessed no. is less than original no. "+'\n' + "better luck next time, TRY AGAIN");
                m++;
            }
        }
        int Total_Score=11-m;
        System.out.println("YOUR SCORE: "+Total_Score);
    }
}
