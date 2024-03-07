import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List <Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(1);
        al.add(1);
        for (Integer n : al){
        System.out.println(n);}
        System.out.println(al.indexOf(1));
        HashSet<Integer> h =new HashSet<Integer>(5);
        for (int i =0;i<6;i++){
            h.add(i);
        }
            System.out.println(h);
        Iterator <Integer>i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
//    Code explaining hashset and hashmap
//        package coreJava;
//
//        import java.util.HashMap;
//        import java.util.Iterator;
//        import java.util.Map;
//        import java.util.Map.Entry;
//        import java.util.Set;
//
//public class hashMapexample {
//
//    public static void main(String[] args) {
//// TODO Auto-generated method stub
//
//        HashMap<Integer,String> hm=new HashMap<Integer,String>();
//        hm.put(0, "hello");
//        hm.put(1, "Gudbye");
//        hm.put(42, "morning");
//        hm.put(3, "evening");
//
//
//        System.out.println(hm.get(42));
//        hm.remove(42);
//        System.out.println(hm.get(42));
//        Set sn= hm.entrySet();
//        Iterator it =sn.iterator();
////hashtable -pass table set collections
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//            Map.Entry mp=(Map.Entry)it.next();//
//            System.out.println(mp.getKey());
//            System.out.println(mp.getValue());
//
//
//        }
//    }}
//
//// HashSet
//
//package coreJava;
//
//        import java.util.HashSet;
//        import java.util.Iterator;
//
//public class hashSetexample {
//
//    public static void main(String[] args) {
//// TODO Auto-generated method stub
//
////HashSet treeset, LinkedHashset implements Set interface
////does not accept duplicate values
//// There is no guarantee elements stored in sequential order..Random order
//
//        HashSet<String> hs= new HashSet<String>();
//        hs.add("USA");
//        hs.add("UK");
//        hs.add("INDIA");
//        hs.add("he");
//        hs.add("she");
//
//
//        hs.add("INDIA");
//        System.out.println(hs);
////System.out.println(hs.remove("UK"));
//        System.out.println(hs.isEmpty());
//        System.out.println(hs.size());
//
//        Iterator<String> i=hs.iterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }
//
//
//
//
//    }
//
//}
//
