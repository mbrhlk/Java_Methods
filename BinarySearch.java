class BinarySearch{  
  public static void binarySearch(int arr[], int first, int last, int target){  
    int mid = (first + last)/2;  
    while( first <= last ){  
       if ( arr[mid] < target ){  
         first = mid + 1;     
       }else if ( arr[mid] == target ){  
         System.out.println("Element is found at index: " + mid);  
         break;  
       }else{  
          last = mid - 1;  
       }  
       mid = (first + last)/2;  
    }  
    if ( first > last ){  
       System.out.println("Element is not found!");  
    }  
  }  
  public static void main(String args[]){  
         int arr[] = {3,7,9,14,20,30,33,36,42};  
         int target = 36;  
         int last=arr.length-1;  
         binarySearch(arr,0,last,target);     
  }  
 }  