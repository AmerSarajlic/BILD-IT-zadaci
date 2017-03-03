package zadaci_02_03_2017;

public class TestRegularPolygon {

	public static void main(String[] args) {
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("rp1 povrsina: " + rp1.getArea() + ", obim: " + rp1.getPerimeter());
		System.out.println("rp2 povrsina: " + rp2.getArea() + ", obim: " + rp2.getPerimeter());
		System.out.println("rp3 povrsina: " + rp3.getArea() + ", obim: " + rp3.getPerimeter());
	}
}
