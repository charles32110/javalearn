
/*
arr
 */


public class learn12 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        for(int i = 0;i<=arr.length/2;i++){
            int a = arr[i];int x = arr.length -1 -i;
            arr[i]=arr[x];
            arr[x] = a;
        }
        for (int o=0;o<=arr.length;o++){
            System.out.print(arr[o]);
        }
    }
}
