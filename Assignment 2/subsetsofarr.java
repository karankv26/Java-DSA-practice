import java.lang.annotation.Target;
import java.util.*;

public class karan {

    public static void allSubsetWithoutReturnType(int arr[],int idx,String ans){
        if(idx==arr.length){
            System.out.println(ans);
            return;
        }
        allSubsetWithoutReturnType(arr,idx+1,ans);
        allSubsetWithoutReturnType(arr,idx+1,ans+arr[idx]+" ");
    }
    
    public static void main(String[] args){  
        int arr[]={1,2,3};
        allSubsetWithoutReturnType(arr,0,"");
        
    }
}
