import java.util.*;
class selectionsort{
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

    public static void selectionsort(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    
    
    public static void main(String[] args) {
            int num = scn.nextInt();
            int []arr = new int[num];
            input(arr);
           selectionsort(arr);
           display(arr);
    }
}