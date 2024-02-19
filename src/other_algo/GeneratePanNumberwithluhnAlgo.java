package other_algo;

import java.util.Date;

/**
 * @author Kushal.Dalasaniya
 */
public class GeneratePanNumberwithluhnAlgo {

	public static int generateCheckDigit(String partialNumber) {
		partialNumber = partialNumber + "0";
		int len = partialNumber.length();
		int parity = len % 2;
		int sum = 0;

		for (int i = len - 1; i >= 0; i--) {
			int d = Character.getNumericValue(partialNumber.charAt(i));
			if (i % 2 == parity) {
				d *= 2;
			}
			if (d > 9) {
				d -= 9;
			}
			sum += d;
		}

		int checksum = sum % 10;

		return checksum == 0 ? 0 : 10 - checksum;
	}
	
	/**
	 * Check whether the card number is Luhn or not.
	 * @param cardNo
	 * @return boolean after checking card number
	 */
	static boolean checkLuhn(String cardNo) {
		int nDigits = cardNo.length();
		int nSum = 0;
		boolean isSecond = false;

		for (int i = nDigits - 1; i >= 0; i--) {
			int d = cardNo.charAt(i) - '0';
			if (isSecond == true)
				d = d * 2;

			nSum += d / 10;
			nSum += d % 10;

			isSecond = !isSecond;
		}
		return (nSum % 10 == 0);
	}

	public static void main(String[] args) {
		Date date = new Date();
		long timeStamp = date.getTime() / 10;

		String panNumber = "123456" + timeStamp;
		System.out.println("Pan number : " + panNumber);

		Integer checkDigit = generateCheckDigit(panNumber);
		System.out.println("Check Digit : " + checkDigit);

		String finalString = panNumber + checkDigit;
		System.out.println("Final Pan Number : " + finalString);

		System.out.println("Is the final pan number a Luhn number? : " + checkLuhn(finalString));
	}

}
