import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        int n;
        System.out.println("pleae enter a range");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==(n-1)/2 || j==0 ||j==n-1){
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
