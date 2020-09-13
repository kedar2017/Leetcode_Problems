class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        int[] buckets = new int[10];

        for(int i =0;i<digits.length;i++){
            buckets[digits[i]-'0'] = i;
        }

        for(int j=0;j<digits.length;j++){
            for(int k=9;k>digits[j]-'0';k--){
                if(buckets[k] > j){
                    char temp = digits[j];
                    digits[j] = digits[buckets[k]];

                    digits[buckets[k]] = temp;

                    return Integer.valueOf(new String(digits));
                }
            }
        }

        return num;
    }
}