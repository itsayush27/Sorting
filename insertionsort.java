import java.util.*;
class insertionsort{
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

    public static void insertionsort(int []arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
           int j = i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j = j-1;
                arr[j+1]= key;
            }
            
        }
    }

    
    public static void main(String[] args) {
            int num = scn.nextInt();
            int []arr = new int[num];
            input(arr);
           insertionsort(arr);
           display(arr);
    }
}