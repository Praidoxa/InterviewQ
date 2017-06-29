package test;


import java.util.TreeSet;

public class Test {

    public static void main(String[] args)  {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(12);
        treeSet.add(9);
        System.out.println(treeSet);
        TreeSet<Integer> treeSet1=new TreeSet<>((i1,i2)->-(i1-i2));
        treeSet1.add(6);
        treeSet1.add(3);
        treeSet1.add(4);
        treeSet1.add(12);
        treeSet1.add(8);

        for (Integer treeSet2:treeSet){
            System.out.println(treeSet2);
        }
    }
}