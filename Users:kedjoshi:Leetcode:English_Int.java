package users.kedjoshi.leetcode;

public class English_Int{
    public static Solution{
        String[] smalls = {"Zero", "One", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen", "Seventeen","Eighteen","Nineteen"};

        String[] tens = {"","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        String[] bigs = {"","Thousand","Million","Billion"};

        String hundred = "Hundred";
        String negative = "Negative";

        public String englishInt(int num){
            if(num == 0){
                return smalls[0];
            }
            else if(num < 0){
                return negative + " " + englishInt(-1*num);
            }

            LinkedList<String> parts = new LinkedList<String>();

            int chunkCount = 0;

            while(num > 0){
                if(num%1000 != 0){
                    String chunk = convertChunk(num%1000) + " " + bigs[chunkCount];
                    parts.addFirst(chunk);
                }

                num = num/1000;
                chunkCount++;
            }

            return parts;
        }

        public String convertChunk(int abc){

            LinkedList<String> parts = new LinkedList<String>();

            if(abc > 100){
                String str = smalls[abc/100] + hundred + " ";
                parts.addLast(str);

                abc = abc % 100;
            }

            if(abc <= 19 && abc >= 10){
                parts.addLast(smalls[abc]);
            }

            else if(abc >= 20){
                parts.addLast(tens[abc/10]);
                abc = abc%10;
            }

            if(abc <= 9 && abc >= 0){
                parts.addLast(smalls[abc]);
            }

            return parts;

        }

        String listToString(LinkedList<String> parts){
            StringBuilder sb = new StringBuilder();

            while(parts.size()>1){
                sb.append(parts.pop());
                sb.append(" ");
            }

            sb.append(parts.pop());
            return sb.toString();
        }


    }
}