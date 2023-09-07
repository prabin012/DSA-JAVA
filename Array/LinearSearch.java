public class LinearSearch {
    public static int LinearSearch(int num[], int key){

        for(int i=0; i<num.length;i++){
            if(num[i]==key){
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]= {1,4,6,3,8,20};
        int key = 8;

        int result = LinearSearch(num, key);
        if(result==-1){
            System.out.println("Item dosnot exit");
        }
        else{
            System.out.println("Item found in Index : " + result);
        }
    }
}
