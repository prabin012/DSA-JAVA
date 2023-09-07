import java.util.Scanner;

public class CreateArrays {
    public static void main(String[] args) {

        // Creating array 
        int number[] = new int[5];
        Scanner sc = new Scanner(System.in);


        //Take item of array from user
        for(int i=0; i<number.length;i++){
            number[i] = sc.nextInt();
             
        }

        //Print itme of array
        for(int i=0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }

        //PRint nextLine
        System.out.println();
       
    }
}
