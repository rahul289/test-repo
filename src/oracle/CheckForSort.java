package oracle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckForSort {
/*
* fadfs
*
* //take input as string
    //process data and put it in LinkList.
    //Create the new list from existing list and sort the data
    //check the new list against the existing list data
    * if it matches return true else return false
    * create
*
* */


    public static void main(String args[])throws Exception
    {

        try {
//            Response res=given("endpoint").
//                    header().body().when.post("endpoint").then.status();
//            body=res.getBody();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String input="{\n" +
                "    \"page\": 1,\n" +
                "    \"per_page\": 6,\n" +
                "    \"total\": 12,\n" +
                "    \"total_pages\": 2,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"email\": \"george.bluth@reqres.in\",\n" +
                "            \"first_name\": \"George\",\n" +
                "            \"last_name\": \"Bluth\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/1-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"email\": \"janet.weaver@reqres.in\",\n" +
                "            \"first_name\": \"Janet\",\n" +
                "            \"last_name\": \"Weaver\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3,\n" +
                "            \"email\": \"emma.wong@reqres.in\",\n" +
                "            \"first_name\": \"Emma\",\n" +
                "            \"last_name\": \"Wong\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/3-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 4,\n" +
                "            \"email\": \"eve.holt@reqres.in\",\n" +
                "            \"first_name\": \"Eve\",\n" +
                "            \"last_name\": \"Holt\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/4-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 5,\n" +
                "            \"email\": \"charles.morris@reqres.in\",\n" +
                "            \"first_name\": \"Charles\",\n" +
                "            \"last_name\": \"Morris\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/5-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 6,\n" +
                "            \"email\": \"tracey.ramos@reqres.in\",\n" +
                "            \"first_name\": \"Tracey\",\n" +
                "            \"last_name\": \"Ramos\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/6-image.jpg\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"support\": {\n" +
                "        \"url\": \"https://reqres.in/#support-heading\",\n" +
                "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\n" +
                "    }\n" +
                "};";

        List<String> names=processIntput(input);
        if(verifyOutput(names))
        {
            System.out.println("Testcase passed");
        }
        else
        {
            System.out.println("Testcase failed");
        }

    }

    public static List<String> processIntput(String input)
    {
        String process[]=input.split("\n");
        List<String> names=new ArrayList<>();
        for(int i=0;i<process.length;i++)
        {
            if(process[i].contains("first_name"))
            {
                String name[]=process[i].split(":");
                //"first_name":
                // "Eve",

                String firstName=name[1].replaceAll("[^a-zA-z]","");
                System.out.println("Adding "+firstName);
                names.add(firstName);
            }
        }
        return names;
    }

    public static boolean verifyOutput(List<String> names)
    {
        List<String> alphaNames=new ArrayList<>();
        //copy
        for(String name:names)
            alphaNames.add(name);

        Collections.sort(alphaNames);

        for(int i=0;i<names.size();i++)
        {

            if(!alphaNames.get(i).equals(names.get(i))) {
                System.out.println(alphaNames.get(i)+":Alpa   Names "+names.get(i));
                return false;
            }
        }
        return true;
    }
}
