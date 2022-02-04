package com.company;

import java.util.Locale;

public class StringConcat {
    public static void main(String[] args) {
        String helloString="hello";
        String worldString="world";
        String secondHelloString="hello";
        String emptyString="";
        String statementOne="  Robert is very fast fast fast  ";
       // System.out.println(helloString.substring(0,4));

        String firstString=helloString+" "+worldString;
        System.out.println("First String ="+firstString);

        Object nullObject=null;
        String secondString = nullObject+" "+helloString;
        System.out.println("Second String ="+secondString);

        try {
            helloString.substring(6);
            String s = helloString.substring(6);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bound ");
        }

// Comparison of Strings
      boolean comparingString=firstString.equals(helloString);
        System.out.println(comparingString);

        comparingString=helloString.equalsIgnoreCase("hello");
        System.out.println(comparingString);

        comparingString=helloString.contentEquals("hello");
        System.out.println(comparingString);

        int comparingToString=helloString.compareTo(secondHelloString);
        System.out.println(comparingToString);

        comparingString=helloString.isEmpty();
        System.out.println(comparingString);
        comparingString=emptyString.isEmpty();
        System.out.println(comparingString);

        System.out.println(" ".isBlank());
        comparingString=helloString.isBlank();
        System.out.println(comparingString);
        comparingString=emptyString.isBlank();
        System.out.println(comparingString);

        //Text Searches

       boolean searchString=worldString.contains("a");
        System.out.println("1. "+searchString);

        searchString=helloString.endsWith("d");
        System.out.println("2. "+searchString);

        int indexOfValue=helloString.indexOf("o");
        System.out.println("3. "+indexOfValue);
        indexOfValue=statementOne.indexOf("very");
        System.out.println("4. "+indexOfValue);
        indexOfValue=statementOne.lastIndexOf("fast");
        System.out.println("5. "+indexOfValue);

        searchString=statementOne.matches("robert");
        System.out.println("6. "+searchString);

        searchString=helloString.startsWith("h");
        System.out.println("7. "+searchString);

        //Text Manipulation

        String manipulate=helloString.concat(" achyuth");
        System.out.println("1. "+manipulate);

        manipulate=worldString.replace("r","R");
        System.out.println("2. "+manipulate);
        manipulate=statementOne.replace("r","R");
        System.out.println("3. "+manipulate);
        manipulate=statementOne.replaceAll("a","A");
        System.out.println("4. "+manipulate);

        manipulate=worldString.join(" ",helloString,",",statementOne);
        System.out.println("5. "+manipulate);

        manipulate=helloString.substring(3);
        System.out.println("6. "+manipulate);

        manipulate= (String) helloString.subSequence(1,3);
        System.out.println("7. "+manipulate);


        String transform=statementOne.trim();
        System.out.println(statementOne);
        System.out.println("1."+transform);
        transform=statementOne.toUpperCase(Locale.ROOT);
        System.out.println("2."+transform.trim());
        System.out.println(statementOne.strip());
        System.out.println("3."+statementOne.repeat(2));


    }
}
