/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumCount = function(nums) {
    let a=0;
    let b=0;
    nums.forEach(num=>{
        if(num<0){
            a++;
        }
        else if(num>0){
            b++;
        }
    });
    return Math.max(a,b);
};