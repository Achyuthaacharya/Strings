package com.company;

public class ReversingString {
    public static void main(String[] args) {
        String name="catalin";
        String reverseName="";
        String nameOne="Ajay";
        nameOne=nameOne+"kumar";

        String[] nameList=new String[]{"robbert","stain"};

        String nameTwo=new String("catalin");
        System.out.println(name==nameTwo);
        StringBuilder newName=new StringBuilder("Ajay");
        newName.append(" Kumar");
        newName.append(" Singh");
        StringBuffer secondNewNAme=new StringBuffer("Banner");

        for (int i=name.length()-1;i>=0;i--){
            reverseName +=name.charAt(i);
        }
        System.out.println(reverseName);

      reverseName=newName.reverse().toString();
        System.out.println("Reversed string :"+reverseName);
    }
}
