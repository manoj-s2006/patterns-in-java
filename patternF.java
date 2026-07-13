import java.util.Scanner;
public class patternF {
    public static void main(String[] args) {
        //right pascal triangle pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
//output:
//Enter the number of rows: 5
/*
 * 
 * * 
 * * * 
 * * * * 
 * * * * * 
 * * * * 
 * * * 
 * * 
 *
 */
