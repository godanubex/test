package th.ac.su.mid.Next;

public class idnumber {
    public enum CheckResult {
        yes, no, not
    }
    public CheckResult checkId(String text) {
        CheckResult result = null;
        int count = 0;
        boolean cheack = true;
        if (text.length() == 13) {
            char x = text.charAt(0);
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '1' || text.charAt(i) == '2') {
                    if (text.charAt(i) == x) {
                        continue;
                    }
                    else {
                        count++;
                    }
                }
                else {
                    cheack = false;

                }
            }
            if (count != 0 || cheack == false) {
                result = CheckResult.no;

            }
            else {
                result = CheckResult.yes;
            }
        }
        else   {
            result = CheckResult.not;

        }
        return  result;
    }
}

