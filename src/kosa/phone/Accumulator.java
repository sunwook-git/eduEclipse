package kosa.phone;

public class Accumulator {

		int total = 0;
		static int grandTotal = 0;
		final static int f_total = 0;
		
		void accumulator(int amount) {
			total += amount;
			grandTotal += amount;
			//f_total += amount;
		}
		
}
