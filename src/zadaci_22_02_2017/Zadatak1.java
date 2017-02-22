package zadaci_22_02_2017;

/**
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te
 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static int numberOfMonth() {
		return (int) (1 + (Math.random() * 12));
	}

	public static void main(String[] args) {

		String[] months = { "Ensar" , "Januar" , "Februar" , "Mart" , "April" , "Maj" , "Juni" , "Juli" , "August"
				, "Septembar" , "Oktobar" , "Novembar" , "Decembar" };


		System.out.println("Mjesec je: " + months[numberOfMonth()]);
		

	}

}
