class Solution {
    public int search(int arr[], int x) {
        // code here
        int index = 0;
        return search(arr,x,index);
        
    }
    public int search(int arr[],int target,int index){
        if(index>=arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,target,index+1);
        
    }
}
