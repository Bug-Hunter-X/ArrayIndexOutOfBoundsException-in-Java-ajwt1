public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) { //Check for valid index
            System.out.println(arr[4]); //Access the last valid element
        }
    }
}