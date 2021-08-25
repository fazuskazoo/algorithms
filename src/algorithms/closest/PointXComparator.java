package algorithms.closest;

import java.util.Comparator;

public class PointXComparator implements Comparator<Point> {

	public int compare(Point a, Point b) {
		if(a.getX() == b.getX()) {
			return 0;
		} else {
			return a.getX() > b.getX() ? 1 : -1;
		}
	}
	
}
