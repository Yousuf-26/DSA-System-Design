
/**
 * Write a description of class BinarySearch here.
 *
 * @author (YOUSUF BORNO)
 * @version (a version number or a date)
 */
public class BinarySearch
{
    //BASIC BINARY SEARCH
    //BIG O- O(LOGN)
    public static int findBinarySearch(int[] arr, int find){
    
        int start =0;
        int end= arr.length;
        int mid = start + (end -start)/2; 
        
        
        while(start <= end){
        
            if(arr[mid] == find){
                
                System.out.println("Element is found at index: "+ mid);
                return mid;
            }
            else if(arr[mid] < find){
            
                start = mid+1;
            }
            else{
            
                end= mid-1;
            }
            
            mid = start + (end -start)/2; 
        
        }
    
        return -1;
    }
    
    
    //QUESTION - FIND THE FIRST AND THE LAST INDEX OF THE REPEATED NUMBER
    //SOLUTION - FIND THE LEFTMOST INDEX OF THE NUMBER USING THE FUNCTION leftmostIndex() AND FIND THE RIGHTMOST INDEX OF THE ELEMENT USING  rightmostIndex()
    //
    public static int leftmostIndex(int[] arr, int find){
    
        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;
        int ans = -1;
        
        while(start <=end){
        
                if(arr[mid] == find){
                    ans= mid;
                    end = mid-1;
                }
                else if ( arr[mid] < find){
                    start=mid+1;
                }
                else{
                    end = mid -1;
                }
                
                mid = start + (end - start)/2;
        }
        System.out.println("Leftmost element of the searched element is: "+ans);
        return ans;
    
    }
    
    
    public static int rightmostIndex(int[] arr, int find){
    
        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;
        int ans = -1;
        
        while(start <=end){
        
                if(arr[mid] == find){
                    ans= mid;
                    start = mid+1;
                }
                else if ( arr[mid] < find){
                    start=mid+1;
                }
                else{
                    end = mid -1;
                }
                
                mid = start + (end - start)/2;
        }
        System.out.println("Rightmost element of the searched element is: "+ans);
        return ans;
    
    }
    
    //QUESTION - FIND THE OCCURENCE OF THE SAME NUMBER
    public static int occurenceOfNumber(int arr[],int find){
    
    
        int leftIndex =  leftmostIndex(arr,find);
        int rightIndex = rightmostIndex(arr,find);
        int ans = rightIndex - leftIndex +1;
        System.out.println("Occurence of the element "+find+" is: "+ans);
        return ans;
    }
    
    public static int peakElementMountainArray(int[] arr){
    
        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;
        int ans=-1;
        
        while(start<end){
        
           
            if( arr[mid] < arr[mid+1]){
                
                start =mid+1;
            }
            else{
            
                end=mid;
            }
            
           mid = (start+end)/2;
        }
        
        System.out.println("Peak element: "+end);
        
        
        return end;
    }
    
    
    
   public static void main(String args[]){
    
       int[] arr = {1,23,43,55,123,123123,12312123};
       int[] arrOne = {4,5,5,11,11,11,11,12,12};
       int[] arrTwo = {3,2,5,1};
       //int indexofElement =findBinarySearch(arr,55);
       //System.out.println(findBinarySearch(arr,123123));
       //System.out.println(leftmostIndex(arrOne,11));
       //System.out.println(rightmostIndex(arrOne,11));
       //System.out.println(occurenceOfNumber(arrOne,11));
       System.out.println(peakElementMountainArray(arrTwo));
    }
}
