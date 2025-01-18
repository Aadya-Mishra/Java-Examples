package com.pattern_3;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i ,j;
for (i=0;i<4;i++) {
	for(j=0;j<=i;j++) {
		if((i+j)%2==0) {
			System.out.print(" 1 ");
		}
		else {
			System.out.print(" 0 ");
		}
	}
	System.out.println();
}
	}

}
