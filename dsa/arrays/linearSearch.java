public class linearSearch {

    public static int search(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] series = {2,4,6,8,10,12,14,16,18,20};
        int key = 12;

        int index = search(series,key);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+index);
        }
    }
}
