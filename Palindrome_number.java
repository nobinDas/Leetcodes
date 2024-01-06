class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        System.out.println(number);
        int mid = 0;
        if (number.length() % 2 == 0) {
            mid = (number.length() / 2) - 1;
        } else {
            mid = (number.length() - 1) / 2;
        }
        for (int i = 0; i <= mid; i++) {
            if (number.charAt(i) != number.charAt((number.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
