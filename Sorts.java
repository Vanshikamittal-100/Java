public class Sorts{

    static void bubbleSort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={4,5,8,2};
        //System.out.println("before sorting");
        //printArray(arr);
        //bubbleSort(arr);
        System.out.println("after sorting");
        bubbleSort(arr);
        printArray(arr);
    }
}