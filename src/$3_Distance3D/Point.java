package $3_Distance3D;

class Point {
	private double x;
	private double y;
	private double z;

	Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	double distance(Point p2) {
		double dx = this.x - p2.x;
		double dy = this.y - p2.y;
		double dz = this.z - p2.z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}
}
