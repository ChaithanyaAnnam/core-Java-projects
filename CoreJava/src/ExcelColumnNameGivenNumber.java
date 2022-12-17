import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExcelColumnNameGivenNumber {
    public static void main(String[] args) {
       // System.out.println(printString(703));
        printColumnName(89);
    }

    private static String printString(int columnNumber){
        String temp;
        StringBuilder columnName = new StringBuilder();
        while (columnNumber > 0) {
            // Find remainder
            int rem = columnNumber % 26;

            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            } else // If remainder is non-zero
            {
                columnName.append((char) ((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
        return columnName.reverse().toString();
    }

    public static void printColumnName(int columnNumber) {
        char[] alphabets =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Map<Integer,String> excelData = new LinkedHashMap<>();
        excelData.put(1,"A");
        excelData.put(2,"B");
        excelData.put(3,"C");
        excelData.put(4,"D");
        excelData.put(5,"E");
        excelData.put(6,"F");
        excelData.put(7,"G");
        excelData.put(8,"H");
        excelData.put(9,"I");
        excelData.put(10,"J");
        excelData.put(11,"K");
        excelData.put(12,"L");
        excelData.put(13,"M");
        excelData.put(14,"N");
        excelData.put(15,"O");
        excelData.put(16,"P");
        excelData.put(17,"Q");
        excelData.put(18,"R");
        excelData.put(19,"S");
        excelData.put(20,"T");
        excelData.put(21,"U");
        excelData.put(22,"V");
        excelData.put(23,"W");
        excelData.put(24,"X");
        excelData.put(25,"Y");
        excelData.put(26,"Z");

        int count = 26;
        for(int i=1;i<=alphabets.length;i++){
            for(int j=i;j<=alphabets.length;j++){
                count++;
                excelData.put(count, excelData.get(j)+excelData.get(i));
            }
            //count=count+26;
        }
        System.out.println("Value at "+columnNumber+" is "+excelData.get(columnNumber));

    }
}
