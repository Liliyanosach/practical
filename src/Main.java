public class Main{
    public static void main(String[] arg){

        int[] arr = {1,2,3,4};
        System.out.println("Исходный массив");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Массив перевернут");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }


}