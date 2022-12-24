/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericp9;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author febri
 */
public class ListDeque {
    public static void main(String[] args) {
        System.out.println("\t Array DEQUE");
        ArrayDeque <String> deque = new ArrayDeque<>();
        deque.add("Ario");
        deque.add("Febri");
        for(String i:deque){
            System.out.println(i);
        }
        System.out.println("\n\n");
        
        //Penggunaan ArrayList
        System.out.println("\t Array LIST");
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Ario");
        list.add("Febri");
        list.add("Raharjo");
        
        for(int i = 0; i<3; i++){
            System.out.println(list.get(i));
        }
    }
}
