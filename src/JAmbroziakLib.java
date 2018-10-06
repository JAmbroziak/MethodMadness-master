public class JAmbroziakLib {
    /**
     * Checks a word to see if it is a palindrome or not
     * @param str the word to check
     * @return a boolean value: true if palindrome, false if not
     */
    public static boolean isPalindrome(String str)
    {
        String pDrome = "";
        for(int i = str.length(); i > 0; i--)
        {
            pDrome += str.substring(i-1, i);
        }
        if (str.equals(pDrome))
        {
            return true;
        }
        return false;
    }

    /**
     * reformats a (mm/dd/yyyy) date into (dd - mm - yyyy)
     * @param date a date in the (mm/dd/yyyy) format
     * @return a string of the date in (dd - mm - yyyy) format
     */
    public static String dateStr(String date)
    {
        String mm = date.substring(0,2);
        String dd = date.substring(3,5);
        String yyyy = date.substring(6);
        return (dd + " - " + mm + " - " + yyyy);
    }

    /**
     * removes the first occurence of String sub from String main
     * @param main the main string
     * @param sub the string to be removed from String main
     * @return String main with the first occurence of String sub removed from it
     */
    public static String cutOut(String main, String sub)
    {
        int subStart = main.indexOf(sub);
        int subEnd = subStart + sub.length();
        if(!main.contains(sub))
        {
            return main;
        }
        return (main.substring(0, subStart) + main.substring(subEnd));
    }

    /**
     * Adds positive integers together from 0 to n
     * @param n the number of sequential integers
     * @return int value of the sum
     */
    public static int sumUpTo(int n)
    {
        int sum = 0;
        for(int i = 0; i<n+1; i++)
        {
            sum+=i;
        }
        return sum;
    }

    /**
     * checks if int n is a number in the Fibonacci sequence
     * @param n the number to be checked
     * @return a boolean value: true if n is a Fibonacci number, false if not
     */
    public static boolean isFibonacci(int n)
    {
        int a = 1;
        int b = 0;
        int fibo = 0;
        while(fibo < n)
        {
            fibo = a+b;
            b = a;
            a = fibo;
            if(fibo == n)
            {
                return true;
            }
        }
        return false;
    }
}