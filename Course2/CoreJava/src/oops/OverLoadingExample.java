package oops;

public class OverLoadingExample {
	
	public int GetArea(int l, int b) {
		return l*b;
	}
	
	public int GetArea(int l) {
		return l*l;
	}
	
	public float GetArea(float l) {
		return l*l;
	}

}
