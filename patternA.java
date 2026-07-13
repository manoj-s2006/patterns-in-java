import java.util.*;
class patternA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        //outer for loop for rows
        for(int i=1;i<=n;i++){
            //inner for loop for columns
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}