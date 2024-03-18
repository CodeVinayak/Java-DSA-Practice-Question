// url : https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=3&difficulty=Basic&sortBy=submissions

class GfG {
    int convertfive(int num) {
        // convert int num to string
        String intNum=String.valueOf(num);
        //Initize stringBuilder
        StringBuilder modifiedNumString=new StringBuilder();
        for(int i=0;i<intNum.length();i++)
        {
            char digit=intNum.charAt(i);
            if (digit=='0')//compare with char 0 so use '0' not 0
            {
                modifiedNumString.append('5');
            }else{
                modifiedNumString.append(digit);
            }
        }
        //convert modifiedNum string to int
        int modifiedNum=Integer.parseInt(modifiedNumString.toString());
        return modifiedNum;
    }
}
//Time complexity: O(n)
// Space complexity: O(n)