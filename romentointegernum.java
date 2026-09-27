public class romentointegernum {
    
    class Solution {
    public int romanToInt(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = getValue(s.charAt(i));

            // Check if the current value is smaller than the next value
            if (i + 1 < s.length() && current < getValue(s.charAt(i + 1))) {
                ans = ans - current;
            } 
            else {
                ans = ans + current;
            }
        }

        return ans;
    }

    public int getValue(char ch) {

        if (ch == 'I') {
            return 1;
        }
        else if (ch == 'V') {
            return 5;
        }
        else if (ch == 'X') {
            return 10;
        }
        else if (ch == 'L') {
            return 50;
        }
        else if (ch == 'C') {
            return 100;
        }
        else if (ch == 'D') {
            return 500;
        }
        else {
            return 1000; // M
        }
    }
}

}
