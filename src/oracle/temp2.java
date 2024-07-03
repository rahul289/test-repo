package oracle;

public class temp2 {

    public static void main(String args[])throws Exception
    {
        //arr1=[10,30,2,600,70,-90,20]
//  arr2=[70,50,100,400,-90,-100,400,-20,-50,30]
//        sort and merge in single array
        int arr1[]={10,30,2,600,70,-90,20};
        int arr2[]={70,50,100,400,-90,-100,400,-20,-50,30};
        int arr3[]=sort2Array(arr1,arr2);
        System.out.println("The elements: ");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
    public static int[] sort2Array(int arr1[],int arr2[])
    {
//        arr1=sortArray(arr1);
        int n1=arr1.length;
        int n2=arr2.length;
        int arr3[]=new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++)
        {
            arr3[k++]=arr1[i];
        }
        for(int i=0;i<n2;i++)//
        {
            arr3[k++]=arr2[i];
        }
        sortArray(arr3);
        return arr3;
    }
    public static int[] sortArray(int arr1[])
    {
        int n=arr1.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        return arr1;
    }
}
