package oracle;

import java.util.*;

public class temp1 {
        //String str = “mississippi  m  i p
    //approach
    //seems key value pattern
    //use hashmap
    //print the key value

    static String s1="Rahul";

    public static void main(String args[])throws Exception
    {
        String str=new String("Rahul");
        String s3="Rahul";
        countCharacterOccurence("mississippi");
//        addString(s1,s3);
    }
//    //s3
//    public void selectElement( driver)
//    {
//        List<WebElemtent> listOfElement=driver.findElements(By.xpath("//tag[]"))//list of elements
//        HashSet<String> set1=new HashSet<>();
//        for(WebElement el:listOfElement)
//        {
//            set1.add(el.getText());
//        }
//        System.out.println("Unique element:" +set1.size());
//        System.out.println("THe unique elements are:");
//        for(String s:set1)
//        {
//            System.out.println(s);
//        }
//    }
    public static void addString(String s1,String s2)
    {

        if(s1==s2)
        {
            System.out.println("1");
        }
        else if(s1.equals(s2))
        {
            System.out.println("2");
        }
    }

    public static void countCharacterOccurence(String str)throws Exception
    {
        //String str="mississippi";

        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
//        Collections.sort(map);

        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
