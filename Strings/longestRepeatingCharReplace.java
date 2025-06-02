package Strings;

public class longestRepeatingCharReplace {

    public static int charReplace(String s, int k){

        int[] freq= new int[26];

        int left=0;
        int maxfreq=0;
        int maxWindow=0;

        for(int right=0;right<s.length();right++){

            //increasing the freq of the resp charecter
            freq[s.charAt(right) - 65 ]++;

            //making sure maxFreq updates if freq of any char is changed
            maxfreq=Math.max(maxfreq, freq[s.charAt(right) -65]);

            int window_length= right-left+1;

            if(window_length-maxfreq>k){
                
                //updating the freq of the left alphabet
                freq[s.charAt(left)-65]--;

                //moving left pointer forward
                left++;

            }

            //in case window gets updated- update the window length as well
            window_length= right-left+1;

            //set window length
            maxWindow=Math.max(maxWindow, window_length);

        }


        return maxWindow;
    }
    public static void main(String[] args) {

        String s="AABABBA";
        int k=2;
        System.out.println(charReplace(s, k));
        
    }
}
