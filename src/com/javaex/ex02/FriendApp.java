package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	List<Friend>fList = new ArrayList<Friend>();
    	
    	for(int i=0; i<3; i++) {
    		String input = sc.nextLine();
    		
    		String[] friendsInfo = input.split(" ");
    		String name = friendsInfo[0];
    		String hp = friendsInfo[1];
    		String school = friendsInfo[2];
    		
    		Friend friends = new Friend(name,hp,school);
    		fList.add(friends);
    	}
    	
    	for(Friend f : fList) {
    		f.draw();
    	}
    	
    	sc.close();
    }//main end

}
