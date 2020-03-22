import java.util.*;
class bubblesort{
    static Scanner scn = new Scanner(System.in);

    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void buublesort(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    continue;
                }
            }
        }
    }
    public static void main(String[] args) {
            int num = scn.nextInt();
            int []arr = new int[num];
            input(arr);
           buublesort(arr);
           display(arr);
    }
}