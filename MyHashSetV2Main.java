package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member name = new Member("audwns");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("audwns.hashCode() = " + name.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(name);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("bucket.contains(" + searchValue + ") = " + result);
    }
}