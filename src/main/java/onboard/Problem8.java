package onboard;

import java.util.List;

/**
 * 백준 2563
 * name: 색종이
 * 실버 5
 * link : https://www.acmicpc.net/problem/2563
 */
public class Problem8 {
    public static Integer solution(Integer paperNumber, Integer[][] locations){
        Integer answer = 0;
        Integer[][] paper= new Integer[100][100];
	    for(int i=0;i<100;i++) {
	    	for(int j=0;j<100;j++) {
	    		paper[i][j]=0;	    	   
	    		}
	    }
	       
	    //검은 색종이의 수 많큼 붙이기
	    for(int i=0;i<paperNumber;i++) {
	    	int x=locations[i][0];
	    	int y=100-locations[i][1];
	    	   
	    	  
	    for(int j=y ; j>y-10 ; j--) {
	        for(int k=x ; k<x+10 ; k++) {
	    			paper[j][k]++;
	    		}
	    	}
	    }
	       
	    for(int i=0;i<100;i++) {
	    	for(int j=0;j<100;j++){
	    		if(paper[i][j]!=0){
	    			answer=answer+1;
	    		   }
	    	   }
	       }
        return answer;
    }
}
