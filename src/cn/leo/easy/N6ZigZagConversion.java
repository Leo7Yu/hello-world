package cn.leo.easy;

/**
 * 6 Z 字形变换
 * https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class N6ZigZagConversion {

    public static void main(String[] args) {
        String string = "PAYPALISHIRING";
        string = convert(string, 3);
        System.out.println(string);
    }

    private static String convert(String s, int numRows) {
        StringBuilder[] sBuilders = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sBuilders[i]=new StringBuilder();
        }
        
        
        for(int i=0;i<s.length();i++){
            sBuilders[i%3].append(s.charAt(i));
        }
        
        StringBuilder result=new StringBuilder();
        for(StringBuilder sBuilder:sBuilders){
            result.append(sBuilder);
        }

        return result.toString();
    }
}
