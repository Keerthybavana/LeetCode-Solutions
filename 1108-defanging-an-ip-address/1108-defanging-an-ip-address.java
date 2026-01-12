class Solution {
    public String defangIPaddr(String address) {
        char[] arr=address.toCharArray();
        char[] nums=new char[arr.length+6];
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]=='.'){
                nums[j]='[';
                nums[j+1]='.';
                nums[j+2]=']';
                j+=3;
            }
            else{
                nums[j]=arr[i];
                j++;
            }
            i++;
        }
        String st=String.valueOf(nums);
        return st;
    }
}