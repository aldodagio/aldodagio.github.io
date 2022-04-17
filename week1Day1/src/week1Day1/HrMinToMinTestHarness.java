package week1Day1;

public class HrMinToMinTestHarness {
	public static int hrMinToMin(int origHours, int origMinutes) {
		int toMinutes;
		toMinutes = (origHours * 60) + origMinutes;
		return origMinutes;
	}
	
	public static void main(String[] args) {
		System.out.println("Testing started...");
		System.out.println("0:0, expecting 0, got " + hrMinToMin(0,0) );
		System.out.println("0:1, expecting 1, got " + hrMinToMin(0,1) );
		System.out.println("0:99, expecting 99, got " + hrMinToMin(0,99) );
		System.out.println("1:0, expecting 0, got " + hrMinToMin(0,0) );
	}
	
}
