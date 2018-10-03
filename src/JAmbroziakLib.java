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
        return (main.substring(0, subStart) + main.substring(subEnd));
    }
}