public class JAmbroziakLib {

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

    public static String dateStr(String date)
    {
        String mm = date.substring(0,2);
        String dd = date.substring(3,5);
        String yyyy = date.substring(6);
        return (dd + " - " + mm + " - " + yyyy);
    }

    public static String cutOut(String main, String sub)
    {
        int subStart = main.indexOf(sub);
        int subEnd = subStart + sub.length();
        if(main.indexOf(sub) == -1)
        {
            return main;
        }
        return (main.substring(0, subStart) + main.substring(subEnd));
    }

    public static int sumUpTo(int n)
    {
        int sum = 0;
        for(int i = 0; i<n+1; i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static int isFibonacci(int n)
    {
        int a = 0;
        int b = 1;
        int fibo = 0;
        for(int i = 0; i<n-1; i++)
        {
            fibo = (a+b);
            a = b;
            b = fibo;
        }
        return fibo;
    }
}