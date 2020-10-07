import java.util.*;
public class shell {
    //this is shell sort it's a sorting technique.
    public static void main(String[] args)
    {
Scanner in =new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[n];
    for(int i:arr)
        i=in.nextInt();
    for(int gap=arr.length/3;gap>0;gap/=2)
    {
        for(int unsorted=gap;unsorted<arr.length;unsorted++)
        {
            int largest=arr[unsorted];
            int j;
            for(j=unsorted;j-gap>=0 && largest<arr[j-gap];j-=gap)
            {
                arr[j]=arr[j-gap];
            }
            arr[j]=largest;           
        }
    }
        for(int i:arr)
        {
            System.out.println(i);
        }
        
    } 
}
