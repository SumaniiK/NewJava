import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m");
        int m = sc.nextInt();
        half_square(m);
    }
    void triangle(int m){
        for(int i=0;i<m;i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=m-1;i>=0;i--){
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void half_square(int m){
        for(int i=0;i<=m;i++){
            for(int j=0;j<m;j++){
                if(j<m-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
