public class PairOfArray {

    public static void pairOfArray(int num[]){
        for(int i=0; i<num.length;i++){
            for(int j=i; j<num.length;j++){
                System.out.print("("+num[i] +" , " + num[j] +")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10};

        pairOfArray(num);
    }
}
