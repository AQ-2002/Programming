import java.util.Scanner;
public class revu {
     Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


    }
    public static void DrowStar(int n, boolean UpSideDown){
        if(n < 0){
            System.out.println("Invalid Input");
        }
        if(UpSideDown == false){
            for(int i = 1; i <=n; i++){
                for( int j =1; j<=i; i++){
                    System.out.println("*");
                    System.out.println();
                }
            }
        }
        else{
            for(int i = 1; i <=n; i++){
                for(int j =n; j>= i; i--){
                    System.out.println("*");
                    System.out.println();
                }
            }
        }
    }
}


