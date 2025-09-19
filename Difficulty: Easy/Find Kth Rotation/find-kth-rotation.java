class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<=arr[end]){
            return start;
        }
        return rotatedElement(arr,start,end);
        
    }
    public int rotatedElement(int[] arr,int start,int end){
        if (start > end) return 0;
        int mid = start + (end - start)/2;
        int next = (mid + 1)%(arr.length);
        int previous = (mid + (arr.length) - 1)%(arr.length);

        if(arr[mid]<=arr[next] && arr[mid]<=arr[previous]){
            return mid;
        }
        if(arr[0]<=arr[mid]){
            return rotatedElement(arr,mid+1,end);
        }
        else{
            return rotatedElement(arr,start,mid-1);
        }
    }
}