package problemSolving;

public class ArrayInsertBign {
    public static void main(String[] args) {
        int arr[]=new int[6];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");

        }

        int newValue=10;
        int indeNumber=2;
        for (int i = arr.length-2; i >=indeNumber ; i--) {
         arr[i+1]=arr[i];
        }
        arr[indeNumber]=newValue;
        System.out.println();
        System.out.println("Update Array");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
