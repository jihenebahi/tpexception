package tpexceptions;

public class Mathematique {
	protected double x;
	protected double n;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	static public double f (double n,double x)
	{
		return Math.sqrt(x)/n;
	}


}
