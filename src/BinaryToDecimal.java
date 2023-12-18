public class BinaryToDecimal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int binaryToDecimal(String binaryString){
        int decimalValue = 0;

        int len = binaryString.length();

        for(int i=0; i < len; i++){
            int digit = Character.getNumericValue(binaryString.charAt(i));
            int power = len -i -1;
            decimalValue = decimalValue + (int) (digit * Math.pow(2, (double)power));
        }

        return decimalValue;
        
    }
}
