public class ReverseArray {

    public static void reverseArray(int num[]){

         int start = 0;
        int end =num.length-1;

        while(start<end){
            if(num[start] < num[end]){
                int temp = num[start];
                num[start] = num[end];
                 num[end] = temp;
            }
            start++;
            end --;
        }

    }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10};
        reverseArray(num);
        for(int i=0; i<num.length;i++){
        System.out.print(num[i] + " ");
       }
    }
}
