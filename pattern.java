import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int n;
        System.out.println("pleae enter a range");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
