public class advance_pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) { //S
                if (((i==0 || i==n-1 || i==(n-1)/2) && j<=(n-1)/2)  || (j==0 &&i<=(n-1)/2) || (j==(n-1)/2 &&i>=(n-1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //A
                if ((i==0 && (j!=0 && j!=(n-1))) || (j==0&& i!=0 ) || (j==n-1 && i!=0) || i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //R
                if (j==0|| ((i==0 || i==(n-1)/2) && j<=(n-1)/2) || (j==(n-1)/2 && i<=(n-1)/2)  || i-j==(n-1)/2){ 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

             
            System.out.print("    ");
            for (int j = 0; j < n; j++) { //T
                if (j==(n-1)/2 || i==0){ 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) {//H
                if (i==(n-1)/2 || j==0 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print("    ");
            for (int j = 0; j < n; j++) { //A
                if ((i==0 && (j!=0 && j!=(n-1))) || (j==0&& i!=0 ) || (j==n-1 && i!=0) || i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //K
                if (j==0 || (i+j==(n-1)/2) || (i-j==(n-1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }       


            System.out.print("    ");
            for (int j = 0; j < n; j++) { //J
                if (i==0 || j==(n-1)/2 || (i-j==(n-1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }   

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //A
                if ((i==0 && (j!=0 && j!=(n-1))) || (j==0&& i!=0 ) || (j==n-1 && i!=0) || i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //I
                if (j==(n-1)/2 || i==0 || i==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //S
                if (((i==0 || i==n-1 || i==(n-1)/2) && j<=(n-1)/2)  || (j==0 &&i<=(n-1)/2) || (j==(n-1)/2 &&i>=(n-1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //W
                if (j==0 || j==n-1 || (i+j==n-1 && j<=(n-1)/2) || (i==j && j>=(n-1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //A
                if ((i==0 && (j!=0 && j!=(n-1))) || (j==0&& i!=0 ) || (j==n-1 && i!=0) || i==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");
            for (int j = 0; j < n; j++) { //L
                if (j==0 || i==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } 

            System.out.println();
        }
    }
}
