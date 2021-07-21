import java.util.*;

public class Main {


   
    
    public static void exitpt(){
        int arr[][] ={{0,0,1,1},{0,1,0,1},{0,1,1,0}};
        int dir = 0 , i =0, j=0;
        while(true){
            dir = (dir + arr[i][j])%4;
            if (dir==0){
                j++;
            }else if(dir ==1){
                i++;
            }else if(dir == 2){
                j--;
            }else{
                i--;
            }
            //exit
            if(j<0){
                j++;
                break;
            }
            else if(i<0){
                i++;
                break;
            }else if(j==arr[0].length){
                j--;
                break;
            }else if(i==arr.length){
                i--;
                break;
            }
        }
        System.out.println(i+" "+j);
    }

    public static void main(String[] args) {
        //spiral();
        exitpt();

    }
}
