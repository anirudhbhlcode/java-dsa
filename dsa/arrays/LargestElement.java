public class LargestElement {

    public static int findThirdLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }else if(arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=largest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }
    public static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
         int[] series = {12,78,43,60,34,67,32,45,90,54};
         int largest = findLargest(series);
         System.out.println("The largest element is: " + largest);
         int secondLargest = findSecondLargest(series);
         System.out.println("The second largest element is: " + secondLargest);
         int thirdLargest = findThirdLargest(series);
         System.out.println("The third largest element is: " + thirdLargest);
    }
}
