import java.util.Scanner;
import java.text.DecimalFormat;

public class GrowArray_HW3 {
    private int arr[];   
    private int check_Grow;   
    private int arr_len;   
    public GrowArray_HW3(){   
        //Here we initialize the array , checkGrow and the arr_len.
        arr = new int[1];   
        check_Grow = 0;   
        arr_len = 1;   
        }
        //We define this function to add the specified element to the array.
        //It does not return anything but makes changes to the array.     
    public void addElement(int k){    
        if (check_Grow == arr_len){        
            sizeCheck();   
        }     
        arr[check_Grow] = k;   
        check_Grow++;   
        }
        //This function is used to check the size  of the array.
        //So if the current size of the array is 8 and only 4 elements are present,
        //then it would not increase the array size until all the 8 elements are filled.   
    public void sizeCheck(){        
        int tp[] = null;   
        if (check_Grow == arr_len){    
            tp = new int[(arr_len * 2)];   
            {   
            for (int i = 0; i < arr_len; i++){   
                tp[i] = arr[i];   
            }   
            }   
        }      
        arr = tp;   
        arr_len= (arr_len * 2);   
        }      

       
public static void main(String[] args)   
{   
    GrowArray_HW3 ga = new GrowArray_HW3();   
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    int c=scanner.nextInt();
    int intArray[] = new int[10000000];
    for(int i=0; i<c; i++){
        int d = scanner.nextInt();
        intArray[i] = d;
    }
    scanner.close();

    System.out.println();
    System.out.println();
    //Here we start counting the time
    long start = System.currentTimeMillis();
    for(int i = a; i<b+1; i++){
        ga.addElement(i);
    } 
    //In this loop we compact the array in such a way, that we do not delete any elements but compact it
    //as per our requirement
    int j = 0;
    for(int l = 0; l<c; l++){
        j = 0;
    for (int i = 0; i<ga.arr_len; i++){
        if (ga.arr[i]%intArray[l] != 0){
            ga.arr[j++] = ga.arr[i];
        }
    }
    //Here we check for the index till whhich we have to display the loop
    }    
    int p = 0;
    for (int i = 0; i<ga.arr_len; i++){
        if(ga.arr[i] >= ga.arr[i+1]){
            p = i;
            break;
        }
    }
    //Here we end the time clock so that we end up calculating the time required
    //for the algorithm to run.
    long end = System.currentTimeMillis();
    long duration = end - start;   
    System.out.printf("%d  ", p+1);

    int sum = 0;
    //This is where we calculate the sum of the required array.
    for (int i = 0; i < p+1 ; i++)   
    {   
        sum = sum + ga.arr[i];
    }  

    System.out.printf("%d  ", sum);
    DecimalFormat formatter = new DecimalFormat("#0.000000");
    System.out.print(" " + formatter.format((duration)) + " ");
 
    }
    
}
