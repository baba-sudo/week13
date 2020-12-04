package class1;

public class work {
	public static void main(String[] args) {
		 for(int x=0;x<4;x++) {
	            for(int y=1;y<4-x;y++) {
	                System.out.print(" ");
	            }
	            for(int z=1;z<=2*x-1;z++) {
	                System.out.print("* ");
	            }
		 }
	     for(int x=0;x<4;x++) {
	            for(int z=7;z<=2*x-1;z--) {
	                System.out.print("* ");
	            }	            
	            for(int y=1;y<x;y++) {
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }}
