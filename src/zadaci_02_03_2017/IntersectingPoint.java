package zadaci_02_03_2017;

class IntersectingPoint {
	double x1, y1, x2, y2, x3, y3, x4, y4;

	IntersectingPoint() {
	}

	IntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}

	double getA() {
		return y1 - y2;
	}

	double getB() {
		return -(x1 - x2);
	}

	double getC() {
		return y3 - y4;
	}

	double getD() {
		return -(x3 - x4);
	}

	double getE() {
		return (y1 - y2) * x1 - (x1 - x2) * y1;
	}

	double getF() {
		return (y3 - y4) * x3 - (x3 - x4) * y3;
	}

	boolean isParalele() {
		if ((getA() * getD() - getB() * getC()) == 0) {
			return true;
		} else {
			return false;
		}
	}

	double getX() {
		return (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
	}

	double getY() {
		return (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
	}
}
