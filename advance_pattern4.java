import java.util.Scanner;
public class advance_pattern4 {
    public static void main(String[] args) {
        int n;
       Scanner sc=new Scanner(System.in);  
       System.out.println("enter the range");
       n=sc.nextInt();
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1 || i+j==(n-1)/2){
              System.out.print("*");
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
