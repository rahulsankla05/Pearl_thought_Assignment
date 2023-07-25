package Basic_DSA;

import java.util.*;
public class Frequency {

    public static void main(String[] args) {
        int arr[]={1,6,2,4,6,8,9,10};     // repeating element is 6
        int n= arr.length;
        countfreq(arr,n);
    }
    public static void countfreq(int arr[],int n){
        Map<Integer,Integer> hm=new HashMap<>();

//        Traverse into the array//
        for(int i=0; i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }

        }
//        traverse into the hashmap//
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Repeating_element_is " + entry.getKey());
            }
//            System.out.println("Number: " + entry.getKey() + " " + "Basic_DSA.Frequency "+ entry.getValue());
        }
    }


}
// T.c: O(N) , S.C: O(N)