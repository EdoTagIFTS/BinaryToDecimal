import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci una stringa binaria: ");
        String binaryString = scanner.nextLine();
        
        int decimalValue = binaryToDecimal(binaryString);
        
        System.out.println("Valore decimale: " + decimalValue);
        
        scanner.close();
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