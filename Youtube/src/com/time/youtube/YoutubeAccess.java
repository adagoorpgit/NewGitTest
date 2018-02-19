package com.time.youtube;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeAccess {

	public static void main(String[] args) throws InterruptedException 
	{
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		String[] A={"A","B","C"};
		
		for(int i=0;i<=2;i++)
		{
			map.put(i, A[i]);
		}
		
		
		
		
	 for(Integer key:map.keySet())
	 {
		System.out.println(key);
	 }
	 
	 
		
	}

}
