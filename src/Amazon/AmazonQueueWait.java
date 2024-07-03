//package Amazon;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AmazonQueueWait {
//
//    public static void main(String args[])throws Exception
//    {
//        List<Integer> q=new ArrayList<>();
//        q.add(3);
//        q.add(1);
//        q.add(2);
//        q.add(1);
//        List<Integer> ans=findRequestInArray(q);
//        for (int element : ans) {
//            System.out.println(element);
//        }
//    }
//    public static List<Integer> findRequestInArray(List<Integer> wait)
//    {
//        int n=wait.size();
//        int diff[]=n ew int[n+1];
//        diff[0]=n;
//        for(int i=0,time=0;i<n;i++)
//        {
//            int waitTime=wait.get(i);
//            if(waitTime<= time+1)
//            {
//                if(waitTime== time+1)
//                {
//                    time++;
//                }
//                diff[waitTime]-=1;
//            }
//            else
//            {
//                diff[time+1]-=1;
//                time++;
//            }
//        }
//        for(int i=1;i<=n;i++)
//        {
//            diff[i]+=diff[i-1];
//        }
//        List<Integer> ans=new ArrayList<>();
//        for(int i=0;i<=n;i++)
//        {
//            if(diff[i]==0) {
//                ans.add(0);
//                break;
//            }
//            else
//                ans.add(diff[i]);
//        }
//        return ans;
//    }
//}
