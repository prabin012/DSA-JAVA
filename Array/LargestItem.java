public class LargestItem {
    public static int shortArray(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
         return max;  
       }

   public static void main(String[] args) {
       int num[] = { 6, 2, 4, 10, 8,12};
       int result = shortArray(num);
       System.out.println(result);
   }
}
