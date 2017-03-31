package zadaci_30_03_2017;

public class Zadatak5 {

	public static void main(String[] args) {

		MyStack stack1 = new MyStack();
		for (int i = 0; i < 10; i++) {
			stack1.push(i);
		}
		MyStack stack2 = (MyStack) stack1.clone();
		// izbacujemo 2 elementa
		stack1.pop();
		stack1.pop();

		// prikaz velicine obadva stacka da se vidi da su razliciti
		System.out.println("Velicina stack1 = " + stack1.getSize());
		System.out.println("Velicina stack1 = " + stack2.getSize());

	}

}
