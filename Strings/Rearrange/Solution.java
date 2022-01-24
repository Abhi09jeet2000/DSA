class Solution
{
    public String arrangeString(String s)
        {
            int[] alphabets = new int[26];
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<s.length();i++){
                if(s.charAt(i)>=65 && s.charAt(i)<=90){
                    alphabets[s.charAt(i)-65]++;
                }else{
                    sum+=Character.getNumericValue(s.charAt(i));
                    // System.out.println(sum);
                }
            }
            for(int i =0; i<26;i++){
                while(alphabets[i]-->0){
                    sb.append((char)(i+65));
                }
            }
            sb.append(sum);
            return sb.toString();
        }
}