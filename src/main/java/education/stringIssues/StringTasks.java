package education.stringIssues;

import education.BaseService;

/**
 * Created with IntelliJ IDEA.
 * User: solomin-y
 * Date: 7/17/15
 * Time: 10:27 AM

 */
public class StringTasks implements BaseService{

    public <T> T execute(T... s) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(StringTasks.findSubstring("abcabacdefghijklmnmnmnmnmnmnnm", "abca"));
    }

    public static boolean findSubstring(String source, String find) {
        if (find.length()>source.length())
            return false;
        for (int i=0; i< source.length(); i++) {
            int counter = 0;
            for (int j=0; j< find.length(); j++) {
                if (i+j <source.length() && find.charAt(j)== source.charAt(i+j)) {
                    counter++;
                }
                else
                    break;
            }
            if (counter == find.length())
                return true;
        }

        return false;
    }
}
