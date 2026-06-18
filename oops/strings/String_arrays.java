package oops.strings;
public class String_arrays {

    public static void printArray(String[] arr){
        int n = arr.length;
        int i;
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        String[] names = {"Krishna", "Madhav", "Hrishikesh", "Govinda", "Gopinath"};
        for(String name : names){
            System.out.println(name);
        }
        // printArray(names);
    }
}
