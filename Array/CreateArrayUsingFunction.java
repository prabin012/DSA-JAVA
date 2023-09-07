import java.util.Scanner;

public class CreateArrayUsingFunction {
    public static void CreateArray(int num[]){
        System.out.println("Item of Array is : ");
        for(int i=0; i<num.length;i++){
            System.out.print( num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);

        //Input of array from user
        System.out.println("Enter Item of Array : ");
        for(int i=0; i<num.length;i++){
            num[i]= sc.nextInt();
        }


        //Function call
        CreateArray(num);
    }
}
