public class SubArray {
    public static void printSubArrays(int[] arr){
        int totalSubArrays = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArrays++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays: " + totalSubArrays);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printSubArrays(arr);
    }

}
