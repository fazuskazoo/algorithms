package algorithms.closest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ClosestPoint {
	Random generator;
	public ClosestPoint() {
		this.generator = new Random(3000);		
	}
	
	double distance(Point x, Point y) {
		double xds = Math.pow(x.getX() - y.getX(),2);
		double yds = Math.pow(x.getY() - y.getY(),2);
		double distance = Math.sqrt(xds + yds);
		return distance;
	}  
	private int randomDouble() {
		int val = generator.nextInt(101);
		return generator.nextBoolean() ? val : -val;
		
	}
	 
	private Point randomPoint() {
		return new Point(randomDouble(), randomDouble());
	}
	public static void main(String args[]) {
		Point x = new Point(0,0);
		
		Point y = new Point(2,2);
		
		ClosestPoint cp = new ClosestPoint();
		double distance = cp.distance(x,y);
		
		System.out.println(distance);
		
		List<Point> pointList = new ArrayList<Point>();
		for(int i = 0; i < 100; i++) {
			pointList.add(cp.randomPoint());
		}
		Collections.sort(pointList, new PointXComparator());
		for(Point p: pointList) {
			System.out.println(p);
		}
		Collections.sort(pointList, new PointYComparator());
		for(Point p: pointList) {
			System.out.println(p);
		}
		
	}
}
