package com.company;

public class ReversingString {
    public static void main(String[] args) {
        String name="catalin";
        String reverseName="";

        String[] nameList=new String[]{"robbert","stain"};
        StringBuilder newName=new StringBuilder("katrin");
        StringBuffer secondNewNAme=new StringBuffer("Banner");

        for (int i=name.length()-1;i>=0;--i){
            reverseName +=name.charAt(i);
        }
        System.out.println(reverseName);

       // reverseName=newName.reverse();
        System.out.println("Reversed string :"+reverseName);
    }
}
