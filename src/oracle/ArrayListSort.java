package oracle;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSort {
    /*
    Write a method which accepts arraylist of integers and returns second highest number.
     */

    public static void main(String args[])throws Exception
    {

        /*
        * [-24,67,23,98,-45,34,90,27,290]
[24,67,23,98,45,34,90,27]
* */
        List<Integer> arr=new ArrayList<>();
        int arr1[]={-24,67,23,98,-45,34,90,27,290};
        for(int i:arr1)
        {
            arr.add(i);
        }
        System.out.println(SecondHighestELemet(arr));

        List<Integer> arr3=new ArrayList<>();
        int arr2[]={24,67,23,98,45,34,90,27};
        for(int i:arr2)
        {
            arr3.add(i);
        }
        System.out.println(SecondHighestELemet(arr3));


    }
    public static int SecondHighestELemet(List<Integer> arr)
    {
        int n=arr.size();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr.get(i)>arr.get(j))
                {
                    int temp=arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }

        return arr.get(n-2);
    }
}
