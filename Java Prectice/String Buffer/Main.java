public class Main {
    public static void main (String[] args) {
        
        // String
        // String is immutable
        // We can not make changes in string
        String str = new String("Hello World, This is String");
        System.out.println(str);

        // String Buffer
        // String is mutable
        // We can cange in string buffer
        StringBuffer strBuffer = new StringBuffer("abcdef");
        System.out.println(strBuffer);
        

        // setCharAt (it will replace that character of given index)
        strBuffer.setCharAt(3, 'j');
        System.out.println(strBuffer);    
        
        // append (it will add characters at the end)
        strBuffer.append("Hlllo");
        System.out.println(strBuffer);    
        
        // insert (it will inserted characters at given index and it will shift other characters)
        strBuffer.insert(3, "00");
        System.out.println(strBuffer);
        
        // setLength (if we se length to lower it will set length of string to given length)
        strBuffer.setLength(6);
        System.out.println(strBuffer);

        // if we want to change string buffer to upperCase
        // we need to convert stringBuffer to String then change to upperCase with toUpperCase() method
        // the again convert into stringBuffer
        String strUpper = new String(strBuffer).toUpperCase();
        strBuffer = new StringBuffer(strUpper);
        System.out.print(strBuffer);
        
    }
}