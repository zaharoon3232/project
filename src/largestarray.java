
//Largest element of array
public class largestarray {
    public static void main(String[] args){
        int[]arr=new int[]{34,15,88,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
            if(arr[i]>max)
            {
                max=arr[i];
            }
        System.out.println("given array is:");
        for(int i=0;i<arr.length;i++);
        {
            System.out.println("largest element of array is:"+max);
        }
    }
}

