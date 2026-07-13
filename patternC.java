import java.util.*;
class patternC{
    public static void main(String[]args){
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=m.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//output:
//Enter the number of rows: 5
//*****
//****
//***
//**
//*