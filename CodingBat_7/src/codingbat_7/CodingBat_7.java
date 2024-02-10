
package codingbat_7;

import java.util.Random;
import java.util.Arrays;

public class CodingBat_7 {

public static int [] nums(){
    Random rn = new Random();
    int []nums = new int[rn.nextInt(10)+1];
    
    for(int i=0;i<nums.length;i++){
        nums[i] = rn.nextInt(100)+1;
        
    }
     System.out.println(Arrays.toString(nums));
    return nums;
}

public static int sum13(int []nums){
    int sum = 0;
    
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=13){
            sum += nums[i];
        }else{
            i++;
        }
        
    }
       System.out.println("toplam: "+sum);
    
    return sum;
}
 
    public static void main(String[] args) {
        sum13(nums());
        
    }
    
}
