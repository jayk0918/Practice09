package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	List<Goods>gList = new ArrayList<Goods>();
    	int sum = 0;
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		String input = sc.nextLine();
    		if(input.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("=======================");
    			break;
    		}else {
    			String[] goodsInfo = input.split(",");
        		String name = goodsInfo[0];
        		Integer price = Integer.parseInt(goodsInfo[1]);
        		Integer count = Integer.parseInt(goodsInfo[2]);
        		
        		Goods products = new Goods(name, price, count);
        		gList.add(products);
        		sum += count;
    		}
    	}//while end
    	
    	for(Goods g :gList) {
    		g.draw();
    	}
    	System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
    	
    	sc.close();
    }// main end

}
