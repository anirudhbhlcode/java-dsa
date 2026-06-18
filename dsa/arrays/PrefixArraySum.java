public class PrefixArraySum {
    // prefix[end] - prefix[start-1]
    public static void prefixSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("Maximum subarray sum (Prefix Array): " + maxSum);
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        prefixSum(arr);
    }
}
