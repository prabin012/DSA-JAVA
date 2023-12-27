public class SpiralMatrix{

    public static void PrintSpiral(int matrix [][]){
        int stRow =0;
        int endRow =matrix.length-1;
        int stCol = 0;
        int endCol = matrix[0].length-1;
        
        //Condition for Loop running
        while(stRow <= endRow && stCol <=endCol){

            //Print upper Colume
            for(int j=stRow; j<=endCol; j++){
               
                System.out.print(matrix[stRow][j] +" ");
            }

            //print Right row
            for(int i=stRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol] +" ");
            }

            //print lower column
            for(int j=endCol-1; j>=stCol;j--){
                // condit
                if(stRow==endRow){
                    break;
                }
               
                System.out.print(matrix[endRow][j] +" ");
            }

            for(int i=endRow-1; i>=stRow+1;i--){
                if(stCol==endCol){
                    break;
                }
                System.out.print(matrix[i][stCol] +" ");
            }

            stCol++;
            stRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String  arg[]){
    
        int matrix [][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                             };

        PrintSpiral(matrix);
    }
}