package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;
Scanner input = new Scanner(System.in);
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class Member{
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("1", "Dave"));
        members.add(new Member("2", "Sarah"));
        members.add(new Member("3", "Tom"));

        for (Member member : members) {
            System.out.println(member);
        }
    private String memberid;
    private String name;
    private int age;

    ArrayList <String> strings;



    public Member (int age, String name,String memberid ) {
        this.age = age;
        this.name = name;
        this.memberid = memberid;
    }


    public String getMemberid() {return memberid;}
    public String getName() {return name;}

    public int getAge() {
        return age;
    }
     displayDetails() {
        return age;
        return name;
        return memberid;
         System.out.println(name);
    }
    }


}