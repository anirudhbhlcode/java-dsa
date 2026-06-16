public class BinarySearch {
    public static int search(int[] arr,int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(key == arr[mid]){
                return mid;
            }else if(key<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;
        int result = search(arr, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
