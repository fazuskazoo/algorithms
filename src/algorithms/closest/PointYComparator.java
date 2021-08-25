package algorithms.closest;

import java.util.Comparator;

public class PointYComparator implements Comparator<Point> {

	public int compare(Point a, Point b) {
		if(a.getY() == b.getY()) {
			return 0;
		} else {
			return a.getY() > b.getY() ? 1 : -1;
		}
	}
	
}
