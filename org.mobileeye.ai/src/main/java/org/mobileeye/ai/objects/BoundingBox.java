package org.mobileeye.ai.objects;

public class BoundingBox {

	private final Point2f point1;
	private final Point2f point2;
	private final Point2f point3;
	private final Point2f point4;
	
	public BoundingBox(final Point2f point1, final Point2f point2, final Point2f point3, final Point2f point4) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}

	public Point2f getPoint1() {
		return point1;
	}

	public Point2f getPoint2() {
		return point2;
	}

	public Point2f getPoint3() {
		return point3;
	}

	public Point2f getPoint4() {
		return point4;
	}
}
