import java.util.Scanner;

public class Create{

    //find element into the matrix 

    public static boolean findMatrixIndex( int matrix[][] , int k){
        for(int i = 0; i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][j]==k){
                    System.out.println("FOund in index (" + i + "," + j + ')');
                    return true;
                }
            }
           
        }
        return false;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        // Loop for input Array items

        System.out.println("Input Matrix");
        for(int i =0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // loop for Print matrix

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        findMatrixIndex(matrix, 6);
    }
}