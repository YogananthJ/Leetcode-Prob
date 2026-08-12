int differenceOfSum(int* nums, int numsSize) {
    int s1=0,s2=0;
    for(int i=0;i<numsSize;i++){
        s1+=nums[i];
        while(nums[i]!=0){
            s2+=nums[i]%10;
            nums[i]/=10;
        }
    }
    return s1-s2;
}