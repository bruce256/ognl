package com.alibaba.ls;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther 儒尊
 * @date 2018/4/23
 **/
public class FelTest {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 0; i < 10000; i++) {
			FelEngine felEngine = new FelEngineImpl();
			//list.add(felEngine);
		}
		
		System.out.println("end");
		try {
			Thread.sleep(100000000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
