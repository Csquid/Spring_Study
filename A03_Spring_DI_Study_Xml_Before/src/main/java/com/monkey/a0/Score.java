package com.monkey.a0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Score {
	
	private HashMap<String, Integer> hashMapScore;
	private int scoreSum;
	private double scoreAverage;
	
	public Score() {
		this.init();
	}
	
	public void init() {
		hashMapScore = new HashMap<String, Integer>();
		hashMapScore.put("korean", 0);
		hashMapScore.put("english", 0);
		hashMapScore.put("math", 0);
		hashMapScore.put("science", 0);
	}
	
	public void setScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Korean: ");
		this.hashMapScore.put("korean", sc.nextInt());
		
		System.out.print("English: ");
		this.hashMapScore.put("english", sc.nextInt());
		
		System.out.print("Math: ");
		this.hashMapScore.put("math", sc.nextInt());
		
		System.out.print("Science: ");
		this.hashMapScore.put("science", sc.nextInt());
        
		this.setSum();
		this.setAverage();
	}
	
	public void setSum() {
        Iterator<String> keys = this.hashMapScore.keySet().iterator();
        
        while( keys.hasNext() ){
            String key = keys.next();
            this.scoreSum += this.hashMapScore.get(key);
        }
        
	}
	
	public void setAverage() {
		this.scoreAverage = this.scoreSum / this.hashMapScore.size();
	}
	
	public void showScore() {
		String areaLocation = "Score";
		
		StaticMethod.showArea(areaLocation, StaticMethod.start);
		
        Iterator<String> keys = this.hashMapScore.keySet().iterator();
        
        while( keys.hasNext() ){
            String key = keys.next();
            //System.out.println( String.format("Å° : %s, °ª : %s", key, this.score.get(key)) );
            System.out.println(key + ": " + this.hashMapScore.get(key));
        }
        
        System.out.println("\nScore Sum: " + this.scoreSum);
        System.out.println("Score Average: " + this.scoreAverage);
        
        StaticMethod.showArea(areaLocation, StaticMethod.end);
	}

}
