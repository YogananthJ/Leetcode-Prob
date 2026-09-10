/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumCount = function(nums) {
    let a=0;
    let b=0;
for(let i=0;i<nums.length;i++){
        if(nums[i]<0){
            a++;
        }
        else if(nums[i]>0){
            b++;
        }
    }
    return Math.max(a,b);
};