package com.dreamquest.practice.immutable;

public class MainPerson {

    public static void main(String[] args) {

        Person kid1 = new Person("Kid1","07/07/2042");
        Person kid2 = new Person("Kid2","07/07/2043");
        Person kid3 = new Person("Kid3","07/07/2044");

        Person[] kids = {kid1,kid2,kid3};

        Person originalP = new Person("Sayan", "07/07/1999",kids);
        System.out.println("Original Person? "+originalP);

//        Person[] getCopyKids = originalP.getKids();
//        getCopyKids[1] = new Person("Kid5","07/07/2054");
//
//
//
        kids[0] = new Person("kid6",null);
        System.out.println(originalP);


        // Create a shallow copy
//        Person shallowCopyP = new Person(originalP);
//        System.out.println("Shallow Copy: " + shallowCopyP);
//
//        // Modify the shallow copy's kids array
//        Person[] getCopyKids = shallowCopyP.getKids();
//        getCopyKids[1] = new Person("Kid5", "07/07/2054");
//
//        System.out.println("Modified Shallow Copy: " + shallowCopyP);
//        System.out.println("Original after modification: " + originalP);




    }
}
