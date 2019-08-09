package prob01;

public class Printer{
	
	public void println(int intNum) {
		System.out.println(intNum);
	}
	public void println(boolean bool) {
		System.out.println(bool);
	}
	public void println(double dbNum) {
		System.out.println(dbNum);
	}
	public void println(String str) {
		System.out.println(str);
	}
	public void println(int intNum, boolean bool, double dbNum, String str) {
		System.out.println(intNum+", "+bool+", "+dbNum+", "+str);
	}
	
}
