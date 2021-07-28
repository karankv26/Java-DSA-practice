
import java.util.*;
class Main {

    public static void duplicate(char str[], int length){
        int index = 0;
        for (int i = 0; i<length;i++){
            int j;
            for (j = 0; j < i;j++){
                if (str[i] == str[j]){
                    break;
                }
            }
            if (j == i){
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str,index)));
    }

    public static void main(String args[] ) {
        
       
        System.out.print("Enter a string: ");
        Scanner s = new Scanner(System.in);
        String stri  = s.next();                
        char str[] = stri.toCharArray();
        int len = str.length;
        duplicate(str,len);

    

    }
}
