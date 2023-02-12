import java.util.Scanner;
public class advance_pattern {
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);  
       System.out.println("entere the range");
       n=sc.nextInt();
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
              System.out.println("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(); 
       }
       sc.close();
    }
}
