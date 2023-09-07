public class BinarySearch {
    public static int binarySearch(int num[], int key){
        

        int start =0;                //starting Index
        int end = num.length-1;          //Last Index                               
        for(int i=0; i<num.length;i++){                                             
            int mid= (start + end)/2;      //Middle index                               
            if(num[mid]==key){                                                       
                return mid; 
            }
            if(num[mid] > key){
                end = mid-1;
            }
            if(num[mid] <key){
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14};
        int key = 4;

        int result = binarySearch(num, key);

        if(result==-1){
            System.out.println("Item dosnot exit");
        }
        else{
            System.out.println("Item found in Index : " + result);
        }
    }
}
