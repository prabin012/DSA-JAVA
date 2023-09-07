public class SubArray {
    public static void subArray(int num[]){
        
        for(int i=0; i<=num.length;i++){

            for(int j=i;j<=num.length;j++){

                for(int k = i; k<j;k++){
                    System.out.print(num[k] + " ");
                }
                 System.out.println();
            }
            
        }
        
       
            
    }

   
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10};
        int n= num.length;

        int noOFsubArray = n*(n+1)/2;

        System.out.println("No of Subarray are : " + noOFsubArray);
       subArray(num);
    }
}
