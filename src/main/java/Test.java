import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Chuỗi: ");
        String string = scan.nextLine();

        int uppercase = printUppercaseInString(string);
        System.out.println("Số từ viết in hoa: " + uppercase);

        String uppercaseFirst = printUppercaseFirstChar(string);
        System.out.println("Chữ đầu viết in hoa: " + uppercaseFirst);

        String uppercaseWord = printUppercaseFirstWords(string);
        System.out.println("Chữ viết in hoa sau dấu: " + uppercaseWord);

        }

        public static int printUppercaseInString(String str){
            int uppercase = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    uppercase++;
                }
            }
            return uppercase;
        }

        public static String printUppercaseFirstChar(String str){
            char[] array = str.toCharArray();
                array[0] = Character.toUpperCase(array[0]);
                for (int i = 1; i < array.length; i++) {
                    if (Character.isWhitespace(array[i - 1])) {
                        array[i] = Character.toUpperCase(array[i]);
                    }
                }

                return new String(array);
            }

        public static String printUppercaseFirstWords(String str){
                char[] arr = str.toCharArray();
                boolean isPreDot = true;
                for (int i = 0; i < arr.length; i++){
                    if(isPreDot && Character.isLowerCase(arr[i])){
                        arr[i] = Character.toUpperCase(arr[i]);
                    } else {
                        arr[i] = Character.toLowerCase(arr[i]);
                    }
                    if(arr[i] != ' ') {
                        isPreDot = (arr[i] == '.');
                    }
                }
                return String.valueOf(arr);
            }
        }

