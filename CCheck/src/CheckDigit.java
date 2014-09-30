
public class CheckDigit {
	private int temp1;
	
	public static int sum_even(long num) {

        int result = 0;
        long temp = 0;

        while (num > 0) {
            temp = num % 100;
            result += getDigit((int) (temp / 10) * 2);
            num = num / 100;
        }

        return result;
    }
	
	public static int sum_odd(long num) {
        int result = 0;

        while (num > 0) {
            result += (int) (num % 10);
            num = num / 100;
        }

        return result;
    }

	public static int getSize(long s) {

        int count = 0;

        while (s > 0) {
            s = s / 10;

            count++;
        }

        return count;

    }
	
	public static void first_num(long num, int d) {

        if ((getPrefix(num, d) == 4)
                || (getPrefix(num, d) == 5)
                || (getPrefix(num, d) == 3)) {

            if (getPrefix(num, d) == 3) {
                System.out.println("Its a Visa Card ");
            } else if (getPrefix(num, d) == 5) {
                System.out.println("Its a Master Card ");
            } else if (getPrefix(num, d) == 3) {
                System.out.println("Its an American Express Card ");
            } 

        }
    }
	
	public static long getPrefix(long num, int k) {

        if (getSize(num) < k) {
            return num;
        } else {

            int size = (int) getSize(num);

            for (int i = 0; i < (size - k); i++) {
                num = num / 10;
            }

            return num;

        }

    }
	
	public static int getDigit(int num) {

        if (num <= 9) {
            return num;
        } else {
            int firstDigit = num % 10;
            int secondDigit = (int) (num / 10);

            return firstDigit + secondDigit;
        }
    }
	
	

}
