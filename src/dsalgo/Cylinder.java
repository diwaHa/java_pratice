package dsalgo;



public class Cylinder {

	private double radius;
	private double height;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {	
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public Cylinder() {
		radius=1;
		height=2;
	}
	public Cylinder(int r) {
		radius=r;
		height=r;
	}
	public Cylinder(int r ,int h) {
		this.height=h;
		this.radius=r;
	}
	public double area() {
		//return 2*3.14*radius*(radius+height);
		return radius*height;
	}
	public static void main(String args[]) {
		
		Cylinder cy=new Cylinder(10,2);
		
		System.out.println("area of cylinder" +cy.area());
	}
	//hhhhhhhh
}
