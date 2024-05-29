class Solution {
    public int numSteps(String s) {
        int pointer = s.length() - 1;
        int step = 0;
        int carry = 0;

        while (pointer > 0) {
            step++;

            if (s.charAt(pointer) - '0' + carry == 1) {
                carry = 1;
                step++;
            }

            pointer--;
        }

        return step + carry;
    }
}